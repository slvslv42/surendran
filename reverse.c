#include<stdio.h>
void main()
{
    int num,ref;
    scanf("%d",&num);
    while(num>0)
    {
    ref=num%10;
    printf("%d",ref);
    num=num/10;
    }
}
