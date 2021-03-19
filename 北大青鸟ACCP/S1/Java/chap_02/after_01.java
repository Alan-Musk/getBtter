package chap_02;
import java.util.Scanner;

/**
 * @title  after_01.java 

 * @package  

 * @author alan

 * @date 2021年3月5日 上午11:04:12 

 */

public class after_01 {
	public static void main(String[] args) {
		int let=10;
		int right=8;
		System.out.println("输出互换前手中的纸牌");
		System.out.println("左"+let);
		System.out.println("右"+right);
		int middle=let;
		let=right;
		right=middle;
		System.out.println("输出互换后手中的纸牌");
		System.out.println("左"+let);
		System.out.println("右"+right);	
	}
}
