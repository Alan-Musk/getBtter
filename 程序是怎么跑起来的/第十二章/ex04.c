#include <stdio.h>
#include <stdlib.h>

int main(void){
	//表示思考方式的2维数组
	int pattern[2][4]={{0,0,2,1},{1,0,0,2}};
	
	//连续输的次数
	int lose=0;
	
	//用来切换思考方式的变量(0和1之间切换)
	int p=0;
	
	//根据思考方式决定出拳信息
	int n=0;
	
//	对手的出拳
	int human;
	
	//计算机的出拳
	int computer;
	
//	设定随机数的种子
	srand(time(NULL)) ;
	
	//重复猜拳
	while(-1) {
		//对手决定猜拳信息
		printf("石头剪刀(0=石头,1=剪刀,2=布,其他=退出游戏).....");
		scanf("%d",&human);
		printf("布\n");
		
		//输入0,1,2以外的数值时游戏结束
		if(human<0||human>2) {
			break; 
		} 
		
		//计算机决定出拳信息
		computer=pattern[p][n];
		//不让下标超过3
		n=(n+1)%4; 
		//输出计算机的出拳信息
		if(computer==0){
			printf("计算机的出拳是:石头\n");
		} else if(computer==1){
			printf("计算机的出拳是:剪刀\n"); 
		}else{
			printf("计算机的出拳是:布\n"); 
		} 
		printf("\n");
		
		//记录计算机连续输拳的次数
		if((human==0&&computer==1)||(human==1&&computer==2)||(human==2&&computer==0)){
			lose++;
		} else{
			lose=0;
		}
		
		//连续输拳时变换思考方式
		if(lose>=2){
			p=(p+1)%2;
			n=0; 
		} 
	}
} 
