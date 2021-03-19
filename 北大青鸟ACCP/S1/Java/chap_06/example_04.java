/**
 * @title  example_04.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午1:46:01 

 */
package chap_06;

import java.util.Scanner;

public class example_04 {
	public static void main(String[] args) {
		System.out.println("请输入一个值:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for (int i = 0,j=num; i <= num; i++,j--) {
			System.out.println(i+"+"+j+"="+(i+j));
		}
	}
}
