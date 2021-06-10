#include <stdio.h>

//函数原型
void show(int fahr,int celsius);

int main(void){
    int fahr,celsius;
    show(fahr,celsius);
}
//函数定义
void show(int fahr,int celsius){
    int lower,upper,step;

    lower=0;
    upper=300;
    step=20;
    
    fahr=lower;
    while(fahr<=upper){
        celsius=5*(fahr-32)/9;
        printf("%d\t%d\n",fahr,celsius);
        fahr=fahr+step;
    }
}