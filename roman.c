#include<stdio.h>
#include<string.h>
void main()
{
    char r[5];
    int i=0,count=0,a[6],j;
    scanf("%s",r);
	do
	{
        switch(r[i])
        {
            case 'I': a[i]=1;
                        break;
            case 'V': a[i]=05;
                        break;
            case 'X': a[i]=10;
                        break;
            case 'L': a[i]=50;
                        break;
            default: puts("wrong input");
                        exit(0);
        }
		i++;
	}while(i!=strlen(r));
   count=a[i-1];
   for(j=i-1;j>0;j--)
   {
       if(a[j]>a[j-1])
        count=count-a[j-1];
       else
        count=count+a[j+1];
   }
   printf("\n%d",count);
}
