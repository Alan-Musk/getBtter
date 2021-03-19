/**
 * @title  after_game.java 

 * @package chap_11 

 * @author alan

 * @date 2021年3月14日 下午5:18:57 

 */
package chap_11;

public class after_game {
	public static void main(String[] args) {
		//英雄类
		after_hero hero=new after_hero();
		hero.nameString="李小龙";
		hero.HP=300;
		hero.show();
//		武器类
		after_tools tools=new after_tools();
		tools.nameString="死神镰刀";
		tools.ATK=12;
		tools.show();
		//怪物类
		after_moster moster=new  after_moster();
		moster.nameString="小龟";
		moster.HP=300;
		moster.typeString="潜水类";
		moster.show();
	}
}
