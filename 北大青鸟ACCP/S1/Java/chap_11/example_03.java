/**
 * @title  example_03.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月13日 下午8:47:08 

 */
package chap_11;

public class example_03 {
	public static void main(String[] args) {
		example_02 center=new example_02();
		System.out.println("*****初始化成员变量前******");
		center.showCenter();
		center.schoolNameString="北京远航";//给schoolName属性赋值
		center.classNumber=10;//给classNumber属性赋值
		center.labNumber=10;//给labNumber属性赋值
		System.out.println("\n****初始化成员变量后*****");
		center.showCenter();
	}
}
