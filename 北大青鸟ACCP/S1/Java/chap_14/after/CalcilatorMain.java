/**
 * @title  CalcilatorMain.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午4:19:45 

 */
package after;

import java.util.Scanner;

//计算器类的main
public class CalcilatorMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator calculator=new Calculator();
		System.out.println("请选择运算:1.加法2.减法3.乘法4.除法");
		int choic=input.nextInt();//运算
		System.out.println("请输入第一个数");
		int a=input.nextInt();
		System.out.println("请输入第二个数");
		int b=input.nextInt();
		int sum=0;//初始化总和
		switch (choic) {
		case 1:
			System.out.println(calculator.add(a, b, sum));
			break;
		case 2:
			System.out.println(calculator.minus(a, b, sum));
			break;
		case 3:
			System.out.println(calculator.multiple(a, b, sum));
			break;
		case 4:
			System.out.println(calculator.divide(a, b, sum));
			break;
		default:
			System.out.println("输入有误");
			break;
		}
	}
}
