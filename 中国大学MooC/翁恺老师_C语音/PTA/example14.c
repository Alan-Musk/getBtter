#include <stdio.h>
int main(){
    int hour=0;
    int min=0;
    int h=0;
    scanf("%d %d",&hour,&min);
        h=hour/100;
    int minutes=h*60+hour%100+min;
    //太恶心了,最后一个检查点是,当你的小时是个位数时,小时前面有没有0
    printf("%03d",minutes/60*100+minutes%60);
    return 0;
}
