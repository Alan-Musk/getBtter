/**
 * @title  test_02.java 

 * @package chap_04 

 * @author alan

 * @date 2021年3月7日 下午4:04:28 

 */
package chap_04;

import java.util.Scanner;

//实现换购的功能
public class test_02 {
	public static void main(String[] args) {
		Scanner inpuScanner=new Scanner(System.in);
		System.out.println("请输入消费金额");
		if (inpuScanner.hasNextDouble()==true) {
			double money=inpuScanner.nextDouble();//消费金额
			String thingString=null;
			//输出策划
			System.out.println("是否参与优惠换购活动");
			System.out.println("1:满50元,加2元换购百世可乐饮料1瓶");
			System.out.println("2:满100元,加3元换购500毫升可乐一瓶");
			System.out.println("3:满100元,加10元换购5公斤面粉");
			System.out.println("4:满200元,加10元换购1个苏泊尔炒菜锅");
			System.out.println("5:满200元,加20元换购欧莱雅爽肤水一瓶");
			System.out.println("0:不换购");
			System.out.println("请选择:");
			int choose=inpuScanner.nextInt();
			//switch结构
			switch (choose) {
			case 1:
				if (money>=50) {
					money=money+2;
					thingString="百世可乐一瓶";
				} else {
					System.out.println("您的消费金额不足,请重新选择");
					thingString="无";

				}
				break;
			case 2:
				if (money>=100) {
					money=money+3;
					thingString="500毫升可乐一瓶";
				} else {
					System.out.println("您的消费金额不足,请重新选择");
					thingString="无";

				}
				break;
			case 3:
				if (money>=100) {
					money=money+10;
					thingString="5公斤面粉";
				} else {
					System.out.println("您的消费金额不足,请重新选择");
					thingString="无";

				}
				break;
			case 4:
				if (money>=200) {
					money=money+10;
					thingString="苏泊尔炒菜锅";
				} else {
					System.out.println("您的消费金额不足,请重新选择");
					thingString="无";

				}
				break;
			case 5:
				if (money>=200) {
					money=money+20;
					thingString="欧莱雅爽肤水一瓶";
				} else {
					System.out.println("您的消费金额不足,请重新选择");
					thingString="无";
				}
				break;
			default:
				System.out.println("感谢您使用本产品");
				break;
			}
			System.out.println("本次消费总金额:"+money);
			System.out.println("成功换购:"+thingString);
		} else {
			System.out.println("输入有误,请输入数字");
		}
		
	}
}
