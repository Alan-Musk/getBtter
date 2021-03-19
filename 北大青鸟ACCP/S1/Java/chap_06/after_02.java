/**
 * @title  after_02.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午6:30:47 

 */
package chap_06;
//鸡兔同笼
public class after_02 {
	public static void main(String[] args) {
		int chookNum=0;//鸡的数量
		int rabbiNum=0;//兔的数量
		for (chookNum = 0; chookNum < 35; chookNum++) {
			rabbiNum=35-chookNum;
			if (2*chookNum+4*rabbiNum==94) {
				System.out.println(chookNum);
				System.out.println();
				System.out.println(rabbiNum);
			}
		}
	}
}
