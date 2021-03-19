/**
 * @title  example_04.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月17日 下午7:15:49 

 */
package chap_15;

import java.util.Scanner;

public class example_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nameString,pwString;
		System.out.println("请输入用户名");
		nameString=input.next();
		System.out.println("请输入密码");
		pwString=input.next();
		if (nameString.equalsIgnoreCase("TOM")&&pwString.equalsIgnoreCase("1234567")) {
			System.out.println("登录成功");
		}else {
			System.out.println("用户名或密码不匹配.登录失败");
		}
	}
}
