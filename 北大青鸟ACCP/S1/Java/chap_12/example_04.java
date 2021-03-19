/**
 * @title  example_04.java 

 * @package chap_12 

 * @author alan

 * @date 2021年3月16日 下午2:41:09 

 */
package chap_12;

public class example_04 {
	int java;//java成绩
	int c;//C#成绩
	int db;//DB成绩
	//计算总成绩
	public int calcTotalScore(){
		int total=java+c+db;
		return total;
	}
	/**
	 * 显示总成绩
	 * @return total
	 */
	public void showTotalScore(){
		System.out.println("总成绩是:"+calcTotalScore());
	}
	//计算平均分
	public double calcAvg() {
		double avg=(java+c+db)/3.0;
		return avg;
	}
	//显示平均分
	public void showAvg(){
		System.out.println("平均成绩是:"+calcAvg());
	}
}
