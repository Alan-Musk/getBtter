#include <stdio.h>

int main(int argc,char const *argv[]){
    struct data{
        int month;
        int day;
        int year;
    };
    struct data today;
    today.month=07;
    today.day=3;
    today.year=2021;
    printf("Today's data is %i-%i-%i\n",today.year,today.month,today.day);
    return 0;
}