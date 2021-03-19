/**
 * @title  after_04.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 下午1:39:54 

 */
package chap_15;

import java.util.Scanner;

public class after_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一段字符");
		String st=input.next();
		System.out.println("请输入要查询的字符串");
		String search=input.next();
		//将字符串挨个拆分,放入数组
		 char[] temp=st.toCharArray();//网上查的,分隔单个字符,书上教材是有问题吗split方法说是可选的,可以自己分割成单个字符,
		 for (int i = 0; i < temp.length; i++) {
			if (String.valueOf(temp[i]).equals(search)) {
				System.out.println(i);
			}
		}
	}
}
