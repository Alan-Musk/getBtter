/**
 * @title  test_01.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月17日 下午7:17:58 

 */
package chap_15;

public class test_01 {
	//验证用户名
	public boolean newUser(String userNameString,String pw,String pwagain) {
		boolean flag=false;
		if (userNameString.length()<3||pw.length()<6) {
			System.out.println("用户名长度不能小于3,密码长度不能小于6");
			flag=true;
		}else if (!pw.equals(pwagain)) {
			System.out.println("两次输入的密码不相同(请注意大小写一致)");
			flag=true;
		}
		return flag;
	}
}
