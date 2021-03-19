/**
 * @title  StudentBiz.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午5:40:35 

 */
package after;

public class StudentBiz {
	Student[] students=new Student[30];
	public void add(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i]==null) {
				students[i]=student;
				break;
			}
		}
	}
	public void show() {
		System.out.println("平均分");
		for (int i = 0; i < students.length; i++) {
			if (students[i]!=null) {
				students[i].show();
			}
		}
	}
}
