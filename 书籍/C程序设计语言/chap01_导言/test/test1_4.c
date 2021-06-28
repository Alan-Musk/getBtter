#include <stdio.h>

//当celsius=0,20,...,300时,打印摄氏温度与华氏温度对照表

int main(void){
    float fahr,celsius;
    int lower,upper,step;

    lower=0;//温度表的下限
    upper=300;//温度表的上限
    step=20;//步长

    celsius=lower;
    while(celsius<=upper){
        fahr=celsius/(5.0/9.0)+32.0;
        printf("%3.0f\t%6.1f\t\n",celsius,fahr);
        celsius=celsius+step;
    }
}