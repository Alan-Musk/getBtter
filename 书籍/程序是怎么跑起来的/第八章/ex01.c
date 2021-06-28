#include <windows.h>
#include <stdio.h>

//消息框的标题
char* title="示例程序1";

//返回两个参数的平均值的函数
double Average(double a,double b){
	return (a+b)/2;
} 
 
 //程序运行启始位置的函数
 int WINAPI WinMain(HINSTANCE h,HINSTANCE d,LPSTR s,int m){
 	double ave;//保存平均值的变量
	char buff[80];//保存字符串的变量
	
	//求解123，456的平均值
	ave=Average(123,456);
	
	//编写显示在消息框中的字符串
	sprintf(buff,"平均值=%f",ave);
	
	//打开消息框
	MessageBox(NULL,buff,title,MB_OK);
	
	return 0;
 } 
