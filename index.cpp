#include<iostream>
using namespace std;
 main()
{
    int num,a[10],cpy,s=0,k,r=0,res[10];
    cin>>num;
    cpy=num;
    while(num>0)
    {
        a[r]=num%10;
        num=num/10;
        s++;
        r++;
    }
    cin>>k;
    cout<<s<<"\n";
    for(int i=0;i<k;i++)
    {
        int l=a[0];
        for(int j=0;j<s;j++)
        {
            if(l>a[j])
               l=a[j];
        }
        res[i]=l;
        cout<<l<<"\t";
        for(int j=0;j<s;j++)
        {
            if(a[j]==l)
            {
                a[j]=10;
                break;
            }
        }

    }
    for(int z=0;z<k;z++)
        cout<<res[z];

return 0;
}
