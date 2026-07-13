#include<iostream>
using namespace std;
class demo1{
	private:
		int x;
		public:
			demo1(int a)
			{
				x=a;
				cout<<"Demo1 ";
			}
			void let()
			{
				cout<<"x= "<<x;
			}
};
class demo2{
	private:
		int y;
		public:
			demo2(int b)
			{
				y=b;
				cout<<"Demo2 ";
			}
			void set()
			{
				cout<<"y= "<<y;
			}
};
class demo3:public demo1,public demo2{
	private:
		int m,n;
		public:
			demo3(int a,int b,int c,int d):demo1(a),demo2(b)
			{
				m=c;
				n=d;
				cout<<"Demo3 ";
			}
			void met()
			{
				cout<<"m= "<<m;
				cout<<"n= "<<n;
			}
};
int main()
{
	demo3 obj(5,6,7,8);
	obj.let();
	obj.set();
	obj.met();
}
