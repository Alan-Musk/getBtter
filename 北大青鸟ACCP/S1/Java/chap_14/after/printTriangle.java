/**
 * @title  printTriangle.java 

 * @package after 

 * @author alan

 * @date 2021年3月17日 下午4:50:57 

 */
package after;

public class printTriangle {
	public void Tringle(int row,String ch) {
		for (int i = 1; i <=row; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
