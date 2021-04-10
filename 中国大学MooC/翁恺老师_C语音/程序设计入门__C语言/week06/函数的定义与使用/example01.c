#include <stdio.h>
int isPrime(int i){
    int ret=1;
    int k;
    for(k=2;k<i-1;k++){
        if(i%k==0){
            ret=0;
            break;
        }
    }
    return ret;
}
int main(){
    int m,n;
    int i=0;
    int sum=0;//
    int cnt=0;
    scanf("%d %d",&m,&n);
    if(m==1){
        m=2;
    }
    for(i=m;i<=n;i++){
        if(isPrime(i)){
            sum+=i;
            cnt++;
        }
    }
    printf("%d %d\n",cnt,sum);
}
