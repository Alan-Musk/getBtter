#include <stdio.h>
#include <cs50.h>

int main(void){
    int n;
    //输入是负数的时候重新输入
    do{
        n=get_int("Number:");
    }while(n<=0);
    for(int i=0;i< n;i++){
        printf("#\n");
    }
}