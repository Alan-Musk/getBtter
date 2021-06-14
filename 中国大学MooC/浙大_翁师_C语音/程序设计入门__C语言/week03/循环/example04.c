#include <stdio.h>
int main(){
    int x;
    scanf("%d",&x);
    int num=1;
    int sum=1;
    for(num=1;num<=x;num++){
        sum *=num;
    }
    printf("%d",sum);
    return 0;
}
