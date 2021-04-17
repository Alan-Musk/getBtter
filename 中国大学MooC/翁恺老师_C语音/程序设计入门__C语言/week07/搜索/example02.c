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
    int amount[]={1,5,10,25,50};
    char *name[]={"penny","nickel","dime","quarter","hale-dollar"};
    int num=search(10,amount,sizeof(amount)/sizeof(amount[0]));
    if(num>-1){
        printf("%s\n",name[num]);
    }
    return 0;
}
