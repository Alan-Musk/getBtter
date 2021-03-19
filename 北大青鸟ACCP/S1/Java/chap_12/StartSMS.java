/**
 * @title  StartSMS.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午2:09:40 

 */
package chap_12;
//test_04
import java.util.Scanner;

public class StartSMS {
	String name;
	/**
	 * 获取用户名
	 * return name
	 */
	public String reNameString() {
		System.out.println("请输入用户名");
		Scanner input = new Scanner(System.in);
		name=input.next();
		return name;
	} 
	/**
	 * 获取密码
	 * return name
	 */
	public String rePwString() {
		System.out.println("请输入密码");
		Scanner input = new Scanner(System.in);
		String pw=input.next();
		return pw;
	}
}
