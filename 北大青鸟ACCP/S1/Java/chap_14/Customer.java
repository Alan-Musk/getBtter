/**
 * @title  Customer.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午2:49:11 

 */
package chap_14;
//上机4
public class Customer {
	public String nameString;//姓名
	public int age;//年龄
	public boolean VIP;//是否有会员卡
	public void show() {
		System.out.println(nameString+"\t"+age+"\t"+VIP);
	}
}
