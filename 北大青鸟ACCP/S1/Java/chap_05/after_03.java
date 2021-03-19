/**
 * @title  after_03.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月9日 上午5:04:19 

 */
package chap_05;

import java.util.Scanner;

//接受一批整数,比较最大小值
public class after_03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int max;//最大值
		int min;//最小值
		System.out.println("请输入一个整数(输入0结束):");
		int num=input.nextInt();//值不确定
		min=max=num;
		while (num!=0) {
			System.out.println("请输入一个整数(输入0结束):");
			num=input.nextInt();//变化,不确定
			if (num!=0&&num>max) {
				max=num;
			} else if(num!=0&&num<min){
				min=num;
			}
		}
		System.out.println("最大值:"+max);
		System.out.println("最小值:"+min);
	}
}
