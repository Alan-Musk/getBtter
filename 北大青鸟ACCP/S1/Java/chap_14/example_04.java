/**
  * @title  example_04.java 

 * @package chap_14 

 * @author alan

 * @date 2021年3月17日 下午2:09:53 

 */
package chap_14;

public class example_04 {
	/**
	 * 求平均分
	 * scores参数成绩数组
	 */
	public double calAvg(int[] scores) {
		int sum=0;//总分
		double avg=0.0;//平均分
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];
		}
		avg=(double)sum/scores.length;
		return avg;
	}
	//求最高分
	public int calMax(int[] scores) {
		int max=scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (max<scores[i]) {
				max=scores[i];
			}
		}
		return max;
	}
}
