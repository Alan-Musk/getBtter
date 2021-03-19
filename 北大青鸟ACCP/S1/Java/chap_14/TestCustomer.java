/**
 * @title  TestCustomer.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午12:46:50 

 */
package chap_14;
//实例
import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		CustomerBiz customerBiz=new CustomerBiz();
		Scanner input = new Scanner(System.in);
		boolean con=true;
			//调用add方法		
			for (int i = 0; i <customerBiz.nameStrings.length; i++) {
				System.out.println("请输入客户姓名:");
				String newNameString=input.next();
				customerBiz.addName(newNameString,i);//调用方法并传实参
				System.out.println("继续输入吗?y/n");
				String choiceString=input.next();
				if (choiceString.equals("n")) {
					break;
				}
			}
		customerBiz.showName();
	}
}
