/**
 * @title  main_after_06.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午5:23:42 

 */
package after;

public class main_after_06 {
	public static void main(String[] args) {
		after_06 after_06=new after_06();
		int[] arr=new int[]{1,2,3,4,5,6,7};
		//修改前输出
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		//下标为3的位置,插入90
		after_06.insertArray(arr, 3, 90);
		System.out.println();
		//修改后输出
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
