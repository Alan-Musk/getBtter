#include <stdio.h>

//在单词内
#define IN 1
#define OUT 0 //在单词外

// 统计输入的行数,单词数与字符数
int main(void){
    //nl:行数 nw:单词数 nc:字符数
    int c,nl,nw,nc,state;

    state=OUT;
    nl=nw=nc=0;
    while((c=getchar())!=EOF){
        ++nc;
        if(c=='\n'){
            ++nl;
        }
        if(c==' '||c=='\n'||c=='\t'){
            state=OUT;
        }else if(state==OUT){
            state=IN;
            ++nw;
        }
        //测试用
        // printf("%d %d %d\n",nl,nw,nc);
    }
    printf("%d %d %d\n",nl,nw,nc);
}