/**
 * @title  test_01.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午1:52:21 

 */
package chap_06;
//计算100以内的奇数的和
public class test_01 {
	public static void main(String[] args) {
		int num=1;//当前加数
		int sum=0;//总和
		for (; num<=100;) {
			sum=sum+num;//计算总和
			num=num+2;//始终为奇数
		}
		System.out.println(sum);
	}
}
