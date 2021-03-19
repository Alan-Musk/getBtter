/**
 * @title  after_04.java 

 * @package chap_04 

 * @author alan

 * @date 2021年3月7日 下午8:51:49 

 */
package chap_04;

import java.util.Scanner;

//实现迷你计算器功能
public class after_04 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		double first=0;//第一个输入的数字
		double second=0;	//第二个输入的数字
		double num=0;	//总和
		//选择两个数字
		System.out.println("请输入第一个数字");
		if (inputScanner.hasNextDouble()==true) {
			first=inputScanner.nextDouble();
			System.out.println("请输入第二个数字");
			second=inputScanner.nextDouble();
		} else {
			System.out.println("请输入正确的的数字");
		}
		//switch选择计算种类
		System.out.println("请选择要进行的计算功能");
		String calculatorString=inputScanner.next();
		switch (calculatorString) {
		case "+":
			num=first+second;
			break;
		case "-":
			num=first-second;
			break;
		case "/":
			num=first/second;
			break;
		case "*":
			num=first*second;
			break;
		default:
			System.out.println("请按运算法则输入");
			break;
		}
		//输出
		System.out.println(num);
	}
}
