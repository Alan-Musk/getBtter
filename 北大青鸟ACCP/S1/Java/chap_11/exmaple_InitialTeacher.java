/**
 * @title  exmaple_InitialTeacher.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月13日 下午10:09:12 

 */
package chap_11;

public class exmaple_InitialTeacher {
	public static void main(String[] args) {
		example_teacher teacher=new example_teacher();
		teacher.nameString="王老师";
		teacher.major="计算机";
		teacher.course="使用Java语言理解程序逻辑";
		teacher.teachAge=5;
		teacher.show();
	}
}
