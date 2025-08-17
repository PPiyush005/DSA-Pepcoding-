#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node * next;
};

int main(){
    struct node * start = NULL,* newnode,*temp;
    int n=0;
    while (n!=-1)
    {
        newnode = (struct node *)malloc (sizeof(struct node));
        if (newnode == NULL)
        {
            printf("Memory allocation failed");
            return 1;
        }
        printf("enter data:");
        scanf("%d",&newnode->data);
        newnode->next=NULL;

        if (start==NULL)
        {
           start = newnode;
           temp = newnode;
        }
        else{
            temp->next = newnode;
            temp = newnode;
        }
        printf("Enter '-1' ");
        scanf("%d",&n);
    }
        newnode = (struct node*) malloc (sizeof(struct node));
        printf("Enter data to INSERT:");
        scanf("%d",&newnode->data);
        if (newnode==NULL)
        {
            printf("Memory allocation failed");
            return 1;
        }
        
        newnode->next = start;
        start = newnode;


    printf("\nLinked List:");
    temp = start;
    while (temp!=NULL)
    {
        printf("%d  ",temp->data);
        temp=temp->next;
    }
    
    
}
