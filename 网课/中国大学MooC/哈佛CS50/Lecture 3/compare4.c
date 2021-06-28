#include <stdio.h>
#include <cs50.h>
#include <string.h>

int main(void){
    char *s=get_string("S:");
    if(s==0){
        return 1;
    }
    char *t=get_string("T:");
    if(t==0){
        return 1;
    }

    if(strcmp(s,t)==0){
        printf("same\n");
    }else{
        printf("different\n");
    }
    return 0;
}