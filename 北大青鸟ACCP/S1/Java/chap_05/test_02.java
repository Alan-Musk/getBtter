/**
 * @title  test_02.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月8日 下午10:42:24 

 */
package chap_05;
//查询商品价格
import java.util.Scanner;

public class test_02 {
	public static void main(String[] args) {
		String nameString="";//初始化商品名称
		double money=0;//初始化商品价格
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
			System.out.println(nameString+"\t$"+money);
			System.out.println();
			System.out.println("是否继续(y/n)");
			choose=input.next();
		}
		System.out.println("程序结束");
	}
}
