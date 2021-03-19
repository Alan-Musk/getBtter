/**
 * @title  before_01.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月5日 下午4:04:30 

 */
package chap_03;

import java.util.Scanner;

public class before_01 {
    public static void main(String[] args) {
		System.out.println("请输入整数");
		Scanner inputScanner=new Scanner(System.in);
		int num=inputScanner.nextInt();
		if(num>=20){
			num--;
			System.out.println("num="+num);
		}else {
			num++;
			System.out.println("num="+num);
		}
	}
}
