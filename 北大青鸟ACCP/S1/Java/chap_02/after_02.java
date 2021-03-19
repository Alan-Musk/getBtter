/**
 * @title  after_02.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月5日 上午11:30:13 

 */
package chap_02;

import java.util.Scanner;

public class after_02 {
	public static void main(String[] args) {
		System.out.println("请输入要转换的华氏温度");
		Scanner inputScanner=new Scanner(System.in);
		double Fahrenheit=inputScanner.nextDouble();
		double Celsius=5/9.0*(Fahrenheit-32);
		System.out.println("摄氏度为"+Celsius);
	}
}
