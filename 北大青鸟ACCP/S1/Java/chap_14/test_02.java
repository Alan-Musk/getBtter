/**
 * @title  test_02.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午1:05:32 

 */
package chap_14;

import java.util.Scanner;

//上机2,上机1写的太细了,怕被看混
public class test_02 {
	Scanner input = new Scanner(System.in);
	String [] nameStrings=new String[5];//客户姓名数组
	//添加客户姓名
	public void addName(String name,int num) {
		for (int i = 0; i < nameStrings.length; i++) {
			do {
				nameStrings[num]=name;
			} while (num>nameStrings.length);
		}
	}
	//输出客户姓名
	public void showName() {
		System.out.println("***************");
		System.out.println("\t\t客户姓名列表:");
		System.out.println("***************");
		System.out.println();
//		输出列表
		for (int i = 0; i < nameStrings.length; i++) {
			System.out.print(nameStrings[i]+"\t");
		}
	}
//	修改
	public void changeName(String name,String newName) {
		for (int i = 0; i < nameStrings.length; i++) {
			//查找
			if (nameStrings[i].equals(name)) {
				nameStrings[i]=newName;//修改
				System.out.println("********修改结果*********");
				System.out.println("找到并修改成功!");
			}
		}
	}
}