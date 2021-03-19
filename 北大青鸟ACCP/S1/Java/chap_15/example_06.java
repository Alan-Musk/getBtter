/**
 * @title  example_06.java 

 * @package chap_15 

 * @author alan

 * @date 2021年3月18日 上午8:43:49 

 */
package chap_15;

import java.util.Scanner;

public class example_06 {
	public static void main(String[] args) {
		//声明变量
		boolean fileCorrect=false;//标识文件名是否正确
		boolean emailCorrect=false;//标识E-mail是否正确
		System.out.println("---欢迎进入作业提交系统----");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入Java文件名:");
		String fileNameString=input.next();
		System.out.println("请输入你的邮箱:");
		String emailString=input.next();
		
		//检查Java文件名
		int index=fileNameString.lastIndexOf(".");//.的位置
		if (index!=-1&&index!=0&&fileNameString.substring(index+1,fileNameString.length()).equals("java")) {
			fileCorrect=true;//标识文件名正确
		}else {
			System.out.println("文件名无效");
		}
		//检查邮箱格式
		if (emailString.indexOf("@")!=-1&&emailString.indexOf("@")!=0) {
			emailCorrect=true;//标识email正确
		}else {
			System.out.println("无效");
		}
		//输入检测成功
		if (fileCorrect&&emailCorrect) {
			System.out.println("作业提交成功");
		}else {
			System.out.println("作业提交失败");
		}
	}
}
