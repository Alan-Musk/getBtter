/**
 * @title  test_02.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午1:06:49 

 */
package chap_12;
//定义管理员类
public class test_02 {
	String nameString;
	String pw;
	public String reNameString() {
		nameString = "JadeBird";//用户名
		return nameString;
	} 
	public String rePwString() {
		pw="000000";//密码
		return pw;
	}
	public void show() {
		System.out.println("管理员信息用户为:"+nameString+"\t密码为:"+pw);
	}
}
