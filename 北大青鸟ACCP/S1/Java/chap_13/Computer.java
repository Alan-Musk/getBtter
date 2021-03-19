/**
 * @title  Conputer.java 

 * @package chap_13 

 * @author alan

 * @date 2021年3月17日 上午9:27:13 

 */
package chap_13;
//计算机类

import java.util.Random;

public class Computer {
	String nameString;//电脑名字
	int score=0;//电脑积分
    public int showSecond() {
    	/**
    	 * 产生1-3的随机数
    	 * 首先生成0-3的随机数，然后对(3-1+1)取模得到[0-3]之间的随机数，然后加上min=1，最后生成的是1-3的随机数
    	 */
    	int max=1;
        int min=3;
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        switch (s) {
		case 1:
			System.out.println("电脑出拳:剪刀");
			break;
		case 2:
			System.out.println("电脑出拳:石头");
			break;
		case 3:
			System.out.println("电脑出拳:布");
			break;
		}
        return s;//返回值
	}
}
