#include <stdio.h>
#include <stdlib.h>

int main(void){
	//��������������ȭ��Ϣ�ı���
	int computer;
	//�ȴ��û���������
	printf("ʯͷ����....");
	getchar();
	printf("��!\n");
	
	//�����������ȭ
	srand(time(NULL));
	computer=rand()%10;
	
	//���������ĳ�ȭ��Ϣ
	if(computer>=0&&computer<=4){
		printf("������ĳ�ȭ��:ʯͷ\n"); 
	} else if(computer>=5&&computer<=7){
		printf("������ĳ�ȭ��:����\n"); 
	}else{
		printf("������ĳ�ȭ��:��\n"); 
	} 
}
