/**
 * @title  example_08.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午9:54:51 

 */
package chap_15;

public class example_08 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("青春无悔");
		int num=110;
		//在字符串后面追加字符串
		StringBuffer sb1=sb.append("我心永恒");
		System.out.println(sb1);
//		在字符串后面追加字符
		StringBuffer sb2=sb1.append("啊");
		System.out.println(sb2);
		//在字符串后面追加数字
		StringBuffer sb3=sb2.append(num);
		System.out.println(sb3);
	}
}
