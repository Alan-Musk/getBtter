#include <stdio.h>
#include <stdlib.h>

int main(void){
	//��ʾ˼����ʽ��2ά����
	int pattern[2][4]={{0,0,2,1},{1,0,0,2}};
	
	//������Ĵ���
	int lose=0;
	
	//�����л�˼����ʽ�ı���(0��1֮���л�)
	int p=0;
	
	//����˼����ʽ������ȭ��Ϣ
	int n=0;
	
//	���ֵĳ�ȭ
	int human;
	
	//������ĳ�ȭ
	int computer;
	
//	�趨�����������
	srand(time(NULL)) ;
	
	//�ظ���ȭ
	while(-1) {
		//���־�����ȭ��Ϣ
		printf("ʯͷ����(0=ʯͷ,1=����,2=��,����=�˳���Ϸ).....");
		scanf("%d",&human);
		printf("��\n");
		
		//����0,1,2�������ֵʱ��Ϸ����
		if(human<0||human>2) {
			break; 
		} 
		
		//�����������ȭ��Ϣ
		computer=pattern[p][n];
		//�����±곬��3
		n=(n+1)%4; 
		//���������ĳ�ȭ��Ϣ
		if(computer==0){
			printf("������ĳ�ȭ��:ʯͷ\n");
		} else if(computer==1){
			printf("������ĳ�ȭ��:����\n"); 
		}else{
			printf("������ĳ�ȭ��:��\n"); 
		} 
		printf("\n");
		
		//��¼�����������ȭ�Ĵ���
		if((human==0&&computer==1)||(human==1&&computer==2)||(human==2&&computer==0)){
			lose++;
		} else{
			lose=0;
		}
		
		//������ȭʱ�任˼����ʽ
		if(lose>=2){
			p=(p+1)%2;
			n=0; 
		} 
	}
} 
