#include <stdio.h>

int main(void){
	//���ļ�   alan:��û��myfile.txt�ļ�,Ӧ�ûᴴ�� 
	FILE *fp=fopen("MyFile.txt","w") ;
	
	//д���ļ�
	fputs("���",fp) ; 
	
	//�ر��ļ�
	fclose(fp); 
}
