/**
 * @title  after_05.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午4:55:40 

 */
package after;

public class after_05 {
	public boolean isTriangle(int a,int b,int c) {
		boolean flag=false;
		//判断,能不能构成三角形
		if ((a<b+c)&&(b<a+c)&&(c<a+b)) {
			flag=true;
		}
		return flag;
	}
	//判断什么三角形
	public String shapeString(int a,int b,int c) {
		String shapeString="";
		if ((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==b*b+a*a)) {
			shapeString="直角三角形";
		}else if (a==c&&a==b) {
			shapeString="等边三角形";
		}else if ((a*a>b*b+c*c)||(b*b>a*a+c*c)||(c*c>b*b+a*a)) {
			shapeString="钝角三角形";
		}else {
			shapeString="锐角三角形";
		}
		return shapeString;
	}
}
