#include <stdio.h>

enum COLOR {RED,YELLOW,GREEN,NumCOLORS};

int main(int agrc,char const *argv[]){
    int color=-1;
    char *ColorNames[NumCOLORS]={
        "red","yellow","green",
    };
    char *colorName=NULL;

    printf("输入你喜欢的颜色代码:");
    scanf("%d",&color);
    if(color>=0&&color<NumCOLORS){
        colorName=ColorNames[color];
    }else{
        colorName="unknow";
    }
    printf("你喜欢的颜色是%s\n",colorName);

    return 0;
}