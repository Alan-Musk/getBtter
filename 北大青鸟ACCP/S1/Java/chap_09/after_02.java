/**
 * @title  after_02.java 

 * @package chap_09 

 * @author alan

 * @date 2021年3月12日 下午11:18:10 

 */
package chap_09;
//百钱买百鸡
public class after_02 {
	public static void main(String[] args) {
		for (int i = 0; i <=20; i++) {
			for (int j = 0; j <=33; j++) {
				int k=100-i-j;
				if (5*i+3*j+k/3==100) {
					System.out.println("雄鸡:"+i);
					System.out.println("雌鸡:"+j);
					System.out.println("小鸡仔:"+k);
					System.out.println();
				}
			}
		}
	}
}
