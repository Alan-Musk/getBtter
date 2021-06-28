#include <cs50.h>
#include <stdio.h>
#include <string.h>

#include "struct.h"

int main(void){
    //输入多少学生
    int enrollment=get_int("Enrollment:");
    // 调用头文件创造的数据类型
    student students[enrollment];
    //输入
    for(int i=0;i<enrollment;i++){
        students[i].name=get_string("Name:");
        students[i].dorm=get_string("Dorm:");
    }
    //输出
    for(int i=0;i<enrollment;i++){
        printf("%s is in %s\n",students[i].name,students[i].dorm);
    }
}