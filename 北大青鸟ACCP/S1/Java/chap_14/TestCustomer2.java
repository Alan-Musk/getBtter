/**
 * @title  TestCustomer2.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午3:02:00 

 */
package chap_14;
//上机4
public class TestCustomer2 {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.nameString="王一";
		customer.age=30;
		customer.VIP=false;
		Customer customer2=new Customer();
		customer2.nameString="好强";
		customer2.age=19;
		customer.VIP=true;
		Test_Customer test_Customer=new Test_Customer();
		test_Customer.addCustomer(customer);
		test_Customer.addCustomer(customer2);
		test_Customer.show();
	}
}
