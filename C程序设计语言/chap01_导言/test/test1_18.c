#include <stdio.h>
#define MAXLINE 1000 //输入的一行最多的尺寸

int getline(char line[], int maxline);
int remove(char s[]);

//remove trailing blanks and tabs ,and delete blank lines
int main(void) {
    char line[MAXLINE];//current input line

    while (getline(line, MAXLINE) > 0) {
        if (remove(line) > 0) {
            printf("%s", line);
        }
    }
    return 0;
}

//getline:read a line into s,return length 将一行读入s中并返回其长度
int getline(char s[], int lim) {
    int c, i, j;

    j = 0;
    //存入 ++i长度
    for (i = 0; (c = getchar()) != EOF && c != '\n'; ++i) {
        if (i < lim - 2) {
            s[j] = c;
            ++j;
        }
    }
    if (c == '\n') {
        s[j] = c;
        ++j;
        ++i;
    }
    s[j] = '\0';

    return i;
}
//remove trailing blanks and tabs from character string s
int remove(char s[]) {
    int i;

    i = 0;
    while (s[i] != '\n') {
        ++i;
    }
    //检查的时候符合s[i]下标
    --i;
    //从后往前检查
    while (i >= 0 && (s[i] == ' ' || s[i] == '\t')) {
        --i;
    }
    if (i >= 0) {
        ++i;
        s[i] = '\n';
        ++i;
        s[i] = '\0';
    }
    return i;
}

