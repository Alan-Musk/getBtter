#include <cs50.h>
#include <stdio.h>

int sigma(int m);

int main(void){
    int n;
    do{
        n=get_int("请输入一个数");
    }while(n<1);
    int answer=sigma(n);
    printf("%i\n",answer);
}

int sigma(m){
    if(m<=0){
        return 0;
    }else{
        return (m+sigma(m-2));
    }
}