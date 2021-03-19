/**
 * @title  CustomerBiz.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午12:37:25 

 */
package chap_14;

public class CustomerBiz {
	String [] nameStrings=new String[100];//客户姓名数组
	//添加客户姓名
	public void addName(String name,int num) {
		for (int i = 0; i < nameStrings.length; i++) {
			do {
				nameStrings[num]=name;
			} while (num>nameStrings.length);
//			if (nameStrings[i]==null) {
//				nameStrings[i]=name;
//			}
//			学校的代码限制性太强了,具体我忘了,刚刚调试的时候尿急,给我整忘了
		}
	}
	//输出客户姓名
	public void showName() {
		System.out.println("***************");
		System.out.println("\t\t客户姓名列表:");
		System.out.println("***************");
		System.out.println();
		for (int i = 0; i < nameStrings.length; i++) {
			//不输出null
			if (nameStrings[i]!=null) {
				System.out.print(nameStrings[i]+"\t");
			}
		}
	}
}
