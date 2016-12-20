#include<stdio.h>
void main()
{
    int num,fact=1;
    scanf("%d",&num);
    while(num>0)
    {
    fact*=num;
    num--;
    }
    printf("\n%d",fact);
}
