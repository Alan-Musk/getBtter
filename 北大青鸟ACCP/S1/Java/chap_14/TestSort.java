/**
 * @title  TestSort.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午2:43:33 

 */
package chap_14;
//上机练习3实现类
public class TestSort {
	public static void main(String[] args) {
		Test_03 test=new Test_03();
		String[] nameStrings=new String[]{"Tom","Jack","Merry","Smith","Sunny"};
		System.out.println("排序前");
		for (int i = 0; i < nameStrings.length; i++) {
			System.out.println(nameStrings[i]);
		}
		//调用排序方法
		test.sortNames(nameStrings);
		System.out.println("排序后");
		for (int i =0; i<nameStrings.length; i++) {
			if (nameStrings[i]!=null) {
				System.out.println(nameStrings[i]+"\t");
			}
		}
 	}
}
