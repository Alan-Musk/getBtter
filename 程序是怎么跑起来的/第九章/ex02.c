#include <stdio.h>

int main(void){
	//打开文件   alan:若没有myfile.txt文件,应用会创建 
	FILE *fp=fopen("MyFile.txt","w") ;
	
	//写入文件
	fputs("你好",fp) ; 
	
	//关闭文件
	fclose(fp); 
}
