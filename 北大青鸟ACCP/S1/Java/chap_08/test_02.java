/**
 * @title  test_02.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月11日 下午7:54:07 

 */
package chap_8;

import java.util.Scanner;

//购物金额结算
public class test_02 {
	public static void main(String[] args) {
		double[] shopping=new double[5];//定义消费金额数组
		double sum=0;//消费总和
		System.out.println("请输入会员本月的消费金额");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < shopping.length; i++) {
			System.out.println("请输入第"+(i+1)+"笔购物金额:");
			shopping[i]=input.nextDouble();
			sum=shopping[i]+sum;
		}
		System.out.println("序号\t金额(元)");
		for (int i = 0; i < shopping.length; i++) {
			System.out.println((i+1)+"\t"+shopping[i]);
		}
		System.out.println("总金额\t"+sum);
	}
}
