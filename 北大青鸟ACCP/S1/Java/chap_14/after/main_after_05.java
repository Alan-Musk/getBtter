/**
 * @title  main_after_05.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午5:05:54 

 */
package after;

import java.util.Scanner;

public class main_after_05 {
	public static void main(String[] args) {
		after_05 after=new after_05();
		Scanner input = new Scanner(System.in);
		boolean choice=true;
		while (choice==true) {
			System.out.println("请输入第一个边:");
			int a=input.nextInt();
			System.out.println("请输入第二个边:");
			int b=input.nextInt();
			System.out.println("请输入第三个边:");
			int c=input.nextInt();
			if (after.isTriangle(a, b, c)==true) {
				System.out.println("这是一个:"+after.shapeString(a, b, c));
				System.out.println("还继续吗y/n");
				String choose=input.next();
				if (choose.equals("n")) {
					choice=false;
				}
			}else {
				choice=false;
				System.out.println("不能构成三角形");
			}
		}
		System.out.println("谢谢使用");
	}
}
