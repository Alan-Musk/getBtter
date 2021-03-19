/**
 * @title  OrderingSet.java 

 * @package OrderingMar 

 * @author alan

 * @date 2021年3月18日 下午3:58:23 

 */
package OrderingMar;

public class OrderingSet {
	//数据主体:一组订单信息,系统设置最多保存4条信息
	String[] nameStrings=new String[4];//保存订餐人名称
	String[] dishMegs=new String[4];//保存所选信息,包括菜品名及份数
	int[] time=new int[4];//保存送餐时间
	String[] addresses=new String[4];//保存送餐地址
	int[]	states=new int[4];//保存订单状态:0,标识已预订,1表示完成
	double[] sumPrice=new double[4];//保存订单的总金额
}
