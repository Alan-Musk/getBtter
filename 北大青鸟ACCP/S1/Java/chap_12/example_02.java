/**
 * @title  example_02.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月14日 下午7:15:54 

 */
package chap_12;

public class example_02 {
	String colorString="黄色";//颜色
//	跑
	public void run(){
		System.out.println("正在以0.1米每秒的速度向前奔跑.");
	}
//	抢球
	public String robBall(){
		String ballString="球";
		return ballString;
	}
//	获得颜色
	public String getColor(){
		return colorString;
	}
//	显示狮子特性
	public String showLine(){
		return "这是一个"+getColor()+"的玩具狮子";
	}
}
