#include <stdio.h>
//将0.1累加100次的C语言程序
int main(void){
    float sum;
    int i;
    //将保存总和的变量清0
    sum=0;
    // 0.1相加100次
    for ( i = 0; i < 100; i++)
    {
        sum+=0.5;
    }
    //显示结果
    printf("%.20f\n",sum);
}
