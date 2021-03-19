/**
 * @title  test_02.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月5日 上午10:07:50 

 */
package chap_02;

public class test_02 {
	public static void main(String[] args) {
		int shirtPrice=245;//T恤的单价
		int shoePrice=570;//网球鞋的单价
		int padPrice=320;//网球拍的单价
		int shirtNo=2;//T恤的数量
		int shoeNo=1;//网球鞋的数量
		int padNo=1;//网球拍的数量
		double discount=0.8;//折扣
		double finalPay=(shirtNo*shirtPrice+shoeNo*shoePrice+padNo*padPrice)*discount;//总消费
		int score=(int)finalPay*3/100;//积分
		double money=1500;//实际缴费
		System.out.println("***********消费单**********");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t$"+shirtPrice+"\t"+shirtNo+"\t$"+shirtNo*shirtPrice);
		System.out.println("网球鞋\t$"+shoePrice+"\t"+shoeNo+"\t$"+shoeNo*shoePrice);
		System.out.println("网球拍\t$"+padPrice+"\t"+padNo+"\t$"+padNo*padPrice);
		System.out.println("折扣\t"+discount);
		System.out.println("消费总金额:  $"+finalPay);
		System.out.println("实际交费    $"+money);
		System.out.println("找钱      $"+(money-finalPay));
		System.out.println("本次购物所获的积分是:"+score);
	}
}
