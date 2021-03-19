/**
 * @title  example_02.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月5日 下午5:40:11 

 */
package chap_03;

public class example_02 {
	public static void main(String[] args) {
		int score1=100;//张浩的java成绩
		int score2=72;//张浩的音乐成绩
		if((score1>98&&score2>80)||(score1==100&&score2>=70)){
			System.out.println("老师说:不错,奖励一个Mp4");
		}
	}
}
