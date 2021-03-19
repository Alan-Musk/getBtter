/**
 * @title  example_06.java 

 * @package chap_03 

 * @author alan

 * @date 2021年3月6日 下午12:17:23 

 */
package chap_03;

public class example_06 {
	public static void main(String[] args) {
		int money=52;//我的存款,单位万元
		if (money>=500) {
			System.out.println("太好了我可以买一辆凯迪拉克");
		}else if (money>=100) {
			System.out.println("不错,我可以买辆帕萨特");
		}else if (money>=50) {
			System.out.println("我可以买辆伊兰特");
		}else if (money>=10) {
			System.out.println("我至少可以买辆奥拓");
		}else {
			System.out.println("看来,我只能买辆捷安特了");
		}
	}
}
