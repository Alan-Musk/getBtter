#include <stdio.h>

#define MAXLINE 1000 //允许的输入行最大长度

int getline(char line[], int maxline);
void copy(char to[], char from[]);

int main(void)
{
    int len;//当前行长度

    int max;//目前为止发现的最长行的长度
    char line[MAXLINE];//当前的输入行
    char longest[MAXLINE];//用于保存最长的行


    max = 0;
    len = getline(line, MAXLINE);
    while (len > 0) {
        printf("%d,%s",len,line);
        if (len > max) {
            max = len;
            copy(longest, line);
        }
    }
    //存在这样的行
    if (max > 0) {
        printf("%d,%s", len,longest);
    }

    return 0;
}

//getline函数:将一行读入s中并返回其长度
int getline(char s[], int lim) {
    int c, i,j;

    //防止数组越界,长度是1000,最多s[999]
    for (i = 0; i <(c = getchar()) != EOF && c != '\n'; ++i) {
        if(i<lim-2){
            s[j]=c;
            ++j;
        }
    }
    //判断有没有\n
    if (c == '\n') {
        s[j] = c;
       //测试 printf("1");
        ++j;
        ++i;
    }
    s[j] = '\0';
    return i;
}

//copy 函数:将form复制到to:这里假定to足够大
void copy(char to[], char from[]) {
    int i;
    i = 0;
    while ((to[i] = from[i]) != '\0') {
        ++i;
    }
}