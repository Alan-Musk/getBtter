/**
 * @title  main.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午4:00:50 

 */
package chap_12;

public class main_Quess {
	public static void main(String[] args) {
		after_QuessMachine quessMachine=new after_QuessMachine();
		quessMachine.initial();
		quessMachine.guess();
	}
}
