/**
 * @title  test_06.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午8:34:35 

 */
package chap_09;

import java.util.Scanner;

//统计打折商品的数量
public class test_06 {
	public static void main(String[] args) {
		 int[] people=new int[3];//顾客数量
		 int[] thing=new int[3];//购买的数量
		 Scanner input = new Scanner(System.in);
		 int count=0;//八折的数量
		 for (int i = 0; i < people.length; i++) {
			 count=0;//数量归零
			System.out.println("请输入第"+(i+1)+"个人所购的三件商品的价格");
			for (int j = 0; j < thing.length; j++) {
				double money=input.nextDouble();
				if (money<300) {
					continue;
				}
				count++;
			}
			System.out.println("第"+(i+1)+"个人共有"+count+"件商品享受八折");
		}
		 
	}
}
