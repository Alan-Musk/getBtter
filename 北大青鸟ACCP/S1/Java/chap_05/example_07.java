/**
 * @title  example_07.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月9日 上午1:34:42 

 */
package chap_05;

import java.util.Scanner;

public class example_07 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String answerString="";
		do {
			System.out.println("上机编写程序");
			System.out.println("合格了吗?(y/n)");
			answerString=input.next();
			
		} while (!"y".equals(answerString));
		System.out.println("通过了测试");
	}
}
