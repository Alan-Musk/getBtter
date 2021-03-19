/**
 * @title  test_03.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午6:43:39 

 */
package chap_09;

import java.util.Scanner;

//打印倒直角三角形
public class test_03 {
	public static void main(String[] args) {
		System.out.println("请输入直角三角形的行数:");
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		for (int i = 0; i <=num; i++) {
			for (int j =0; j <num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
