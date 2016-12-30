#include <stdio.h>
void fun2(int s1,int s2)
{
    int d1,d2;
   do
    {
        d1=0;
        while(s1>0)
        {
            d1+=s1%10;
            s1=s1/10;
        }
        s1=d1;
    }while(d1>9);
    do
    {
        d2=0;
        while(s2>0)
        {
            d2+=s2%10;
            s2=s2/10;
        }
        s2=d2;
    }while(d2>9);
    if(d1<d2)
        printf("%d",d1*d1);
    else
        printf("%d",d2*d2);
}
void fun1(int op[],int s)
{
    int i,sm=op[0],l=op[0],sum1=0,sum2=1;
    for(i=0;i<s;i++)
    {
        if(sm>op[i])
            sm=op[i];
        if(l<op[i])
            l=op[i];
    }
    //printf("%d %d\n",sm,l);
    for(i=0;i<s;i++)
    {
        sum1+=(l*op[i]);
        sum2*=(sm+op[i]);
    }
      // printf("%d %d\n",sum1,sum2);
    fun2(sum1,sum2);
}
int main()
{
	char g[20];
	int i,x=0,re[20];
	gets(g);
	for(i=0;i<strlen(g);i++)
    {
        if(g[i]>47&&g[i]<58)
        {
            re[x]=(g[i]-'0');
            x++;
        }
    }
    fun1(re,x);
    return 0;
}
