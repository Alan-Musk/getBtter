/**
 * @title  test_04.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午10:14:53 

 */
package chap_15;

import java.util.Scanner;

public class test_04 {
	
	//判断登录信息
	public boolean login(String userName,String pw) {
		boolean flag=false;
		//判断登录信息
		if (userName.equals("TOM")&&pw.equals("123")) {
			System.out.println("登录成功");
			flag=true;
		}
		return flag;
	}
	//展示商品名称和价格
	public void show(String[] good,String[] strings) {
		System.out.println("*********欢迎进入商品批发城**********");
		System.out.println("\t编号\t商品\t价格");
		for (int i = 0; i < good.length; i++) {
			System.out.println("\t"+(i+1)+"\t"+good[i]+"\t"+strings[i]);
		}
		System.out.println("**********************");
	}
	//格式化输出
	public StringBuffer change(double d) {
		StringBuffer stringBuffer=new StringBuffer(String.valueOf(d));
		for (int i = stringBuffer.indexOf(".")-3; i>0; i=i-3) {
			stringBuffer.insert(i, ",");
		}
		return stringBuffer;
	}
	//main方法
	public static void main(String[] args) {
		String[] goods=new String[]{"电风扇","洗衣机","电视机","冰箱","空调机"};
		double[] price=new double[]{124.23,4500,8800.90,5000.88,4456,12000.46};
		Scanner input = new Scanner(System.in);
		test_04 te=new test_04();
		System.out.println("请输入用户名:");
		String userName=input.next();
		System.out.println("请输入密码:");
		String pw=input.next();
		String[] strings=new String[5];//stringbuffer数组
		//转换
		for (int i = 0; i < strings.length; i++) {
			strings[i]=String.valueOf(te.change(price[i]));
		}
		if (te.login(userName, pw)) {
			te.show(goods, strings);
		}else {
			System.out.println("登录失败");
		}
	}
}
