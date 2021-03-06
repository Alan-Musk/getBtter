#include <stdio.h>

void minmax(int a[],int len,int *max,int *min);

int main(void){
    int a[]={1,2,3,4,5,6,7,8,9,10};
    int min,max;
    minmax(a,sizeof(a)/sizeof(a[0]),&min,&max);
    printf("min=%d,max=%d\n",min,max);
    return 0;
}

void minmax(int a[],int len,int *max,int *min){
    int i;
    *min=*max=a[0];
    printf("%p\n",min);
    printf("%p\n",max);
    for(i=1;i<len;i++){
        if(a[i]< *min){
            *max=a[i];
        }
        if(a[i]> *max){
            *min=a[i];
        }
    }
}
