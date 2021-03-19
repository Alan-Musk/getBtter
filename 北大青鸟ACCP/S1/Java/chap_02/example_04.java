/**
 * @title  example_04.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月4日 下午10:19:25 

 */
package chap_02;

public class example_04 {
	public static void main(String[] args) {
		double firstAvg=81.29;//第一次考试的平均分
		double secondAvg;//第二次考试的平均分
		int rise=2; //增长的分数
		secondAvg=firstAvg+rise;//自动类型转换
		System.out.println("第二次的平均分是:"+secondAvg);//显示第二次平均分
	}
}
