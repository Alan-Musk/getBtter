/**
 * @title  after_03.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 下午12:28:45 

 */
package chap_15;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class after_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户的身份证号码:");
		String birthday=input.next();
		System.out.println("该用户生日是:"+birthday.substring(6,10)+"年"+birthday.substring(10,12)+"月"+birthday.substring(12,14)+"日");
		
	}
}
