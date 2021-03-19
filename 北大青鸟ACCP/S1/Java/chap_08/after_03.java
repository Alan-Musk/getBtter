/**
 * @title  after_03.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月12日 下午4:29:59 

 */
package chap_8;

import java.util.Scanner;

//键盘上输入10个整数	
public class after_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10个数");
		//写的不好,自习室有人说话,难受,只能浅层一点,不知道能不能耦合度更低
		int sum1=0;//1
		int sum2=0;//2
		int sum3=0;//3
		int sumOther=0;//非法数字
		int[] nums=new int[10];//存储用户输入的数字
		int[] count=new int[4];//存储三个合法数字和非法数字的个数
		
		for (int i = 0; i < nums.length; i++) {
			int userNum=input.nextInt();
			switch (userNum) {
			case 1:
				nums[i]=userNum;
				sum1++;
				break;
			case 2:nums[i]=userNum;
			sum2++;

			break;
			case 3:
				nums[i]=userNum;
				sum3++;

				break;
			default:
				count[i]=userNum;
				sumOther++;
				break;
			}
		}
		System.out.println("数字1的个数:"+sum1);
		System.out.println("数字2的个数:"+sum2);
		System.out.println("数字3的个数:"+sum3);
		System.out.println("非法字符是:"+sumOther);
	}
}
