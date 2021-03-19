/**
 * @title  test_04.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午7:05:47 

 */
package chap_09;

import java.util.Scanner;

//打印等腰三角形
public class test_04 {
	public static void main(String[] args) {
		System.out.println("请输入等腰三角形的行数:");
		Scanner input = new Scanner(System.in);
		int row=input.nextInt();//输入的行数
		for (int i = 1; i <=row; i++) {
			//输出空白
			for (int j = 0; j <=row-i; j++) {
				System.out.print(" ");
			}
			//输出※
			for (int w = 1; w <=2*i-1; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
