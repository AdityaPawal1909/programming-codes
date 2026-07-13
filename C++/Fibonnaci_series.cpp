#include<iostream>
using namespace std;
int main()
{
	int f1=0,f2=1,f3,i,n;
	cout<<"Enter the no of terms: ";
	cin>>n;
	cout<<"Fibonacci Series: ";
	cout<<f1;
	cout<<f2;
	for(i=1;i<=n;i++)
	{
		f3=f1+f2;
		f1=f2;
		f2=f3;
		cout<<f3;
	}
	return 0;
	
}
