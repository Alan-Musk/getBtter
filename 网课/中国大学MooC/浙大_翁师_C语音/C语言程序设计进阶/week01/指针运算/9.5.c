#include <stdio.h>

int main(void)
{
    char ac[]={0,1,2,3,4,5,6,7,8,9,-1};
    char *p=ac;
    // char *p1=&ac[5];
    // print("p =%p\n",p);
    // printf("p+1=%p\n",p+1);
    // printf("*(p+1)=%d",*(p+1));
    // printf("p1-p=%d\n",p1-p);

    // int ai[]={0,1,2,3,4,5,6,7,8,9};
    // int *q=ai;
    // int *q1=&ai[6];
    // print("p =%p\n",q);
    // printf("p+1=%p\n",q+1);
    // printf("*(p+1)=%d",*(q+1));
    // printf("q1-q=%d\n",q1-q);
    int i;
    for(i=0;i<sizeof(ac)/sizeof(ac[0]);i++){
        printf("%d\n",ac[i]);
    }
    while(*p!=-1){
        printf("%d\n",*p++);
    }
    int ai[]={0,1,2,3,4,5,6,7,8,9};
    int *q=ai;
    return 0;
}