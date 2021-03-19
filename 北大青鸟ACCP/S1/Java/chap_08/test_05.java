/**
 * @title  test_05.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月12日 下午1:31:01 

 */
package chap_8;

import java.util.Arrays;
import java.util.Scanner;

//求商品最低价格
public class test_05 {
	public static void main(String[] args) {
		System.out.println("请输入四家店的价格:");
		Scanner input = new Scanner(System.in);
		//输入数据
		int[] money=new int[4];
		for (int i = 0; i < money.length; i++) {
			System.out.println("第"+(i+1)+"家店的价格:");
			money[i]=input.nextInt();
		}
		//数组升序
		Arrays.sort(money);;
		System.out.println("最低的价格是:");
		System.out.println(money[0]);
	}
}
