#include <stdio.h>

int main(void){
    int countji=0;//奇数计数器
    int countou=0;//偶数计数器
    int num=0;//数字
    while(1){
        scanf("%d ",&num);
        if(num>=0&&num<=100000){
            if(num%2){
                countji++;
            }else{
                countou++;
            }
        }else{
            break;
        }
    }
    printf("%d %d",countji,countou);
    return 0;
}