#include<iostream>
using namespace std;
class demo{
	private:
		int age;
		string name;
		public:
			void get()
			{
				cout<<"Enter Name: ";
				cin>>name;
				cout<<"Enter Age: ";
				cin>>age;
			}
			void show()
			{
				cout<<"Name is: "<<name;
				cout<<"Age is: "<<age;
			}
};
int main()
{
	demo obj, *ptr;
	ptr=&obj;
	ptr->get();
	ptr->show();
}
