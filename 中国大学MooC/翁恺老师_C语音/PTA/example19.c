#include <stdio.h>
// alan做题背景学过java数组
int main(){
    int year,mon,day,i,b;
    int a[12]={31,28,31,30,31,30,31,31,30,31,30,31};
    b=0;
    scanf("%d/%d/%d",&year,&mon,&day);
    if((year%4==0&&year%100!=0)||year%400==0){
        a[1]=29;
    }
    for(i=0;i<mon-1;i++){
         b=b+a[i];
    }
    b=b+day;
    printf("%d",b);
    return 0;
}
