#include <stdio.h>
int main(){
int sum=0;
int t;
scanf("%d",&t);
while(t>0){
sum=sum*10+t%10;
t/=10;
}
printf("%d",sum);
return 0;
}