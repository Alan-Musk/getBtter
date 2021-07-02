#include <stdio.h>

struct date{
    int month;
    int day;
    int year;
};

int main(int argc,char const *argv[]){
    struct date today={07,03,2021};
    struct date thismonth={.month=7,.year=2021};
    printf("Today's date is %i-%i-%i\n",today.year,today.month,today.day);
    printf("This month is %i-%i-%i.\n",thismonth.year,thismonth.month,thismonth.day);
    return 0;
}
