/**
 * @title  example_06.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月4日 下午10:37:02 

 */
package chap_02;

import java.util.Scanner;

public class example_06 {
	public static void main(String[] args) {
		int liSi=80; //学员李四的成绩
		boolean isBig;//声明一个boolean类型的变量
		Scanner input=new Scanner(System.in);
		System.out.println("输入学员张三的成绩:");
		int zhangSan=input.nextInt();
		isBig=zhangSan>liSi;//将比较结果保存在boolean变量中
		System.out.println("张三成绩比李四高吗?"+isBig);//输入比较结果
	}
}
   