#include <stdio.h>

int main(void){
    int num=0;//输入的数字
    int cun=1;//位数
    int sum=0;//总和
    int a=1;//位数代表的数字
    scanf("%d",&num);
    while(num>0){
        //判断奇偶是否相等
        if((num%10)%2==cun%2){
            sum=sum+a;
        }
        cun++;
        num=num/10;
        a=a*2;//每次迭代二进制表示的数字就*2
    }
    printf("%d",sum);
    return 0;
}
