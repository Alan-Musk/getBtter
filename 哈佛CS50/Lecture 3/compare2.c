#include <cs50.h>
#include <stdio.h>
#include <string.h>

bool compare_string(string s,string t);

int main(void){
    string s=get_string("s:");
    string t=get_string("t:");

    if(compare_string(s,t)){
        printf("same\n");
    }else{
        printf("different\n");
    }
}
bool compare_string(string s,string t){
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
