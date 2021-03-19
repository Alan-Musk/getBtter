/**
 * @title  after_05.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 下午2:23:46 

 */
package chap_15;

import java.util.Scanner;

public class after_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag=false;
		do {
			System.out.println("请输入会员生日<月/日:00/00>:");
			String birthday=input.next();
			if (birthday.indexOf("/")!=2) {
				System.out.println("生日输入错误");
				flag=true;
				continue;
			}else {
				System.out.println(birthday);
				flag=false;
			}
		} while (flag);
		do {
			System.out.println("请输入会员密码:");
			String pw=input.next();
			if (pw.length()<6||pw.length()>10) {
				System.out.println("密码输入错误");
				flag=true;
				continue;
			}else {
				System.out.println("密码为"+pw);
				flag=false;
			}
		} while (flag);
	}
}
