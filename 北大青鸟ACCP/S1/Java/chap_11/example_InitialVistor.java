/**
 * @title  example_InitialVistor.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月14日 下午2:04:39 

 */
package chap_11;

import java.util.Scanner;

public class example_InitialVistor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		example_Visitor vistor=new example_Visitor();
		System.out.println("请输入姓名:");
		vistor.nameString=input.next();
		System.out.println("请输入年龄:");
		vistor.age=input.nextInt();//给age属性赋值
		vistor.show();//调用显示方法
	}
}
