#include <stdio.h>
int search(int key,int a[],int length){
    int ret=-1;
    for(int i=0;i<length;i++){
        if(key==a[i]){
            ret=i;
            break;
        }
    }
    return ret;
}
int main(){
    int a[]={1,32,525,3634,131,252,35,234,6,67,9};
    int ret=search(43242,a,sizeof(a)/sizeof(a[0]));
    printf("%d",ret);
    return 0;
}
