#include <stdio.h>
#include <time.h>

int main(void){
	//保存当前日期和时间信息的变量
	time_t tm;
	//取得当前的日期和时间
	time(&tm);
	//在显示器上显示日期和时间
	printf("%s\n",ctime(&tm)); 
} 
