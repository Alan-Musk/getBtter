#include <stdio.h>
int main(){
    int num1,num2;
    int max=0;//最大公约数
    int min=0;//最小公倍数
    scanf("%d %d",&num1,&num2);
    if(num1>=num2){
        max=num1;
        min=num2;
    }else{
        max=num2;
        min=num1;
    }
    //最大公约数
    while(num1%min!=0||num2%min!=0){
        min--;
    }
    //最小公倍数
    while(max%num1!=0||max%num2!=0){
        max++;
    }
    printf("%d %d",min,max);
    return 0;
    
}
