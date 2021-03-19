/**
 * @title  test_03.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月12日 下午12:49:51 

 */
package chap_8;
//字符逆序输出
import java.util.Arrays;

public class test_03 {
	public static void main(String[] args) {
		String[] strings=new String[]{"a","c","u","b","e","p","f","z"};//定义数组
		//原字符序列
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]);
		}
		System.out.println();
		//升序排序后
		Arrays.sort(strings);
		for (int z = 0; z < strings.length; z++) {
			System.out.print(strings[z]);
		}
		System.out.println();
		//降序排序
		for (int w = strings.length-1; w >=0; w--) {
			System.out.print(strings[w]);
		}
 	}
}
