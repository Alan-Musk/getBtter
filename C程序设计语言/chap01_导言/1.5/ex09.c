#include <stdio.h>
//将输入复制到输出的程序,并将其中连续的多个空格用一个空格代替
int main()
{
    int c;
    int inspace;
    
    inspace=0;
    while ((c=getchar())!=EOF)
    {
        if (c==' ')
        {
            if (inspace==0)
            {
                inspace=1;
                putchar(c);
            }
            
        }
        if (c!=' ')
        {
            inspace=0;
            putchar(c);
        }
        
        
    }
    
    c=getchar();


    return 0;
}