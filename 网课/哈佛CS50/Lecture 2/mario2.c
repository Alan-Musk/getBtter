#include <stdio.h>
#include <cs50.h>

int main(void){
    int n=get_int("Number:");
    for(int i=0;i< n;i++){
        printf("?");
    }
    printf("\n");
}