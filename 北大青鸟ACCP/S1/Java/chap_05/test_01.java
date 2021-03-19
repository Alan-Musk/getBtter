/**
 * @title  test_01.java 

 * @package chap_05 

 * @author alan

 * @date 2021年3月8日 下午10:36:46 

 */
package chap_05;
//计算100以内的偶数和
public class test_01 {
	public static void main(String[] args) {
		int num=0;//加数
		int sum=0;//总数
		while (num<=100) {
			sum=sum+num;//累加
			num=num+2;
		}
		System.out.println(sum);
	}
}
