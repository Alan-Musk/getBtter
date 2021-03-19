/**
 * @title  TestADD.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午2:30:32 

 */
package chap_14;
//实例5实现类
public class TestADD {
	public static void main(String[] args) {
		//实例化学生对象并初始化
		Student_example05 student_example05=new Student_example05();
		student_example05.id=10;
		student_example05.nameString="王子";
		student_example05.age=18;
		student_example05.score=99;
		Student_example05 student_example052=new Student_example05();
		student_example052.id=11;
		student_example052.nameString="好人";
		student_example052.age=20;
		student_example052.score=80;
		//新增学生对象
		StudentBiz studentBiz=new StudentBiz();
		studentBiz.addStudent(student_example05);
		studentBiz.addStudent(student_example052);
		studentBiz.showStudents();
 	}
}
