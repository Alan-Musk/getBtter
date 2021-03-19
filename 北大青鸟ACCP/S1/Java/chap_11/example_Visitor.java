/**
 * @title  example_Visitor.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月13日 下午10:11:41 

 */
package chap_11;

import java.util.Scanner;

public class example_Visitor {
	String nameString;//姓名
	int age;//年龄
	/**
	 * 显示信息的方法
	 */
	public void show() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while (!"n".equals(nameString)) {
			if (age>=18&&age<=60) {
				//判断年龄
				System.out.println(nameString+"的年龄为:"+age+",门票价格为:20元\n");
			} else {
				System.out.println(nameString+"的年龄为:"+age+",门票免费\n");
			}
			System.out.println("请输入姓名:");
			nameString=input.next();//给name属性赋值
			if (!"n".equals(nameString)) {
				System.out.println("请输入年龄:");
				age=input.nextInt();
				
			}
		}
		System.out.println("退出程序");
	}
	
}
