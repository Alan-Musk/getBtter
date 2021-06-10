#include <stdio.h>

#define MAXLINE 1000 //允许的输入行最大长度

int getline(char line[], int maxline);

int main(void)
{
    int len;//当前行长度

    char line[MAXLINE];//当前的输入行

    max = 0;
    while ((len = getline(line, MAXLINE))> 0) {
        if (len > 80) {
            printf("%s", line);
        }
    }
    return 0;
}

//getline函数:将一行读入s中并返回其长度
int getline(char s[], int lim) {
    int c, i;

    //防止数组越界,长度是1000,最多s[999]
    for (i = 0; i < lim - 1 && (c = getchar()) != EOF && c != '\n'; ++i) {
        s[i] = c;
    }
    //判断有没有\n
    if (c == '\n') {
        s[i] = c;
        //测试 printf("1");
        ++i;
    }
    s[i] = '\0';
    return i;
}