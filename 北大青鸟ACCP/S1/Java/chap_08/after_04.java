/**
 * @title  after_04.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月12日 下午4:46:12 

 */
package chap_8;
//假设长度为5的数组
public class after_04 {
	public static void main(String[] args) {
		int[] array=new int[]{1,3,-1,5,-2};//老数组
		int[] newArray=new int[5];
		int num=0;
		for (int i =array.length-1,j=0; i>=0; i--,j++) {
			num=array[i];
			if (num<0) {
				array[i]=0;
			}
			newArray[j]=array[i];
			System.out.print(newArray[j]);
		}
		
	}
}
