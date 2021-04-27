#include <stdio.h>
//编写一个统计空格,制表符与换行符个数的程序
int main()
{
    int space=0;//空格
    int lt=0;//制表符
    int c,nl;
    nl=0;
    while ((c=getchar())!=EOF)
    {
        if(c=='\n'){
            printf("换行符+1\n");
            ++nl;
        }
        if(c==' '){
            printf("空格+1\n");
            ++space;
        }
        if (c=='\t')
        {
            printf("制表符+1\n");
            ++lt;
        }
        
        printf("%d %d %d\n",nl,space,lt);
    }
    

    return 0;
}