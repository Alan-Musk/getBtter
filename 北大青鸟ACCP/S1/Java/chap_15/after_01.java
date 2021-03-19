/**
 * @title  after_01.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午11:18:58 

 */
package chap_15;

import java.util.Arrays;
import java.util.Scanner;

public class after_01 {
	public static void main(String[] args) {
		String[] fruitString=new String[5];
		Scanner input = new Scanner(System.in);
		String fruit;//水果名称
		for (int i = 0; i < fruitString.length; i++) {
			System.out.println("请输入第"+(i+1)+"种水果");
			fruit=input.next();
			fruitString[i]=fruit;
		}
		Arrays.sort(fruitString);
		for (int i = 0; i < fruitString.length; i++) {
			System.out.println(fruitString[i]);
		}
	}
}
