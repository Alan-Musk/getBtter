#include <stdio.h>
int main(){
    int num=0;
    int count=1;
    int sum=0;
    scanf("%d",&num);
    while(num/10>0){
        count++;
        sum=sum+num%10;
        num/=10;
    }
    sum=sum+num;
    printf("%d %d",count,sum);
    return 0;
}
