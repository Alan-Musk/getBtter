#include <stdio.h>

// 当fahr=0,20,...,300时华氏温度与摄氏温度的对照表

int main(void){
    int fahr;//华氏度
    int celsius;//摄氏度
    int lower,upper,step;

    lower=0;//温度表的下限
    upper=300;//温度表的上限
    step=20;//步长

    fahr=lower;
    while(fahr<=upper){
        celsius=5*(fahr-32)/9;
        printf("%3d\t%6d\n",fahr,celsius);
        fahr=fahr+step;
    }
}