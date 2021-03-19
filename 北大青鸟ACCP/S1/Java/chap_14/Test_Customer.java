/**
 * @title  Test_Customer.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午2:52:06 

 */
package chap_14;
//上机4
public class Test_Customer {
	Customer[] customers=new Customer[30];//创建客户对象数组
	//添加信息
	public void addCustomer(Customer cus) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i]==null) {
				customers[i]=cus;
				break;
			}
		}
	}
	//输出基本信息
	public void show() {
		System.out.println("客户信息");
		for (int i = 0; i < customers.length; i++) {
			if (customers[i]!=null) {
				customers[i].show();
			}
		}
	}
}
