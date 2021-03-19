/**
 * @title  after_02.java 

 * @package chap_07 

 * @author alan

 * @date 2021年3月10日 上午3:27:30 

 */
package chap_07;
//输出100中所有不能被7整除的数
public class after_02 {
	public static void main(String[] args) {
		int num=0;//个数
		int sum=0;//总和
		System.out.println("1-100之间不能被7整除的数据为:");
		for (int i = 0; i <=100; i++) {
			if (i%7!=0) {
				System.out.print(i+"\t");
				num++;
				if (num%4==0) {
					System.out.println();
				}
			}
			
		}
	}
}
