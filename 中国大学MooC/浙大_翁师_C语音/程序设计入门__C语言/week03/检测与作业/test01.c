#include <stdio.h>

int main(void){
    int bjt=0;
    int uct=0;
    scanf("%d",&bjt);
    if(bjt>=0&&bjt<=2359){
        if((bjt-800)<0){
            uct=bjt+2400-800;
        }else{
            uct=bjt-800;
        }
    }
    printf("%d",uct);
    return 0;
}