#include <cs50.h>
#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int number;
    struct node *next;
}
node;

int main(void){
    node *numbers=NULL;
    
    while(true){
        int number=get_int("Number:");
        
        if(number==INT_MAX){
            break;
        }
        
        node *n=malloc(sizeof(node));
        if(!n){
            return 1;
        }
        n->number=number;
        n->next=NULL;
        if(numbers){
            for(node *ptr=numbers;ptr!=NULL;ptr=ptr->next){
                if(!ptr->next){
                    ptr->next=n;
                    break;
                }
            }
        }
        else{
            numbers=n;
        }
    }
}