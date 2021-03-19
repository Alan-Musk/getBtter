/**
 * @title  Mainprint.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午4:52:30 

 */
package after;

import java.util.Scanner;

public class Mainprint {
	public static void main(String[] args) {
		printTriangle printTriangle=new printTriangle();
		Scanner input = new Scanner(System.in);
		System.out.println("输入行高");
		int row=input.nextInt();
		System.out.println("输入打印的字符:");
		String ch=input.next();
		printTriangle.Tringle(row, ch);
	}
}
