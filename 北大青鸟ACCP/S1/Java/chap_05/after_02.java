/**
 * @title  after_02.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月9日 上午4:57:46 

 */
package chap_05;
//使用do-while结构,实现计算1-50中是7的倍数的数值之和并输出
public class after_02 {
	public static void main(String[] args) {
		int num=0;//数
		int sum=0;//总和
		do {
			if (num%7==0) {
				sum=sum+num;
			}
			num++;	
		} while (num<=50);
		System.out.println(sum);
	}
}
