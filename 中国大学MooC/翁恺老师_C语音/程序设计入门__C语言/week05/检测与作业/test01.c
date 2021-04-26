#include <stdio.h>

int main(void){
    //以我当前鼠目寸光看,该题勉强过去,虽然打得很爽,第一次觉得自己写的如此优美,可能还有种种缺陷,但是对我而言可谓是优美了
    const int number=10000;
    int numArray[number];
    int primeArray[200];
    int count=0;
    int n=0;
    int m=0;
    int i=0;//for循环
    int sum=0;//总和
    //建立素数库
    //全部标记初始化为1
    for (i = 0; i < number; i++)
    {
        numArray[i]=1;
    }
    //将非素数的值变成0
    for (int x = 2; x < number; x++)
    {
        if(numArray[x]){//初始化为1,如果找到1了就将其倍数变为0
            for(int i=2;i*x<number;i++){
                numArray[i*x]=0;
            }
        }
    }
    //将numArray数组里面的1的下标交给primeArray数组
    for (int z = 2; z < number; z++)
    {
        if (numArray[z]==1)
        {
            if (count<=200)
            {
                primeArray[count]=z;
                count++;
            }
            
        }
    }
    //进行交互
    scanf("%d %d",&n,&m);
    for (i = n-1; i <m; i++)
    {   
        sum=sum+primeArray[i];
    }
    //输出
    printf("%d",sum);
    return 0;
}
