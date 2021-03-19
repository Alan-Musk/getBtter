/**
 * @title  test_05.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午8:00:30 

 */
package chap_09;
//打印九九乘法表
public class test_05 {
	public static void main(String[] args) {
		int row=9;//乘法表的行数
		for (int i = 1; i <=row; i++) {//一共有九行
			for (int j = 1; j <=i; j++) {//第i行有i个式子
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
