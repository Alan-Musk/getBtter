#include <stdio.h>

// 统计输入的字符数
int main(void){
    long nc;
    nc=0;
    while(getchar()!=EOF){
        ++nc;
        // printf("%ld\n",nc);
    }
    printf("%ld\n",nc);
}