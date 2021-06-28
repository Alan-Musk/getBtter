#include <cs50.h>
#include <stdio.h>

int main(void){
    char c=get_char("Answer:");
    switch (c){
        case 'y':
        case 'Y':
            printf("Yes\n");
            break;
        case 'n':
        case 'N':
            printf("No\n");
            break;
    }
}