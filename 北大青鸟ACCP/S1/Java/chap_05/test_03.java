/**
 * @title  test_03.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月8日 下午11:59:17 

 */
package chap_05;
//升级购物结算 升级了一下可以积累总金额
import java.util.Scanner;

public class test_03 {
	public static void main(String[] args) {
		String nameString="";	//初始化商品名称
		int amount=0;				//初始化购买的数量
		double money=0;			//初始化商品价格
		double discount=0.8;	//折扣比例
		double total=0;			//商品总价
		double payment=0;		//实付金额
		double payneed=0;		//应付金额
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println();
		String choose="y";//初始化boolean值
		//循环结构
		while ("y".equals(choose)) {
			System.out.println("*********************");
			System.out.println("请选择购买的商品编号");
			System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
			System.out.println("*********************");
			System.out.println("请输入商品编号");
			int num=input.nextInt();//商品编号
			System.out.println("请输入商品数量");
			amount=input.nextInt();//商品数量
			switch (num) {
			case 1:
				nameString="T恤";
				money=245.0;
				break;
			case 2:
				nameString="网球鞋";
				money=570;
				break;
			case 3:
				nameString="网球拍";
				money=320.0;
				break;
			default:
				System.out.println("请按输入正确的编号");
				break;
			}
			payneed=money*amount+total;
			total=money*amount;	
			System.out.println(nameString+"\t$"+money+"\t数量"+amount+"\t合计$"+total);
			System.out.println();
			System.out.println("是否继续(y/n)");
			choose=input.next();
		}
		System.out.println("折扣:"+discount);
		System.out.println("应付金额:"+payneed*discount);
		System.out.println("实付金额:");
		payment=input.nextDouble();
		System.out.println("找钱:"+(payment-payneed*0.8));
		System.out.println("程序结束");
	}
}
