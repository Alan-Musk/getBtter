//先看第一部分,example02.c是关于翁老师提出的问题的
#include <stdio.h>
int main(){
    const int size=3;
    int board[size][size];
    int i,j;
    int numOfX;//白棋
    int numOfO;//黑棋
    int result=-1;//-1没人赢 1:白棋赢 0:黑棋赢
    //读入矩阵
    for(i=0;i<size;i++){
        for(j=0;j<size;j++){
            scanf("%d",&board[i][j]);
        }
    }
    //检查行
    for(i=0;i<size&&result==-1;i++){
        numOfO=numOfX=0;
        for(j=0;j<size;j++){
            if(board[i][j]==1){
                numOfX++;
            }else{
                numOfO++;
            }
        }
        if(numOfX==size){
            result=1;
        }else if(numOfO==size){
                result=0;
            }
    }
    //检查列
    if(result==-1){
        for(j=0;j<size&&result==-1;j++){
            numOfO=numOfX=0;
            for(i=0;i<size;i++){
                if(board[i][j]==1){
                    numOfX++;
                }else{
                    numOfO++;
                }
            }
            if(numOfX==size){
                result=1;
            }else if(numOfO==size){
                result=0;
            }
        }
    }
    //检查对角线
    if(result==-1){
        for(j=1;j<size;j++){
            numOfO=numOfX=0;
            for(i=0;i<size;i++){
                if(board[i][i]==1){
                    numOfX++;
                }else{
                    numOfO++;
                }
            }
            if(numOfX==size){
                result=1;
            }else if(numOfO==size){
                result=0;
            }
        }
        for(j=1;j<size;j++){
            numOfO=numOfX=0;
            for(i=0;i<size;i++){
                if(board[i][size-i-1]==1){
                    numOfX++;
                }else{
                    numOfO++;
                }
            }
            if(numOfX==size){
                result=1;
            }else if(numOfO==size){
                result=0;
            }
        }
    }
    if(result==1){
        printf("白子胜");
    }else if(result==0){
        printf("黑子胜");
    }else{
        printf("谁都没有胜利");
    }
}
