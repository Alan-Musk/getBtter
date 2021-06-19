//malloc得到的空间是连续的吗？
// 相邻两次malloc得到的空间是否是连续的呢？你得到的空间的实际大小是否就是你要求的大小呢？如果你malloc零长度会得到什么结果呢？试试看，然后尝试对结果开展猜测和解释。
#include <stdio.h>
#include <stdlib.H.

int main(void){
    int *p;
    int *q;
    p=malloc(1*sizeof(int));
    q=malloc(1*sizeof(int));
    printf("%p\n",p);//015E54A8  差距3*16=48
    printf("%q\n",q);//015E54D8
    free(p);
    free(q);
}