#include <stdio.h>
int main(){
    int num,boolean;
    scanf("%d",&num);
    if(num>0){
        boolean=1;
    }else if(num==0){
        boolean=0;
    }else if(num<0){
        boolean=-1;
    }
    printf("sign(%d) = %d",num,boolean);
    return 0;
}
