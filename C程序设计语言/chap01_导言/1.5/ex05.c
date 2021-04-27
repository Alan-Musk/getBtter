#include <stdio.h>

int main()
{
    //统计输入的字符数:版本1
    long nc;
    nc=0;
    while (getchar()!= EOF)
    {
        ++nc;
    }
    printf("%ld\n",nc);

    return 0;
}