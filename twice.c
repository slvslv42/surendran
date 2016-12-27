#include<stdio.h>
void main()
{
    int arr[10],i,j,c=0,n;
    puts("size of array: ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<8;j++)
        {
            if(arr[i]==arr[j])
                c++;
        }
        if(c!=2)
        {
            printf("%d",arr[i]);
            exit(0);
        }
        c=0;
    }
}
