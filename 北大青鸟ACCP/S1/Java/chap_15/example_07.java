/**
 * @title  example_07.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午8:57:43 

 */
package chap_15;

public class example_07 {
	public static void main(String[] args) {
		 String wordString="长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山";
		 String[] printWordStrings=new String[100];//定义接收数组
		 System.out.println("****原歌词格式*****\n"+wordString);
		 System.out.println("拆分之后");
		 printWordStrings=wordString.split(" ");
		 for (int i = 0; i < printWordStrings.length; i++) {
			System.out.println(printWordStrings[i]);
		}
	}
}
 