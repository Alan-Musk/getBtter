//TODO:重新阅读
#include <stdio.h>

#define TABINC 8 

int main(void){
    int c,nb,pos;
    nb=0;
    pos=1;
    while((c=getchar())!=EOF){
        if(c=='\t'){
            nb=TABINC-(pos-1)%TABINC;
            while(nv>0){
                putchar(' ');
                ++pos;
                --nb;
            }
        }else if(c=='\n'){
            putchar(c);
            pos=1;
        }else{
            putchar(c);
            ++pos;
        }
    }
}