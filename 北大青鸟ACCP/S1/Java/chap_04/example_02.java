/**
 * @title  example_02.java 

 * @package chap_04 

 * @author alan

 * @date 2021年3月7日 下午1:58:06 

 */
package chap_04;

public class example_02 {
	public static void main(String[] args) {
		int ranking=1;//排名
		switch (ranking) {
		case 1:
			System.out.println("参加麻省理工大学组织的一个月夏令营");
			break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
		default:
			System.out.println("没有任何奖励");
			break;
		}
	}
}
