#include <stdio.h>

struct point {
    int x;
    int y;
};

void getStruct(struct point);
void output(struct point);

int main(int argc,char const *argv[]){
    struct point y={0,0};
    getStruct(y);
    output(y);
}

void getStruct(struct point p){
    scanf("%d\n",&p.x);
    scanf("%d\n",&p.y);
    printf("%d, %d\n",p.x,p.y);
}

void output(struct point p){
    printf("%d,%d",p.x,p.y);
}