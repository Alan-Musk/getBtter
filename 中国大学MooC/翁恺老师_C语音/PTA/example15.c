#include <stdio.h>
int main(){
    int num,result;
    scanf("%d",&num);
    result=num/16*10+num%16;
    printf("%d",result);
    return 0;
}
