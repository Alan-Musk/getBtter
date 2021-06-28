#include <cs50.h>
#include <stdio.h>

int main(void){
    //用户输入第一个数
    int x=get_int("请输入第一个数:");
    // 用户输入第二个数
    int y=get_int("请输入第二个数:");
    //四则运算 取余
    printf("x+y=%d\n",x+y);
    printf("x-y=%d\n",x-y);
    printf("x/y=%.1f\n",(float)x/y);
    printf("x*y=%d\n",x*y);
    printf("x made y=%d\n",x%y);

}
