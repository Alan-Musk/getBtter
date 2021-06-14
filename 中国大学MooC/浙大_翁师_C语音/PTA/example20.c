#include <stdio.h>
int main(){
    int sum,a;
    char op;
    scanf("%d%c",&sum,&op);
    while(op!='='){
        scanf("%d",&a);
        switch(op){
            case '+':
                sum+=a;
                break;
            case '-':
                sum-=a;
                break;
            case '/':
                if(a==0){
                    printf("ERROR");
                    return 0;
                }
                sum/=a;
                break;
            case '*':
                sum*=a;
                break;
            default:
                printf("ERROR");
                return 0;
        }
        scanf("%c",&op);
    }
    printf("%d",sum);
    return 0;
}
