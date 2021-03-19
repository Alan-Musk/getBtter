/**
 * @title  test_01.java 

 * @package chap_8 

 * @author alan

 * @date 2021年3月11日 下午5:13:57 

 */
package chap_8;
//存储5件商品名称,在控制台显示特价商品名称
public class test_01 {
	public static void main(String[] args) {
		String[] goods=new String[]{
				"Nike背包","Adidas运动衫","李宁运动鞋","Kappa外套","361腰包"};
		System.out.println("本次活动特价商品有:");
		//for循环遍历
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
		}
	}
}
