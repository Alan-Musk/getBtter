#include <stdio.h>
int main(){
    double distance;
    int time=0;
    double money=0;
    scanf("%lf %d",&distance,&time);
    if(distance>0&&distance<=3){
        money=10+time/5*2;
    }else if(distance>3&&distance<=10){
        money=10+(distance-3)*2+time/5*2;
    }else if(distance>10){
        money=10+14+(distance-10)*3+time/5*2;
    }
    printf("%.0f",money);
    return 0;
}
