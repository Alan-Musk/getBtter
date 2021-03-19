/**
 * @title  example_01.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月17日 下午7:08:30 

 */
package chap_15;

import java.util.Scanner;

public class example_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nameString,pwString;
		System.out.println("请输入用户名");
		nameString=input.next();
		System.out.println("请输入密码");
		pwString=input.next();
		if (pwString.length()>=6) {
			System.out.println("注册成功");
		}else {
			System.out.println("密码长度不能小于6位");
		}
		
	}
}
