/**
 * @title  after_05.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月12日 下午4:58:58 

 */
package chap_8;

import java.util.Scanner;
//英文歌曲
public class after_05 {
	public static void main(String[] args) {
		String[] strings=new String[]{"Island","Ocean","Pretty","Sun",null};//定义数组
		//原字符序列
		System.out.print("插入前的数组为:");
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]+"\t");
		}
		System.out.println();
		int index=strings.length;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入歌曲名称:");
		//将null替换,防止编译不通过
		String a=input.next();
		strings[4]=a;
		//使用string类型比较大小的方法,进行排序,找到排序后的位置
		for (int i = 0; i <strings.length; i++) {
			if (a.compareToIgnoreCase(strings[i])>0) {
				index=i+1;//调试之后,发现应该挤掉h,多加一位
			}
		}
		//将后面往后挪
		for (int w = strings.length-1; w >index; w--) {
			strings[w]=strings[w-1];
		}
		strings[index]=a;//通过下标,将输入的值替换
		//插入后的字符串是
		for (int z = 0; z < strings.length; z++) {
			System.out.print(strings[z]+"\t");
		}
	}
}
