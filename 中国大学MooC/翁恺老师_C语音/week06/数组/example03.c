#include <stdio.h>
int main(){
    int x;
    double sum=0;
    int cnt;
    printf("请输入数字的数量");
    scanf("%d",&cnt);
    if(cnt>0){
        int number[cnt];
        scanf("%d",&x);
        while(x!=-1){
            number[cnt]=x;
            sum+=x;
            cnt++;
            scanf("%d",&x);
        }
    }
    return 0;
}
