#include <stdio.h>

int main(void){
    int num=0;
    int i=0;
    scanf("%d",&num);
    for(i=1;i<=num;i=i+2){
        printf("%d",i);
        //判断输入空格
        if((i+2)<=num){
        printf(" ");
        }
    }
    return 0;
}
