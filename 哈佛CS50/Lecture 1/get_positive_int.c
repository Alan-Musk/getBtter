#include <cs50.h>
#include <stdio.h>

int get_positive_int(void);

int main(void){
    printf("正整数是:%d",get_positive_int());
}
int get_positive_int(void){
    int n;
    do{
        n=get_int("请输入一个正整数:");

    }while(n<0);
    return n;
}
