#include <stdio.h>

int main(void){
    int num=0;//输入的数
    int t=0;//判断位数的数
    int count=0;//位数
    int n=1;
    scanf("%d",&num);
    //负数判断
    if(num<0){
        printf("fu ");
        num=num*-1;
    }else if(num==0){
        printf("ling");
    }
    t=num;
    //判断位数
    while(t>0){
        t=t/10;
        count++;
    }
    t=num;
    //使用switch,通过判断位数,来决定是否进行循环,解决了数量为0的问题
    while(count>0){
        n=1;//防止下面n干扰
        for(int i=1;i<count;i++){
            n=n*10;
        }
        t=num/n;
        switch(t){
            case 1:
                printf("yi");
                break;
            case 2:
                printf("er");
                break;
            case 3:
                printf("san");
                break;
            case 4:
                printf("si");
                break;
            case 5:
                printf("wu");
                break;
            case 6:
                printf("liu");
                break;
            case 7:
                printf("qi");
                break;
            case 8:
                printf("ba");
                break;
            case 9:
                printf("jiu");
                break;
            case 0:
                printf("ling");
                
                break;
        }
        num=num%n;
        count--;
        if(count>0){
            printf(" ");
        }
        
    }
    
    return 0;
}
