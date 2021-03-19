/**
 * @title  after_01.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月12日 下午1:35:57 

 */
package chap_8;

import java.util.Arrays;
import java.util.Scanner;

//依次输入5句话.逆序输出
public class after_01 {
	public static void main(String[] args) {
		System.out.println("请输入5句话");
		Scanner input = new Scanner(System.in);
		//输入数据
		String[] talk=new String[5];
		for (int i = 0; i < talk.length; i++) {
			System.out.println("第"+(i+1)+"句话");
			talk[i]=input.next();
		}
		//逆向输出
		System.out.println("逆向输出5句话为:");
		for (int w = talk.length-1; w >=0; w--) {
			System.out.println(talk[w]);
		}
	}
}
