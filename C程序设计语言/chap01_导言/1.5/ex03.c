#include <stdio.h>
//验证表达式getchar()!=EOF的值是0还是1
int main()
{
    int c;
    if (getchar()!=EOF)
    {
        printf("getchar()!=EOF的值是1");
    }else{
        printf("getchar()!=EOF的值是0");
    }
    

    return 0;
}