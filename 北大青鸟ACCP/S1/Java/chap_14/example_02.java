/**
 * @title  example_02.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午12:15:54 

 */
package chap_14;

import java.util.Scanner;

public class example_02 {
	public static void main(String[] args) {
		example_01 example_01=new example_01();
		Scanner input = new Scanner(System.in);
		//输入
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入学生姓名:");
			String newNameString=input.next();
			example_01.addName(newNameString,i);//调用方法并传实参
		}
		//输出
		example_01.showNames();
		//调用searchname
		System.out.println("\n请输入开始查找的位置:");
		int s=input.nextInt();
		System.out.println("请输入结束查找的而为之:");
		int e=input.nextInt();
		System.out.println("请输入查找的名字:");
		String nameString=input.next();
		if (example_01.searchName(s, e, nameString)) {
			System.out.println("找到了");
		}else {
			System.out.println("没找到");
		}
	}
}
