/**
 * @title  example_05.java 

 * @package chap_02 

 * @author alan

 * @date 2021年3月4日 下午10:31:10 

 */
package chap_02;

public class example_05 {
	public static void main(String[] args) {
		int before=20;	//apple笔记本市场份额
		double rise=9.8;//增长的份额
		//计算新的市场份额(double类型变量强制转换成int类型变量)
		int now=before+(int)rise;//现在的份额
		System.out.println("新的市场份额是:"+now);
	}
}
                           