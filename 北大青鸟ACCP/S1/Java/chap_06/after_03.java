/**
 * @title  after_03.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午6:34:32 

 */
package chap_06;
//flipflop游戏
public class after_03 {
	public static void main(String[] args) {
		for (int i = 1; i <101; i++) {
			if (i%3==0) {
				System.out.println("Flip");
				if (i%3==0&&i%5==0) {
					System.out.println("FlipFlop");
				}
			} else if(i%5==0){
				System.out.println("Flop");
			} 
		}
	}
}
