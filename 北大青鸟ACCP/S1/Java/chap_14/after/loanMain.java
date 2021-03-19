/**
 * @title  loanMain.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午4:30:27 

 */
package after;

import java.util.Scanner;

public class loanMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		loan loan=new loan();
		int moons=1;//初始化,不为0防报错
		System.out.println("请输入贷款的金额:");
		double money=input.nextDouble();
		System.out.println("请选择贷款年限:1.3年(36个月)2.5年(60个月)3.20年(240个月):");
		int choice=input.nextInt();
		switch (choice) {
		case 1:
			moons=36;
			break;
		case 2:
			moons=60;
			break;
		case 3:
			moons=240;
			break;
		default:
			System.out.println("您好,您的输入有误");
			break;
		}
		System.out.println("月供:"+loan.loan(money, moons));
	}
}
