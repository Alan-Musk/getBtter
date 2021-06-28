#include <cs50.h>
#include <stdio.h>
#include <string.h>

bool compare_string(char *s,char *t);

int main(void){
    char *s=get_string("s:");
    char *t=get_string("t:");

    if(compare_string(s,t)){
        printf("same\n");
    }else{
        printf("different\n");
    }
}
bool compare_string(char *s,char *t){
    if(strlen(s)!=strlen(t)){
        return false;
    }
    for(int i=0,n=strlen(s);i<n;i++){
        if(s[i]!=t[i]){
            return false;
        }
    }
    return true;
}
