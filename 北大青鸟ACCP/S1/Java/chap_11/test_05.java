/**
 * @title  test_05.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月14日 下午2:51:51 

 */
package chap_11;
//客户积分回馈
public class test_05 {
	public static void main(String[] args) {
		test_Customer customer=new test_Customer();
		customer.ID="金卡";
		customer.score=3050;
		customer.show();
		if (customer.ID.equals("金卡")&&customer.score>1000) {
			System.out.println("回馈积分500分");
		}
	}
}
