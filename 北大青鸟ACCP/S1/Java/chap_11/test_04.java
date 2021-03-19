/**
 * @title  test_03.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月14日 下午2:19:59 

 */
package chap_11;

import java.util.Scanner;

//创建管理员对象
public class test_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		test_AdminStrator adminStrator=new test_AdminStrator();//创建对象
		adminStrator.nameString="admin";
		adminStrator.pwString="1111111";
		adminStrator.show();
		//输入旧的用户名和密码
		System.out.println("请输入用户名:");
		String nameInputString=input.next();
		System.out.println("请输入密码:");
		String pwInputString=input.next();
		if (!nameInputString.equals(adminStrator.nameString)&&!pwInputString.equals(adminStrator.pwString)) {
			System.out.println("用户名和密码不匹配!您没有权限更新管理员信息");
		}else {
			System.out.println("请输入新密码:");
			adminStrator.pwString=input.next();
			System.out.println("修改密码成功,您的新密码是:"+adminStrator.pwString);
		}
	}
}
