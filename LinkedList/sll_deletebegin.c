#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node * next;
};

int main(){
    struct node * start=NULL , *newnode, *temp;
    int n=0;
    while (n!=-1)
    {
    newnode = (struct node*)malloc(sizeof(struct node));
        if (newnode==NULL)
        {
            printf("Memory alloction failed");
        }
        printf("Enter DATA:");
        scanf("%d",&newnode->data);
        newnode->next=NULL;
        if (start == NULL)
        {
            start=newnode;
            temp=newnode;
        }
        else{
            temp->next=newnode;
            temp=newnode;
        }
        printf("Enter '-1' to EXIT & '0' to CONTINUE.");
        scanf("%d",&n);
    }
    if (start!=NULL)
    {
    struct node * tempo = start;
    start=start->next;
    free(tempo);
    }
    
    temp=start;
    printf("\nLinked List:");
    while (temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}