/**
 * @title  Calculator.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午4:15:45 

 */
package after;
//计算器类

public class Calculator {
	//加法
	public int add(int a,int b,int sum) {
		sum=a+b;
		return sum;
	}
	//减法
	public int minus(int a,int b,int sum) {
		sum=a-b;
		return sum;
	}
	//乘法
	public int multiple(int a,int b,int sum) {
		sum=a*b;
		return sum;
	}
	//除法
	public int divide(int a,int b,int sum) {
		sum=a/b;
		return sum;
	}
}
