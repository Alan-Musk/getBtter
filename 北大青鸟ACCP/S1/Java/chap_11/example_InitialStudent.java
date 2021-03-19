/**
 * @title  example_InitialStudent.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月13日 下午9:51:59 

 */
package chap_11;

public class example_InitialStudent {
	public static void main(String[] args) {
		example_Student student=new example_Student();//创建对象
		student.nameString="张浩";
		student.age=10;
		student.classNo="S1班";
		student.hobby="篮球";
		student.show();
	}
}
