#include<stdio.h>
#include<string.h>
void main()
{
    char str1[5],str2[5];
    int count1=0,count2=0,i,j;
    scanf("%s%s",str1,str2);
    if(strlen(str1)==strlen(str2))
    {
            for(i=0;i<strlen(str1);i++)
            {
                for(j=0;j<strlen(str1);j++)
                    if(str1[i]==str1[j])
                {
                    count1++;
                        if(str2[i]==str2[j])
                         count2++;
                }
            }
            if(count1==count2)
                printf("TRUE");
            else
                printf("FALSE");
    }
    else
        printf("FALSE");
}
