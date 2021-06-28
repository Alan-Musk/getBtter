#include <stdio.h>

int main(void){
    int c,after;
    after='a';
    while((c=getchar())!=EOF){
        if(c!=' '){
            putchar(c);
        }
        if(c==' '){
            if(after!=' '){
                putchar(c);
            }
        }
        after=c;
    }
}