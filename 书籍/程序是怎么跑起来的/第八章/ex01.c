#include <windows.h>
#include <stdio.h>

//��Ϣ��ı���
char* title="ʾ������1";

//��������������ƽ��ֵ�ĺ���
double Average(double a,double b){
	return (a+b)/2;
} 
 
 //����������ʼλ�õĺ���
 int WINAPI WinMain(HINSTANCE h,HINSTANCE d,LPSTR s,int m){
 	double ave;//����ƽ��ֵ�ı���
	char buff[80];//�����ַ����ı���
	
	//���123��456��ƽ��ֵ
	ave=Average(123,456);
	
	//��д��ʾ����Ϣ���е��ַ���
	sprintf(buff,"ƽ��ֵ=%f",ave);
	
	//����Ϣ��
	MessageBox(NULL,buff,title,MB_OK);
	
	return 0;
 } 
