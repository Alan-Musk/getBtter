/**
 * @title  test_04.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午5:25:11 

 */
package chap_06;

import java.util.Scanner;

//验证用户登录信息
public class test_04 {
	public static void main(String[] args) {
		String userIdString="jim";//用户账号
		int userPw=123456;//用户密码
		Scanner input = new Scanner(System.in);
		for (int i = 3; i >0; i--) {
			System.out.println("请输入用户名");
			userIdString=input.next();
			System.out.println("请输入密码:");
			userPw=input.nextInt();
			if (userIdString.equals("jim")&&userPw==123456) {
				System.out.println("欢迎登录MyShopping系统");
				break;
			}else {
				System.out.println("输入错误,您还有"+(i-1)+"次机会");
				if (i<=1) {
					System.out.println();
					System.out.println("对不起,您3次均输入错误!");
				}
				continue;
			}
		}
		
	}
}
