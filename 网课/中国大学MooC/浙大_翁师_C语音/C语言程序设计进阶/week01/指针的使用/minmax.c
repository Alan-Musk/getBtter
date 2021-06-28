#include <stdio.h>

//函数原型中参数自定义不在于顺序 main中调用需要与下方具体定义相匹配
void minmax(int a[],int len,int *max,int *min);

int main(void){
    int a[]={1,2,3,4,5,6,7,8,9,44,33,2,1234,55,};
    int min,max;
    minmax(a,sizeof(a)/sizeof(a[0]),&max,&min);
    printf("min=%d,max=%d\n",min,max);

    return 0;
}

void minmax(int a[],int len,int *max,int *min){
    int i;
    *min=*max=a[0];
    for(i=1;i<len;i++){
        //一个数已经大于该数的情况下,无法再小于了,节省运算
        if(a[i]<*min){
            *min=a[i];
        }else if(a[i]>*max){
            *max=a[i];
        }

    }
}