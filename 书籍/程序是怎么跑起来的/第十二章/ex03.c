#include <stdio.h>
#include <stdlib.h>

int main(void){
	//���ֵĳ�ȭ
	int human;
	
	//������ָոճ���ʯͷ
	int prev=0;
	
	//������ֳ�ȭ��Ϣ��2ά����
	int memory[3][3] ={{0,0,0},{0,0,0},{0,0,0}};
	
	//Ԥ��Ķ��ֳ�ȭ��Ϣ
	int max;
	
	//��ȭ�Ļغ���
	int counter=0;
	
	//������ĳ�ȭ
	int computer;
	
	//�趨�����������
	srand(time(NULL)) ;
	
	//�ظ���ȭ
	while(-1){
		//���־�����ȭ��Ϣ
		printf("ʯͷ����(0=ʯͷ,1=����,2=��,����=�˳���Ϸ)......");
		scanf("%d",&human) ;
		printf("��\n");
		
		//���0,1,2�������ֵʱ������Ϸ
		if(human<0||human>2){
			break;
		} 
		
		//��¼��ȭ�Ļغ���
		counter++;
		
		//�����������ȭ��Ϣ
		if(counter<10){
			computer=rand()%3;
		} else{
			//����10��,���ݼ����ȭ
			max=0;
			if(memory[prev][max]<memory[prev][1]){
				max=1;
			} 
			if(memory[prev][max]<memory[prev][2]){
				max=2;
			}
			computer=(max+2)%3;
		}
		
		//���������ĳ�ȭ��Ϣ
		if(computer==0){
			printf("������ĳ�ȭ��:ʯͷ\n");
		} else if(computer==1){
			printf("������ĳ�ȭ��:����\n");
		}else{
			printf("������ĳ�ȭ�ǲ�"); 
		}
		printf("\n");
		
		//��¼���ֵĳ�ȭ��Ϣ
		memory[prev][human]++;
		prev=human; 
	} 
} 
