#include <stdio.h>

#define MAXLINE 1000 //允许的输入行的最大长度

int max;//到目前为止发现的最长行的长度
char line[MAXLINE];//当前的输入行
char longest[MAXLINE];//用于保存最长的输入行

int getline(void);
void copy(void);

//打印最长的输入行:特别版本
int main(void){
    int len;
    extern int max;
    extern char longest[];

    max=0;
    while((len=getline())>0){
        if(len>max){
            max=len;
            copy();
        }
    }
    if(max>0){
        printf("%s",longest);
    }
    return 0;
}

int getline(void){
    int c;//接受getchar
    int i;//返回长度
    extern char line[];

    for(i=0;i<MAXLINE-1&&(c=getchar())!=EOF&&c!='\n';++i){
        line[i]=c;
    }
    if(c=='\n'){
        line[i]=c;
        ++i;
    }
    line[i]='\0';
    return i;
}

void copy(void){
    int i;
    extern char line[],longest[];

    i=0;
    while((longest[i]=line[i])!='\0'){
        ++i;
    }
}