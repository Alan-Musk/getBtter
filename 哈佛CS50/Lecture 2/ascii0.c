#include <stdio.h>
#include <string.h>
#include <cs50.h>

int main(void){
    string name=get_string("Name:");
    for(int i=0;i<strlen(name);i++){
        printf("%c %i\n",name[i],(int)name[i]);
    }
    return 0;
}