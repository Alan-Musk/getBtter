/**
 * @title  test_02.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午9:08:33 

 */
package chap_15;

import java.util.Scanner;

public class test_02 {
	public boolean boolPhone(String ID,String phone,String number) {
		int count=0;//判断座机号码中的-个数
		int index=0;//字符-查到的位置
		//循环查找字符-
		String newNumber=number;//防止循环修改number的值
		for (int i = 0; i <number.length(); i++) {
			index=newNumber.indexOf("-");
			if (index!=-1) {
				newNumber=newNumber.substring(index+1);
				count++;
			}
		}
		if (ID.length()==15||ID.length()==18&&phone.length()==11&&count==1&&number.indexOf("-")==4&&number.length()==12) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("******欢迎进入注册系统******");
		System.out.println();
		test_02 te=new test_02();
		String iDString;//身份证号
		String phoneString;//手机
		String numberString;//座机
		boolean b;//是否循环
		do {
			System.out.println("请输入身份证:");
			iDString=input.next();
			System.out.println("请输入手机号");
			phoneString=input.next();
			System.out.println("请输入座机号");
			numberString=input.next();
			b=te.boolPhone(iDString, phoneString, numberString);
			if (b==true) {
				System.out.println("注册不成功");
			}
		} while (b);
		System.out.println("注册成功");
	}
}
