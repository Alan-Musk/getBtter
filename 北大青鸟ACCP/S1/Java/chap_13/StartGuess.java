/**
 * @title  StartGuess.java 

 * @package chap_13 

 * @author alan

 * @date 2021年3月17日 上午9:24:36 

 */
package chap_13;

import java.util.Scanner;

//实现类
public class StartGuess {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Game game=new Game();//创建game类对象 
		game.initial();
		game.startGame();
		
	}
}
