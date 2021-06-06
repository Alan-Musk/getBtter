#include <stdio.h>

// 统计输入的行数

int main(void){
    int c,nl;

    nl=0;
    while((c=getchar())!=EOF){
        if(c=='\n'){
            ++nl;
            // printf("%d\n",nl);
        }
    }
    printf("%d\n",nl);
}