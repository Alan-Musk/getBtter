/**
 * @title  after_02.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午11:31:24 

 */
package chap_15;

import java.util.Scanner;

public class after_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入任意一个姓名:");
		String nameString=input.next();
		System.out.println();
		String firString=nameString.substring(0,1);
		String secondString=nameString.substring(1);
		System.out.println("姓氏:"+firString);
		System.out.println("名字:"+secondString);
	}
}