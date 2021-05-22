#include <stdio.h>
#include <stdlib.h>

int main(void){
	//用来保存计算机出拳信息的变量
	int computer;
	//等待用户键盘输入
	printf("石头剪刀....");
	getchar();
	printf("布!\n");
	
	//计算机决定出拳
	srand(time(NULL));
	computer=rand()%10;
	
	//输出计算机的出拳信息
	if(computer>=0&&computer<=4){
		printf("计算机的出拳是:石头\n"); 
	} else if(computer>=5&&computer<=7){
		printf("计算机的出拳是:剪刀\n"); 
	}else{
		printf("计算机的出拳是:布\n"); 
	} 
}
