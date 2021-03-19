/**
 * @title  test_02.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午6:39:18 

 */
package chap_09;

import java.util.Scanner;

//输入行数,打印直角三角形
public class test_02 {
	public static void main(String[] args) {
		System.out.println("请输入直角三角形的行数:");
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		for (int i = 0; i <=num; i++) {
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
