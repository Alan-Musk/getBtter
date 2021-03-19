/**
 * @title  test_02.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午1:56:10 

 */
package chap_06;

import java.util.Scanner;

//统计顾客的年龄层次
public class test_02 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		int age=0;//年龄
		int young=0;//30岁以下的人数
		for (int i = 0; i <10; i++) {
			System.out.println("请输入第"+(i+1)+"位顾客的年龄:");
			age=inputScanner.nextInt();
			if (age<=30) {
				young++;
			}
		}
		System.out.println("30岁以下的比例是:"+(young*10)+"%");
		System.out.println("30岁以上的比例是:"+(100-young*10)+"%");

	}
}
