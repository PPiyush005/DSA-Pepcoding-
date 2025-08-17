#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node * next;
};

int main(){
    struct node* start=NULL,*newnode,*temp;
    int n=0;
    while (n!=-1) {
        newnode = (struct node*)malloc(sizeof(struct node));
        if (newnode==NULL)
        {
            printf("Memory allocation failed.");
            return 1;
        }
        printf("Enter data:");
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
        printf("Enter '-1' to EXIT & '0' to CONTINUE.");
        scanf("%d",&n);
    }
    newnode = (struct node*)malloc(sizeof(struct node));
    struct node* tempo=start;
    int value=0;
    printf("Enter data to insert:");
    scanf("%d",&newnode->data);
    printf("Enter value after which we have to insert data:");
    scanf("%d",&value);
    while (tempo!=NULL)
    {
        if (tempo->data==value)
        {
            newnode->next= tempo->next;
            tempo->next=newnode;
            break;
        }
        tempo=tempo->next;
    }
    tempo=start;
    printf("\nLinked List:");
    while (tempo!=NULL)
    {
        printf("%d ",tempo->data);
        tempo=tempo->next;
    }
}