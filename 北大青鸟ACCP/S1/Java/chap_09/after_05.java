/**
 * @title  after_05.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午11:55:19 

 */
package chap_09;

import java.util.Scanner;

public class after_05 {
	public static void main(String[] args) {
		//判断输入是否是奇数
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入棱形的行数");
		 int rows=input.nextInt();
		 while (rows%2==0) {
			System.out.println("请输入奇数:");
			rows=input.nextInt();
		}
		 //上半部分
		 int n=(rows+1)/2;
		 for (int i = 1; i<=n; i++) {
			 //空白
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//*号
			for (int w = 1; w <=2*i-1; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 //下半部分
		 for (int i = 1; i <n; i++) {
			 //空白
			 for (int w = 0; w <=i-1; w++) {
					System.out.print(" ");
				}
			 for (int j=1; j<=rows-2 * i; j++) {
					System.out.print("*");
					
				}
			 System.out.println();
		}
	}
}
