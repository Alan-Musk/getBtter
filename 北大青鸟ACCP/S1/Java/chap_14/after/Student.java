/**
 * @title  Student.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午5:35:28 

 */
package after;

public class Student {
	int java=0;
	int c=0;
	int sql=0;
	double avg;
	//显示信息
	public void show() {
		avg=(java+c+sql)/3;
		System.out.println(avg);
	}
}
