#include <stdio.h>
#include <time.h>

int main(void){
	//���浱ǰ���ں�ʱ����Ϣ�ı���
	time_t tm;
	//ȡ�õ�ǰ�����ں�ʱ��
	time(&tm);
	//����ʾ������ʾ���ں�ʱ��
	printf("%s\n",ctime(&tm)); 
} 
