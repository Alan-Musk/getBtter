/**
 * @title  test_03.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午9:45:44 

 */
package chap_15;

import java.util.Scanner;

public class test_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String st=input.next();
		System.out.println("请输入要查找的字符");
		String searchString=input.next();
		int count=0;//判断字符串个数
		int index=0;//查到的位置
		//循环查找字符
		String newNumber=st;//防止循环修改number的值
		for (int i = 0; i <st.length(); i++) {
			index=newNumber.indexOf(searchString);
			if (index!=-1) {
				newNumber=newNumber.substring(index+1);
				count++;
			}
		}
		System.out.println(st+"中包含"+count+"个"+searchString);
	}
}
