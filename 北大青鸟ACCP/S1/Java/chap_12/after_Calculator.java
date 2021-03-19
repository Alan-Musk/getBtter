/**
 * @title  after_Calculator.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午3:22:04 

 */
package chap_12;

import java.util.Scanner;

public class after_Calculator {
	int num1;
	int num2;
	String signString;
	//计算
	public void count() {
		System.out.println("请输入第一个运算数");
		Scanner input = new Scanner(System.in);
		num1=input.nextInt();
		System.out.println("请输入第二个运算数");
		num1=input.nextInt();
		System.out.println("请输入要进行的运算");
		signString=input.next();
		switch (signString) {
		case "+":
			add();
			break;
		case "-":
			minus();
			break;
		case "*":
			multiple();
			break;
		case "/":
			divide();
			break;
		}
	}
	//加法
	public void add() {
		System.out.println(num1+num2);
	}
	//减法
	public void minus() {
		System.out.println(num1-num2);
	}
	//乘法
	public void multiple() {
		System.out.println(num1*num2);
	}
	//除法
	public void divide() {
		System.out.println(num1/num2);
	}
}
