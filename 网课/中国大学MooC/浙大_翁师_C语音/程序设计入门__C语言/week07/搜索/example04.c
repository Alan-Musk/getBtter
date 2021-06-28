#include <stdio.h>
int search(int k,int a[],int length){
    int ret=-1;
    int right=length-1;
    int left=0;
    while(right>=left){
        int mid=(left+right)/2;
        if(a[mid]==k){
            ret=mid;
            break;
        }else if(a[mid]>k){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }
    return ret;
}
int main(){
    int a[]={1,4,6,9,23,45,78,432};
    int ret=search(6,a,sizeof(a)/sizeof(a[0]));
    printf("%d",ret);
    return 0;
}
