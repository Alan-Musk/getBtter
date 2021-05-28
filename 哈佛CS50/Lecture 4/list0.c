#include <cs50.h>
#include <stdio.h>


int main(void){
    int capacity;
    do{
        capacity=get_int("请输入数字个数");
    }while(capacity<1);
    int numbers[capacity];
    int size=0;
    //输入
    while(size<capacity){
        int number=get_int("Number:");
        numbers[size]=number;
        size++;
    }
    //输出
    for(int i=0;i<size;i++){
        printf("输出:%d\n",numbers[i]);
    }
}