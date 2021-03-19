/**
 * @title  example_TestLiom.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月14日 下午7:22:42 

 */
package chap_12;
//example_02的实现类
public class example_TestLiom {
	public static void main(String[] args) {
		example_02 autoLion=new example_02();//创建autolion对象
		String infoString=autoLion.showLine();//调用方法并接受方法的返回值
		System.out.println(infoString);
		autoLion.run();
		System.out.println("抢到一个"+autoLion.robBall());
		
	}	
}
