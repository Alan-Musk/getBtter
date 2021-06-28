#include <stdio.h>
#include <stdlib.h>

int main(void){
	//用来保存计算机 
	int computer;
	//等待用户键盘输入
	printf("石头剪刀.....") ;
	getchar();
	printf("布!\n") ;
	
	//计算机决定出拳
	srand(time(NULL));
	computer=rand()%3;
	
	//输出计算机的出拳信息
	if(computer==0){
		printf("计算机的出拳是:石头\n"); 
	} else if(computer==1){
		printf("计算机出拳是:剪刀\n"); 
	} else{
		printf("计算机出拳是:布\n"); 
	} 
} 
