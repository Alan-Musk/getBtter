/**
 * @title  example_05.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月8日 下午5:16:25 

 */
package chap_05;

import java.util.Scanner;

public class example_05 {
	public static void main(String[] args) {
		String answerString;//标识是否合格
		Scanner input=new Scanner(System.in);
		System.out.println("合格了吗?(y/n):");
		answerString=input.next();
		while (!"y".equals(answerString)) {
			System.out.println("上午阅读教材");
			System.out.println("下午上机编程\n");
			System.out.println("合格了吗?(y/n):");
			answerString=input.next();
		}
		System.out.println("完成学习任务");
	}
}
