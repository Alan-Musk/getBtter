/**
 * @title  after_02.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月12日 下午1:43:02 

 */
package chap_8;
//百货商场积分分别是
public class after_02 {
	public static void main(String[] args) {
		int[] points=new int[]{18,25,7,36,13,2,89,63};//创建数组
		int min=0;//最低积分
		int index=0;//最低积分的下标
		min=points[0];//设第一个元素为最低积分,下标为0
		for (int i = 0; i < points.length; i++) {
			//最低值循环比较
			if (points[i]<min) {
				min=points[i];
				index=i;
			}
		}
		System.out.println(min);
		System.out.println(index);
	}
}
