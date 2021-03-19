/**
 * @title  demo_CurrentTime.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月14日 下午4:48:04 

 */
package chap_11;
//currentime实现类
public class demo_CurrentTime {
	public static void main(String[] args) {
		after_CurrentTime currentTime=new after_CurrentTime();
		currentTime.show();
		currentTime.timeNowString="2015年5月12日10点11分30秒";
		currentTime.show();
	}
}
