#include <stdio.h>
//联系1-10
int main(){
    int c;
    while((c = getchar()) != EOF){
        switch(c){
            case '\t':
                putchar('\\');
                putchar('t');
                break;
            case '\b':
                putchar('\\');
                putchar('b');
                break;
            case '\\':
                putchar('\\');
                putchar('\\');
                break;
            default:
                putchar(c);
        }
    }

        return 0;
}