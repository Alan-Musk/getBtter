#include <stdio.h>
int main(){
    int sum=0;
    int num=0;
    do{
        scanf("%d",&num);
        if(num%2!=0&&num>0){
            sum+=num;
        }
    }while(num>0);
    printf("%d",sum);
    return 0;
}
