/**
 * @title  main_02.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午1:07:10 

 */
package chap_14;
//上机2的实现类
import java.util.Scanner;

public class main_02 {
	public static void main(String[] args) {
		test_02 test_02=new test_02();
		Scanner input = new Scanner(System.in);
		//调用add方法		
		for (int i = 0; i <test_02.nameStrings.length; i++) {
			System.out.print("请输入客户姓名:");
			String newNameString=input.next();
			test_02.addName(newNameString,i);//调用方法并传实参
		}
		//展示方法
		test_02.showName();
		//修改
		System.out.print("\n请输入要修改的客户姓名:");
		String nameString=input.next();
		System.out.println("请输入新的客户姓名:");
		String newNameString=input.next();
		test_02.changeName(nameString, newNameString);
		test_02.showName();
	}
}
