#include <stdio.h>
#include <stdlib.h>

int main(void){
	//������������ 
	int computer;
	//�ȴ��û���������
	printf("ʯͷ����.....") ;
	getchar();
	printf("��!\n") ;
	
	//�����������ȭ
	srand(time(NULL));
	computer=rand()%3;
	
	//���������ĳ�ȭ��Ϣ
	if(computer==0){
		printf("������ĳ�ȭ��:ʯͷ\n"); 
	} else if(computer==1){
		printf("�������ȭ��:����\n"); 
	} else{
		printf("�������ȭ��:��\n"); 
	} 
} 
