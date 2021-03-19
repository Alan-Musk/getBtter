/**
 * @title  TestCal.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午2:15:25 

 */
package chap_14;

import java.util.Scanner;

//example_04实现类
public class TestCal {
	public static void main(String[] args) {
		example_04 example_04=new example_04();
		int[] scores=new int[5];//保存比赛成绩
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5名参赛者的成绩");
		for (int i = 0; i < scores.length; i++) {//循环接收成绩
			scores[i]=input.nextInt();
		}
		//输出平均成绩
		double avgScore=example_04.calAvg(scores);
		System.out.println("平均成绩:"+avgScore);
		//输出最高成绩
		int maxScore=example_04.calMax(scores);
		System.out.println("最高成绩"+maxScore);
	}
}
