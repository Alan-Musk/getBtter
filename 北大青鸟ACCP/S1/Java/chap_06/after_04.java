/**
 * @title  after_04.java 

 * @package chap_06 

 * @author alan

 * @date 2021年3月9日 下午6:44:12 

 */
package chap_06;
//马克思
public class after_04 {
	public static void main(String[] args) {
		int i=0;//测试次数
		//第一种写法
		int men;//男人
		int women=0;//女人
		int kids=0;//孩子
		for (men = 0;men<=30; men++) {
			for (women = 0; women <=30; women++) {
				kids=30-men-women;
				if (3*men+2*women+kids==50) {
					System.out.println(men);
					System.out.println(women);
					System.out.println(kids);
					System.out.println(i++);//测试次数
				}
			}
		}
		
		//第二种写法
		//men+women+kid=30 3men+2women+kid=50 所以 2men+women=20
//		for (int men = 0; men <=10; men++) {
//			System.out.println("男人的个数为"+men+"女人的个数为"+(20-2*men)+"孩子的个数"+(30-men-(20-2*men)));
//			System.out.println(i++);//测试次数
//		}
	}
}
