#include<iostream>
using namespace std;
int main()
{
	int n,i=1,f=1;
	cout<<"Enter no: ";
	cin>>n;
	while(i<=n)
	{
		f=f*i;
		i++;
	}
	cout<<"Factorial of "<<n<<"="<<f;
	return 0;
}
