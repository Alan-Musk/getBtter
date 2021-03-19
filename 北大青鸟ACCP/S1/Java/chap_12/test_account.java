/**
 * @title  test_account.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午3:50:32 

 */
package chap_12;

public class test_account {
	public static void main(String[] args) {
		after_account account=new after_account();
		account.search();
		System.out.println("余额是"+account.money);
	}
}
