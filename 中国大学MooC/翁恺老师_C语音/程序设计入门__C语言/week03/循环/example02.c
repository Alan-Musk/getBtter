#include <stdio.h>
int main(){
    int num=0;
    int x=0;
    scanf("%d",&x);
    num++;
    x=x/10;
    while(x>0){
        num++;
        x=x/10;
    }
    printf("%d位",num);
    return 0;
}
