/**
 * @title  Game.java 

 * @package chap_13 

 * @author alan

 * @date 2021年3月17日 上午9:43:54 

 */
package chap_13;

import java.util.Scanner;

public class Game {
	Scanner input = new Scanner(System.in);
	Person person;//甲方玩家
	Computer computer;//电脑玩家
	int count;//对战次数
	public void initial() {
		person=new Person();//创建甲方对象
		computer=new Computer();//创建电脑对象
		count=0;//对战次数初始化
	}
	public void startGame() {
		System.out.println("----------欢迎进入游戏世界--------------\n\n");
		System.out.println("************************\n");
		System.out.println("**\t猜拳,开始\t**");
		System.out.println("************************\n\n");
		System.out.println("出拳规则:1.剪刀2.石头3.布");
		int choice;//角色选择
		boolean sw;//输入是否正确
		//输入判断
		do {
			sw=false;
			System.out.println("请选择对方角色(1.刘备2.孙权3.曹操:)");
			choice=input.nextInt();
			System.out.println("请输入你的名字:");
			person.nameString=input.next();
			switch (choice) {
			case 1:
				computer.nameString="刘备";
				break;
			case 2:
				computer.nameString="孙权";
				break;
			case 3:
				computer.nameString="曹操";
				break;
			default:
				System.out.println("输入有误重新输入");
				sw=true;
				break;
			}
		} while (sw);
		System.out.println(person.nameString+"\tVS\t"+computer.nameString);
		//开始游戏
		System.out.println("\n要开始吗?(y/n)");
		String con=input.next();
		int showFist;//用户处的拳
		int showSecond;//电脑出的拳
		//循环对战,积累得分
		do {
			sw=false;
			if (con.equals("y")) {
				//出拳
				showFist=person.showFist();
				showSecond=computer.showSecond();
				//判定
				if (showFist==showSecond) {
					System.out.println("结果:和局,真衰!\n");//平局
				}else if ((showFist==1&&showSecond==3)||(showFist==2&&showSecond==1)||(showFist==3&&showSecond==2)) {
					System.out.println("结果:恭喜,你赢了!");//用户赢
					person.score++;
				}else {
					System.out.println("结果:^-^.你输了,真笨\n");//计算机赢
					computer.score++;
				}
			}
			count++;//次数+1
			//循环判断
			System.out.print("\n还要继续吗y/n");
			String con2=input.next();
			if (con2.equals("y")) {
				sw=true;
			}else if (con2.equals("n")) {
				//显示最后结果
				System.out.println("---------------------------");
				System.out.println(computer.nameString+"\tVS\t"+person.nameString);
				System.out.println("对战次数:"+count);
				System.out.println("\n姓名\t得分");
				System.out.println(person.nameString+"\t"+person.score);
				System.out.println(computer.nameString+"\t"+computer.score);
				if (person.score>computer.score) {
					System.out.println("\n结果:人类之光");
				}else if (person.score==computer.score) {
					System.out.println("\n结果:势均力敌");
				}else {
					System.out.println("\n结果:呵呵,笨笨,下次加油啊");
				}
				System.out.println("---------------------------");
			}
		} while (sw);
	}
}
