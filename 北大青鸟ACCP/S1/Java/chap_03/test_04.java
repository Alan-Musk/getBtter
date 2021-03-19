/**
 * @title  test_04.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月6日 下午11:18:01 

 */
package chap_03;
//计算会员折扣
import java.util.Scanner;

public class test_04 {
	public static void main(String[] args) {
		System.out.println("请输入会员积分");
		Scanner inputScanner=new Scanner(System.in);
		int score=inputScanner.nextInt();
		if (score>=2000) {
			if (score>=4000) {
				if (score>=8000) {
					System.out.println("该会员享受的折扣是:0.6");
				} else {
					System.out.println("该会员享受的折扣是:0.7");
				}
			} else {
				System.out.println("该会员享受的折扣是:0.8 ");
			}
		} else {
			System.out.println("该会员享受的折扣是:0.9 ");
		}
	}
}
