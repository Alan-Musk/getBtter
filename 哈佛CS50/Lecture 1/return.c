#include <cs50.h>
#include <stdio.h>

int square(int n){
    return n*n;
}
int main(void){
    int num=get_int("num:");
    printf("%d\n",square(num));
}
