/**
 * @title  OrderingUtil.java 

 * @package OrderingMar 

 * @author alan

 * @date 2021年3月18日 下午4:00:39 

 */
package OrderingMar;

import java.util.Scanner;

public class OrderingUtil {
	//生成供选择的三种菜品名称,单价,点赞数
	String[]	dishNames={"红烧带鱼","鱼香肉丝","时令鲜蔬"};//菜品名称
	double[] prices=new double[]{38,20,10};//菜品单价
	int[] praiseNums=new int[3];//点赞数
	Scanner input = new Scanner(System.in);
	//创建订单对象
	OrderingSet oSet=new OrderingSet();
	//初始两条订单
	public void initial() {
		//初始化第一条订单信息
		oSet.nameStrings[0]="alan";
		oSet.dishMegs[0]="红烧带鱼2份";
		oSet.time[0]=12;
		oSet.addresses[0]="天成路207号";
		oSet.states[0]=1;
		oSet.sumPrice[0]=76;
		//初始化第二条信息
		oSet.nameStrings[1]="alan";
		oSet.dishMegs[1]="鱼香肉丝2份";
		oSet.time[1]=18;
		oSet.addresses[1]="天成路207号";
		oSet.states[1]=0;
		oSet.sumPrice[1]=45;
	}
	//实现菜单切换
	public void startMenu() {
		Scanner input = new Scanner(System.in);
		int num=-1;//用户输入0返回主菜单,否则退出系统
		boolean isExit=false;//标志用户是否退出系统:true为退出系统
		System.out.println("\n欢迎使用 吃货联盟订餐系统");
		//循环:显示菜单,根据用户选择的数字执行相应的功能
		do {
			isExit=false;
			//显示菜单
			System.out.println("***********************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("***********************");
			System.out.println("请选择:");
			int choose=input.nextInt();//记录用户选择的功能编号
			//根据用户输入的编号,执行相关操作
			switch (choose) {
			case 1:
				//我要订餐
				add();
				break;
			case 2:
				//查看餐袋
				display();
				break;
			case 3:
				//签收订单
				sign();
				break;
			case 4:
				//删除订单
				delete();
				break;
			case 5:
				//我要点赞
				praise();
				break;
			case 6:
				//退出系统
				System.out.println("****退出系统****");
				isExit=true;
				break;
			default:
				//退出系统
				isExit=true;
				break;
			}
			if (!isExit) {
				System.out.println("输入0返回");
				num=input.nextInt();
				isExit=true;
			}else {
				break;
			}
		} while (isExit);
	}
	//实现查看餐袋
	public void display() {
		System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
		for (int i = 0; i < oSet.nameStrings.length; i++) {
			if (oSet.nameStrings[i]!=null) {
				String state=(oSet.states[i]==0)?"已预订":"已完成";
				String date=oSet.time[i]+"点";
				String sumPiceString=oSet.sumPrice[i]+"元";
				System.out.println((i+1)+"\t"+oSet.nameStrings[i]+"\t"+oSet.dishMegs[i]+"\t"+date+"\t"+oSet.addresses[i]+"\t"+sumPiceString+"\t"+state);
			}
		}
	}
	//实现我要订餐
	public boolean add() {
		Boolean isAdd=false;//记录是否可以订餐
		for (int i = 0; i <oSet.nameStrings.length; i++) {
			if (oSet.nameStrings[i]==null) {//找到第一个空位置,可以添加订单信息
				isAdd=true;//置标志位,可以订餐
				System.out.println("请输入订餐人名字:");
				String nameString=input.next();
				//显示供选择的菜单信息
				System.out.println("序号\t菜名\t单价\t点赞数");
				//为什么要重新赋值
				for (int j = 0; j < dishNames.length; j++) {
					String priceString=prices[j]+"元";
					String priaiseNum=(praiseNums[j])>0?praiseNums[j]+"赞":"0";
					System.out.println((j+1)+"\t"+dishNames[j]+"\t"+priceString+"\t"+priaiseNum);
				}
				//用户点菜
				System.out.println("请选择您要点的菜品编号:");
				int chooseDish=input.nextInt();
				System.out.println("请选择您需要的份数:");
				int number=input.nextInt();
				String dishMeg=dishNames[chooseDish-1]+""+number+"份";
				double sumPrice=prices[chooseDish-1]*number;
				//餐费满50元,免送餐费5元
				double deliCharge=(sumPrice>=50)?0:5;
				
				System.out.println("请选择送餐时间(送餐时间是10点到20点之间整点送餐):");
				int time=input.nextInt();
				while (time<10||time>20) {
					System.out.println("您的输入有误,请输入10-20间的整数!");
					time=input.nextInt();
				}
				System.out.println("请输入送餐地址:");
				String address=input.next();
				
				//无需添加状态,系统默认是0,即预订状态
				System.out.println("订餐成功!");
				System.out.println("您订的是:"+dishMeg);
				System.out.println("送餐时间:"+time);
				System.out.println("餐费:"+sumPrice+"元.送餐费"+deliCharge+"元,总计:"+(sumPrice+deliCharge)+"元");
				//添加数据
				oSet.nameStrings[i]=nameString;
				oSet.dishMegs[i]=dishMeg;
				oSet.time[i]=time;
				oSet.addresses[i]=address;
				oSet.sumPrice[i]=sumPrice+deliCharge;
				break;
			}
		}
		if (!isAdd) {
			System.out.println("对不起,您的餐袋已满!");
			return false;
		}else {
			return true;
		}
	}
	//实现签收菜单
	public void sign() {
		boolean isSignfind=false;//找到要签收的订单
		System.out.println("请选择要签收的订单序号");
		int signOrderId=input.nextInt();
		for (int i = 0; i <oSet.nameStrings.length; i++) {
			//状态为已预订,序号为用户输入的订单号减1:可签收
//			状态为已完成,序号为用户输入的订单序号减1L不可签收
			if (oSet.nameStrings[i]!=null&&oSet.states[i]==0&&signOrderId==i+1) {
				oSet.states[i]=1;//将状态值设置为已完成
				System.out.println("订单签收成功!");
				isSignfind=true;//标记已找到此订单
			}else if (oSet.nameStrings[i]!=null&&oSet.states[i]==1&&signOrderId==i+1) {
				System.out.println("您选择的订单已完成,签收,不能再次签收!");
				isSignfind=true;//标记已找到次订单
			}
		}
		//未找到订单序号:不可签收
		if (!isSignfind) {
			System.out.println("您选择的订单不存在");
		}
	}
	//实现删除订单
	public void delete() {
		boolean isDelfind=false;//找到要删除的订单
		System.out.println("请选择要删除的订单序号");
		int delId=input.nextInt();
		for (int i = 0; i <oSet.nameStrings.length; i++) {
			//状态为已预订,序号为用户输入的订单号减1:不可删除
//			状态为已完成,序号为用户输入的订单序号减1可删除
			if (oSet.nameStrings[i]!=null&&oSet.states[i]==1&&delId==i+1) {
				//执行删除操作:删除位置后的元素依次前移
				for (int j =delId-1; j <oSet.nameStrings.length-1; j++) {
					oSet.nameStrings[j]=oSet.nameStrings[j+1];
					oSet.dishMegs[j]=oSet.dishMegs[j+1];
					oSet.time[j]=oSet.time[j+1];
					oSet.addresses[j]=oSet.addresses[j+1];
					oSet.states[j]=oSet.states[j+1];
					oSet.sumPrice[j]=oSet.sumPrice[j+1];
					
				}
				//最后一位清空
				int endIndex=oSet.nameStrings.length-1;//下标为0
				oSet.nameStrings[endIndex]=null;
				oSet.dishMegs[endIndex]=null;
				oSet.time[endIndex]=0;
				oSet.addresses[endIndex]=null;
				oSet.states[endIndex]=0;
				oSet.sumPrice[endIndex]=0;
				System.out.println("删除订单成功!");
				isDelfind=true;//标记已找到此订单
				break;
			}else if (oSet.nameStrings[i]!=null&&oSet.states[i]==0&&delId==i+1) {
				System.out.println("您选择的订单未签收,不能删除!");
				isDelfind=true;//标记已找到次订单
				break;
			}
		}
		//未找到订单序号:不可删除
		if (!isDelfind) {
			System.out.println("您要删除的订单不存在");
		}
	}
	//我要点赞
	public void praise() {
		//显示菜品信息
		System.out.println("序号\t菜名\t单价");
		for (int i = 0; i < dishNames.length; i++) {
			String priceString=prices[i]+"元";
			String priaiseNumString=(praiseNums[i])>0?praiseNums[i]+"赞":"";
			System.out.println((i+1)+"\t"+dishNames[i]+"\t"+priceString+"\t"+priaiseNumString);
		}
		System.out.println("请选择您要点赞的菜品序号:");
		int priaiseNum=input.nextInt();
		praiseNums[priaiseNum-1]++;//赞+1
		System.out.println("点赞成功");
	}
}
