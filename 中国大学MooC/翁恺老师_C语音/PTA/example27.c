#include <stdio.h>
int main(){
    int sum=1;
    int n=1;
    int num;
    scanf("%d",&num);
    int m1=0,m2=1,m3=0;
    while(sum<num){
        m3=m1+m2;
        m1=m2;
        m2=m3;
        sum=m2;
        n++;
    }
    printf("%d",n);
    return 0;
    //斐波那契数列
}
