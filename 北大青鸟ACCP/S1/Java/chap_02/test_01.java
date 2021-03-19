/**
 * @title  test_01.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月4日 下午10:41:22 

 */
package chap_02;

public class test_01 {
	public static void main(String[] args) {
		int shirtPrice=245;
		int shoePrice=570;
		int padPrice=320;
		int shirtNo=2;
		int shoeNo=1;
		int padNo=1;
		double discount=0.8;
		double finalPay=(shirtNo*shirtPrice+shoeNo*shoePrice+padNo*padPrice)*discount;
		System.out.println("消费总金额:"+finalPay);
	}
}
