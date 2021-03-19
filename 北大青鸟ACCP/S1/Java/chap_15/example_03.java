/**
 * @title  example_03.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月17日 下午7:13:31 

 */
package chap_15;

public class example_03 {
	public static void main(String[] args) {
		String string1=new String("我爱我的祖国");
		String string2=new String("我爱我的祖国");
		if (string1.equals(string2)) {
			System.out.println("两个字符串相同");
		} else {
			System.out.println("两个字符串不相同");
		}
		if (string1==string2) {
			System.out.println("两个字符串相同");
		}else {
			System.out.println("两个字符串不相同");
		}
	}
}
