#include <stdio.h>
int main(void){
    //获取变量的地址
    int i=0;
    int p;
    p=(int)&i;
    printf("ox%x\n",p);
    printf("%p\n",&i);
    printf("%lu\n",sizeof(int));
    printf("%lu\n",sizeof(&i));
    return 0;
}
