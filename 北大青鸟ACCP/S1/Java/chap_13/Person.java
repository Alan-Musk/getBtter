/**
 * @title  Person.java 

 * @package chap_13 

 * @author alan

 * @date 2021年3月17日 上午9:15:00 

 */
package chap_13;
//玩家类
import java.util.Scanner;

public class Person {
	String nameString;//用户的名字
	int score=0;//积分
	//出拳
	public int showFist() {
		Scanner input = new Scanner(System.in);
		int choice=0;//出拳
		boolean sw;//
		do {
			sw=false;//在这里赋值是因为如果输入有误重新输入的话sw为true,无限循环
			System.out.println("请出拳:1.剪刀2.石头3.布(输入相应数字):");
			choice=input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("你出拳:剪刀");
				break;
			case 2:
				System.out.println("你出拳:石头");
				break;
			case 3:
				System.out.println("你出拳:布");
				break;
			default:
				System.out.println("输入有误重新输入");
				sw=true;
				break;
			}
		} while (sw);
		return choice;
	}
}
