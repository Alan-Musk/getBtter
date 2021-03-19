/**
 * @title  example_04.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月11日 下午9:19:47 

 */
package chap_8;

import java.util.Arrays;
import java.util.Scanner;

public class example_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list=new int[6];//长度为6的数组
		list[0]=99;
		list[1]=85;
		list[2]=82;
		list[3]=63;
		list[4]=60;
		
		int index=list.length;//保存新增成绩插入位置
		System.out.println("请输入新增成绩:");
		int num=input.nextInt();//输入要插入的数据
		//找到新增元素的插入位置
		for (int i = 0; i < list.length; i++) {
			if (num>list[i]) {
				index=i;
				break;
			}
		}
		//元素后移
		for (int j =list.length-1; j>index; j--) {
			list[j]=list[j-1];//index下标开始的元素后移一个位置
		}
		list[index]=num;//插入数据
		System.out.println("插入后成绩的下标是:"+index);
		System.out.println("插入后的成绩信息是:");
		for (int k = 0; k < list.length; k++) {
			//循环输出
			System.out.println(list[k]+"\t");
			
		}
	}
}
