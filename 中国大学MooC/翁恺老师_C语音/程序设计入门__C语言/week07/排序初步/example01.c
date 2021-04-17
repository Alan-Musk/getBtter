#include <stdio.h>
int max(int a[],int len){
    int maxid=0;
    for(int i=1;i<len;i++){
        if(a[i]>a[maxid]){
            maxid=i;
        }
    }
    return maxid;
}
int main(){
    int a[]={2,45,631,12,87,34,20,4,2433,1,3215};
    int len=sizeof(a)/sizeof(a[0]);
    for(int i=len-1;i>0;i--){
        //+1的作用使传入的长度是标准长度的,上面i=len-1是下标
        int maxid=max(a,i);
        int t=a[maxid];
        a[maxid]=a[i];
        a[i]=t;
    }
    for(int i=0;i<len;i++){
        printf("%d\t",a[i]);
    }
    return 0;
}
