/**
 * @title  StudentBiz.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午2:23:07 

 */
package chap_14;
//学生管理类
public class StudentBiz {
	Student_example05[] example05=new Student_example05[30];//学生数组
	/**
	 * 增加学生
	 */
	public void addStudent(Student_example05 stu) {
		for (int i = 0; i < example05.length; i++) {
			if (example05[i]==null) {
				example05[i]=stu;
				break;
			}
		}
		//显示本班的学生信息
	}
	public void showStudents() {
		System.out.println("本班学生列表");
		for (int i = 0; i < example05.length; i++) {
			if (example05[i]!=null) {
				example05[i].showInof();
			}
		}
		System.out.println();
	}
}
