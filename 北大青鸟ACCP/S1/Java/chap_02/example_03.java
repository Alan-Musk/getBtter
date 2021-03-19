/**
 * @title  example_03.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月4日 下午10:02:16 

 */
package chap_02;

import java.util.Scanner;

public class example_03 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("STB的成绩是");
		int stb=inputScanner.nextInt();
		System.out.println("Java的成绩是");
		int java=inputScanner.nextInt();
		System.out.println("SQL的成绩是");
		int sql=inputScanner.nextInt();
		int diffen;//分数差
		double avg;//平均分
		System.out.println("--------------");
		System.out.println("STB\tJava\tSQL");
		System.out.println(stb+"\t"+java+"\t"+sql);
		System.out.println("--------------");
		diffen=java-sql; //计算java和sql的分数差
		System.out.println("Java和SQL的分数差:"+diffen);
		avg=(stb+sql+java)/3;//计算平均分
		System.out.println("3门课的平均分是"+avg);
	}
}
