#include <stdio.h>

int main(void){
    //往队列中写入数据
    EnQueue(123);//写入123
    EnQueue(456);//写入456
    EnQueue(789);//写入789

    //从队列中读取数据
    m=DeQueue();//读出123
    n=DeQueue();//读出456
    o=DeQueue();//读出789
}