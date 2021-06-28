#include <stdio.h>
#include <string.h>

char* mycpy(char *dst,const char *src){
    int idx=0;
    while(src[idx]){
       dst[idx]=src[idx];
       idx++;
    }
    dst[idx]='\0';

    return dst;
}
int main(int argc,char const *argv[]){
    char s1[]="abc";
    char s2[]="abda";
    mycpy(s1,s2);
    printf("%c\n",s1[3]);
    return 0;
}