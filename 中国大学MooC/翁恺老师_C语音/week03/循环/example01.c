#include <stdio.h>
int main(){
    int num=1;
    int x=0;
    scanf("%d",&x);
    num++;
    if(x>999){
        num=4;
    }else if(x>99){
        num=3;
    }else if(x>9){
        num=2;
    }
    printf("%d",num);
    return 0;
}
