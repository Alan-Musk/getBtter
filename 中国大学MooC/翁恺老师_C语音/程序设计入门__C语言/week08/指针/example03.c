#include <stdio.h>
int main(void){
    //取相邻变量的地址
    // int i=0;
    // int p;
    // printf("%p\n",&i);
    // printf("%p\n",&p);
    
    //取数组的地址
    int a[10];
    printf("%p\n",&a);
    printf("%p\n",a);
    printf("%p\n",&a[0]);
    printf("%p\n",&a[1]);
    return 0;
}
