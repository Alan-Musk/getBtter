#include <stdio.h>

struct date{
    int month;
    int day;
    int year;
};

int main(int argc,char const *argv[]){
    struct date today;
    today=(struct date){07,03,2021};

    struct date day;
    day=today;
    day.year=2015;

    printf("Today is date is %i-%i-%i.\n",today.year,today.month,today.day);
    printf("Day is date is %i-%i-%i.\n",day.year,day.month,day.day);

    return 0;
}