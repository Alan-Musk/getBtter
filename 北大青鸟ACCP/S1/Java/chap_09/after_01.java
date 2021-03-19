/**
 * @title  after_01.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午11:13:03 

 */
package chap_09;

import java.util.Scanner;

public class after_01 {
	public static void main(String[] args) {
		System.out.println("请输入图案的行数");
		Scanner input = new Scanner(System.in);
		int row=input.nextInt();
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
