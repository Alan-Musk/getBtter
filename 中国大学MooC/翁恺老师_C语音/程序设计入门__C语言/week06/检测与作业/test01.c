#include <stdio.h>
//思路是分成两个部分输出,整数部分和小数部分
int main(void){
    int number=0;//除数
    int num=0;//被除数
    int sum=0;//整数部分
    const int decimal=200;//要计算到的小数位,耦合更低
    int remainder=0;//余数
    scanf("%d/%d",&num,&number);
    if(number!=0){
        //整数部分
        sum=num/number;
        printf("%d.",sum);
        //小数部分
        for (int i = 0; i < decimal; i++)
        {
            remainder=num%number;
            num=remainder*10/number;
            if(num==0){
                break;
            }
            printf("%d",num);
        }
        
    }
    return 0;
}