#include <stdio.h>
#include <stdlib.h>

int main(void){
	//对手的出拳
	int human;
	
	//假设对手刚刚出了石头
	int prev=0;
	
	//记忆对手出拳信息的2维数组
	int memory[3][3] ={{0,0,0},{0,0,0},{0,0,0}};
	
	//预测的对手出拳信息
	int max;
	
	//猜拳的回合数
	int counter=0;
	
	//计算机的出拳
	int computer;
	
	//设定随机数的种子
	srand(time(NULL)) ;
	
	//重复猜拳
	while(-1){
		//对手决定出拳信息
		printf("石头剪刀(0=石头,1=剪刀,2=布,其他=退出游戏)......");
		scanf("%d",&human) ;
		printf("布\n");
		
		//输出0,1,2以外的数值时结束游戏
		if(human<0||human>2){
			break;
		} 
		
		//记录猜拳的回合数
		counter++;
		
		//计算机决定出拳信息
		if(counter<10){
			computer=rand()%3;
		} else{
			//高于10次,根据记忆出拳
			max=0;
			if(memory[prev][max]<memory[prev][1]){
				max=1;
			} 
			if(memory[prev][max]<memory[prev][2]){
				max=2;
			}
			computer=(max+2)%3;
		}
		
		//输出计算机的出拳信息
		if(computer==0){
			printf("计算机的出拳是:石头\n");
		} else if(computer==1){
			printf("计算机的出拳是:剪刀\n");
		}else{
			printf("计算机的出拳是布"); 
		}
		printf("\n");
		
		//记录对手的出拳信息
		memory[prev][human]++;
		prev=human; 
	} 
} 
