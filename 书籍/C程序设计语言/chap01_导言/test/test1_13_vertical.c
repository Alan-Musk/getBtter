#include <stdio.h>

#define MAXHIST 15 //直方最长是15
#define MAXWORD 11 //单词最长的长度
#define IN 1 //在单词内状态
#define OUT 0 //在单词外的状态

//输出垂直的直方图 
int main(void){
	int c,i,j,nc,state;
	int maxvalue;//wl[]中值最大的下标
	int ovflow;//超出ovflow个字符
	int wl[MAXWORD];// 单词长度计数
	state=OUT;
	nc=0;	//单词中字符的长度 
	ovflow=0; //超出单词最长长度的值
	//给数组赋初值 
	for(i=0;i<MAXWORD;++i) {
		wl[i]=0;
	}
	//将每个单词的长度,放入数组中 
	while((c=getchar())!=EOF){
		if(c==' '||c=='\n'||c=='\t'){
			state=OUT;
			if(nc>0){
				if(nc<MAXWORD){
					++wl[nc];
				}else{
					++ovflow;
				}
			}
			nc=0;
		}else if(state==OUT){ 
			state=IN;
			nc=1;//开始新单词 
		}else{
			++nc;//单词中字符计数 
		} 
	}
	maxvalue=0;
	//选出最大的值 
	for(i=1;i<MAXWORD;++i){
		if(wl[i]>maxvalue){
			maxvalue=wl[i];
		}
	}
	//打印 
	for(i=MAXHIST;i>0;--i){
		for(j=1;j<MAXWORD;++j){
			if(wl[j]*MAXHIST/maxvalue>=i) {
				printf("*");
			}else{
				printf(" ");
			}
		}
		putchar('\n');
	}
	for(i=1;i<MAXWORD;++i){
		printf("%4d ",i);
	} 
	putchar('\n');
	for(i=1;i<MAXWORD;++i){
		printf("%4d ",wl[i]);
	} 
	putchar('\n');
	if (ovflow > 0) {
        printf("There are %d words >=%d\n", ovflow, MAXWORD);
    }
} 
