#include <stdio.h>
int main(){
    int x;
    int one,two,five;
    int exit=0;
    scanf("%d",&x);
    for(one=1;one<x*10;one++){
        for(two=1;two<x*10/2;two++){
            for(five=1;five<x*10/5;five++){
                if(one+two*2+five*5==x*10){
                    printf("1角:%d 2角:%d 5角:%d 得到%d元",one,two,five,x);
                    goto out;
                    // exit=1;
                    // break;
                }
            }
            // if(exit==1){
            //     break;
            // }
        }
        // if(exit==1){
        //     break;
        // }
    }
    out:
    return 0;
}
