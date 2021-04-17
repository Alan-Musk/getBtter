#include <stdio.h>
struct{
    int amount;
    char *name;
}coins[]={
    {1,"penny"},
    {5,"nickel"},
    {10,"dime"},
    {25,"quarter"},
    {50,"hale-dollar"}
};
int main(){
    int k=25;
    for(int i=0;i<sizeof(coins)/sizeof(coins[0]);i++){
        if(k==coins[i].amount){
            printf("%s",coins[i].name);
            break;
        }
    }
    return 0;
}
