#include <stdio.h>
int main(){
    int m,inch,foot;
    scanf("%d",&m);
    foot=m/100.0/0.3048;
    inch=(m/100.0/0.3048-foot)*12;
    printf("%d %d",foot,inch);
    return 0;
}
