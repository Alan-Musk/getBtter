#include <stdio.h>

int main(void){
    // int 是整数的数据类型
    int sum;
    int i;

    // 将保存总和的变量清0
    sum=0;

    //将1相加100次
    for(i=0;i<=100;i++){
        sum+=1;
    }
    
    // 总和结果除以10
    sum/=10;

    //显示结果
    printf("%d\n",sum);
}
