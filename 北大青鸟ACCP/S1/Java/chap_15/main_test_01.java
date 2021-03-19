/**
 * @title  main_test_01.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月17日 下午8:19:02 

 */
package chap_15;

import java.util.Scanner;

public class main_test_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		test_01 te=new test_01();
		String name;//用户名
		String pw;//密码
		String pwAgainString;//重复密码
		boolean b=false;
		System.out.println("****欢迎进入注册系统*****\n");
		do {
			System.out.println("请输入用户名");
			name=input.next();
			System.out.println("请输入密码:");
			pw=input.next();
			System.out.println("请再次输入密码:");
			pwAgainString=input.next();
			b=te.newUser(name, pw, pwAgainString);
		} while (b);
		System.out.println("注册成功");
	}
}
