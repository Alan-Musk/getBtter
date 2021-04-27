#include <stdio.h>

#define IN 1
#define OUT 0
int main(void)
{
    char c,state;
    state=OUT;
    while ((c=getchar())!=EOF)
    {
        if (c==' ')
        {
            continue;
        }
        printf("%c\n",c);
    }
    

    return 0;
}