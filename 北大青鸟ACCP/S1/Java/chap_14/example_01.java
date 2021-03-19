/**
 * @title  example_01.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午12:13:48 

 */
package chap_14;
//实例一,实例3
public class example_01 {
	String [] nameStrings=new String[30];//学生姓名数组
	//存储
	public void addName(String name,int num){
		do {
			nameStrings[num]=name;
		} while (num>5);
	}
	//展示
	public void showNames() {
		for (int i = 0; i < nameStrings.length; i++) {
			System.out.println(nameStrings[i]);
		}
	}
	//查找学生
	public boolean searchName(int start,int end,String name) {
		boolean find=false;//是否找到标识
		//在指定的数组区间中查找姓名
		for (int i = start-1; i <end; i++) {
			if (nameStrings[i].equals(name)) {
				find=true;
				break;
			}
		}
		return find;
	}
}
