#include <cs50.h>
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

int main(void){
    char *s=get_string("s:");
    if(!s){
        return 1;
    }
    //给t申明内存
    char *t=malloc((strlen(s)+1)*sizeof(char));
    if(!t){
        return 1;
    }
    //为什么+1因为是字符串,后面跟了一个\0,而strlen没法识别\0
    for(int i=0,n=strlen(s)+1;i<n;i++){
        t[i]=s[i];
    }
    //大写
    if(strlen(t)>0){
        t[0]=toupper(t[0]);
    }
    //输出
    printf("s:%s\n",s);
    printf("t:%s\n",t);

    return 0;
}