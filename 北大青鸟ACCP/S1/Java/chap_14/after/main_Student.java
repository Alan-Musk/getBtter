/**
 * @title  main_Student.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午5:47:05 

 */
package after;

public class main_Student {
	public static void main(String[] args) {
		Student student=new Student();
		student.sql=90;
		student.java=89;
		student.c=70;
		StudentBiz studentBiz=new StudentBiz();
		studentBiz.add(student);
		studentBiz.show();
	}
}	
