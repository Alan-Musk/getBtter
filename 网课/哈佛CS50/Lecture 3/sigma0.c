#include <cs50.h>
#include <stdio.h>

int sigma(int m);

int main(void){
    int n;
    do{
        n=get_int("输入一个数:");
    }while(n<1);
    int answer=sigma(n);
    printf("%i\n",answer);
}

int sigma(int m){
    int sum=0;
    for(int i=1;i<=m;i++){
        sum=sum+i;
    }
    return sum;
}