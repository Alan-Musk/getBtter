/**
 * @title  test.java 

 * @package chap_10 

 * @author alan

 * @date 2021年3月13日 上午10:32:17 

 */
package chap_10;

import java.util.Scanner;

//幸运抽奖
public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nextString="";//是否继续字符串
		int userId=0;//会员卡号
		String userNameString=null;//用户名
		String userPw=null;//密码
		String newUserName=null;//新用户名,用于判断抽奖是否登录
		//制作随机数
		int max=9999;
		int min=1000;
//2.实现循环功能		
		do {
//1.实现菜单的输出显示			
			System.out.println("******欢迎进入奖客富翁系统*******");
			System.out.println("\t1.注册");
			System.out.println("\t2.登录");
			System.out.println("\t3.抽奖");
			System.out.println("****************************");
			System.out.println("请选择菜单:");
			int choose=input.nextInt();
			//switch结构
			switch (choose) {
			case 1:
				System.out.println("[奖客富翁系统>注册]");
//3.实现注册功能				
				System.out.println("请填写个人注册信息:");
				System.out.println("用户名:");
				userNameString=input.next();//输入用户名
				System.out.println("密码");
				userPw=input.next();//输入密码
				System.out.println("\n注册成功,请记好您的会员卡号");
				System.out.println("用户名\t密码\t会员卡号");
				//生成四位随机数
				userId=(int)(Math.random()*(max-min))+min;
				System.out.println(userNameString+"\t"+userPw+"\t"+userId);
				break;
			case 2:
//4.实现登录功能				
				System.out.println("[奖客富翁系统>登录]");
				for (int i = 0; i <3; i++) {
					System.out.println("请输入用户名:");
					newUserName=input.next();//新用户名
					System.out.println("请输入密码:");
					String newUserPwString=input.next();//新密码
					if (userNameString.equals(newUserName)&&userPw.equals(newUserPwString)) {
						System.out.println("欢迎您"+newUserName);
						break;
					}else {
						System.out.println("您还有"+(2-i)+"次机会,请重新输入");
					}
				}
				break;
			case 3:
//5.实现抽奖功能				
				System.out.println("[奖客富翁系统>抽奖]");
				if (newUserName==null) {//检测必须登录
					System.out.println("您还未登录");
					break;
				}
				System.out.println("请输入您的卡号:");
				int newUserId=input.nextInt();
				if (newUserId!=userId) {//检测卡号相等
					System.out.println("请确保输入本人的卡号");
					break;
				}
				//五个随机数
				int[] randomNum=new int[5];
				System.out.print("本日的幸运数字是");
				for (int i = 0; i < randomNum.length; i++) {
					randomNum[i]=(int)(Math.random()*(max-min))+min;
					System.out.print(randomNum[i]+"\t");
					if (randomNum[i]==userId) {
						System.out.println("\n恭喜您,你是本日的幸运会员");
						break;
					}
				}
				System.out.println("\n抱歉!您不是本日的幸运会员");
				break;
			default:
				System.out.println("您的输入有误");
				break;
			}
			System.out.print("继续吗?(y/n):");
			nextString=input.next();
			System.out.println();//分隔
		} while (nextString.equals("y"));
		System.out.println("系统退出,谢谢使用");
	}
}
