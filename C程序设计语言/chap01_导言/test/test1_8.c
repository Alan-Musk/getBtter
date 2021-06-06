#include <stdio.h>

int main(void){
    int c;//接受输入

    int space=0;//空格
    int t=0;//制表符
    int n=0;//换行符

    while((c=getchar())!=EOF){
        if(c==' '){
            ++space;
        }else if(c=='\t'){
            ++t;
        }else if(c=='\n'){
            ++n;
        }
        printf("space:%d\tt:%d\tn:%d\n",space,t,n);
    }
}