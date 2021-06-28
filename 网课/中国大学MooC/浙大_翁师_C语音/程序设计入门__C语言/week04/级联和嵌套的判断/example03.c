#include <stdio.h>
int main(){
    int x=0;
    int f=0;
    scanf("%d",&x);
    if(x<0){
        f=-1;
    }else if(x==0){
        f=0;
    }else{
        f=2*x;
    }
    printf("%d %d",x,f);
    return 0;
}
