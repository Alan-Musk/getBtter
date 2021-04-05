#include <stdio.h>
int main(){
    int num=0;
    int day=0;
    scanf("%d",&num);
    if(num>=1&&num<=5){
        day=num+2;
    }else if(num>5&&num<=7){
        day=num+2-7;
    }
    printf("%d",day);
    return 0;
}
