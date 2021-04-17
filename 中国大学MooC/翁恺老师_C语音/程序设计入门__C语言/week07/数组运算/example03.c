#include <stdio.h>
int main(){
    const int maxNumber=25;
    int isPrime[maxNumber];
    int i;
    int x;
    //全部标记初始化1
    for(i=0;i<maxNumber;i++){
        isPrime[i]=1;
    }
    for(x=2;x<maxNumber;x++){
        if(isPrime[x]){//判断是否是1,节省运算
            for(i=2;i*x<maxNumber;i++){
                isPrime[i*x]=0;
            }
        }
    }
    //最后结果输出的是数组的下标,而且求素数,从2开始
    for(i=2;i<maxNumber;i++){
        if(isPrime[i]){
            printf("%d\t",i);
        }
    }
    printf("\n");
    return 0;
}
