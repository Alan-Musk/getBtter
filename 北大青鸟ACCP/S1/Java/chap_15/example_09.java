/**
 * @title  example_09.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午9:59:13 

 */
package chap_15;

import java.util.Scanner;

public class example_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//接收数字串,存放于StrinBuffer类型对象中
		System.out.println("请输入一串数字");
		String numString=input.next();
		StringBuffer stringBuffer=new StringBuffer(numString);
		//从后往前每个三位添加逗号
		for (int i =stringBuffer.length()-3; i>0; i=i-3) {
			stringBuffer.insert(i, ",");
		}
		System.out.println(stringBuffer);
	}
}
