/**
 * @title  example_01.java 

 * @package chap_04 

 * @author alan

 * @date 2021年3月7日 下午1:49:36 

 */
package chap_04;

public class example_01 {
	public static void main(String[] args) {
		int ranking=3;//排名
		if (ranking==1) {
			System.out.println("参加麻省理工大学组织的一个月夏令营");
		} else if(ranking==2){
			System.out.println("奖励惠普笔记本电脑一部");
		}else if (ranking==3) {
			System.out.println("奖励移动硬盘一个");	
		}else {
			System.out.println("没有任何奖励");
		}
	}
}
