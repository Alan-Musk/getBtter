/**
 * @title  befor_02.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月5日 下午4:19:45 

 */
package chap_03;

import java.util.Scanner;

public class befor_02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入自己的年龄");
		int age=input.nextInt();
		if (age>=18) {
			System.out.println("我是成年人,可以为爸爸妈妈遮风挡雨啦");
		} else {
			System.out.println("我还需要爸爸妈妈的呵护哦!");
		}
	}
}
