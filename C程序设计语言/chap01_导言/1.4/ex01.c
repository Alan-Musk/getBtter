#include <stdio.h>

// 表的下限
#define LOWER 0  
// 表的上限
#define UPPER 300
// 步长
#define STEP 20
// 打印华氏摄氏度-摄氏度温度对照表
int main()
{
    int fahr;
    for (fahr = LOWER; fahr <= UPPER; fahr+=STEP)
    {
        printf("%3d %6.1f\n",fahr,(5.0/9.0)*(fahr-32.0));
    }
    

    return 0;
}