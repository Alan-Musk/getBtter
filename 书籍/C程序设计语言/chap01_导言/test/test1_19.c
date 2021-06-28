#include <stdio.h>

#define MAXLINE 1000

int getline(char line[], int maxline);
void reverse(char s[]);

int main(void) {
    char line[MAXLINE]; //current input line


    while (getline(line, MAXLINE) > 0) {
        reverse(line);
        printf("%s", line);
    }

    return 0;
}

//返回长度函数思路:定义变量c接受getchar,i=长度,j用来做数组的下标赋值
//由于getchar()递增,所以直接放入s[j]就好了
//考虑最长长度是1000 设置字符串边界判断
//如果假定max是3 输入alan输出a
//因为s[2]='\0' s[1]='\n'因为\n代表输入结束 s[0]='a'
int getline(char s[], int lim) {
    int c, i, j;

    j = 0;
    for (i = 0;
        (c = getchar()) != EOF; i++) {
        if (i < lim - 2) {
            s[j] = c; //line still in boundaries
            ++j;
        }
        if (c == '\n') {
            s[j] = c;
            ++j;
            ++i;
        }
    }
    s[j] = '\0';
    return i;
}

void reverse(char s[]) {
    int i, j;
    char temp;

    i = 0;
    while (s[i] != '\0') {
        ++i;
    }
    //因为防止得到的字符串的第一个字符不会成为一个字符串结束符\0
    --i;
    //如果遇到\n再倒退一个
    if (s[i] == '\n') {
        --i;
    }
    j = 0;
    while (j < i) {
        temp = s[j];
        s[j] = s[i];
        s[i] = temp;
        --i;
        ++j;
    }
}