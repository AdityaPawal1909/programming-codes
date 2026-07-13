#include<iostream>
using namespace std;
class cricketer{
	public:
		string name;
		int age;
		void get()
		{
			cout<<"Enter name: ";
			cin>>name;
			cout<<"Enter age: ";
			cin>>age;
		}
		void show()
		{
			cout<<"Name: "<<name;
			cout<<"Age: "<<age;
		}
};
class batsman:virtual public cricketer{
	public:
		int runs;
		int mp;
		float avg;
		int hundreds;
		int fifties;
		void batsmanget()
		{
			cout<<"Enter runs: ";
			cin>>runs;
			cout<<"Enter matches played: ";
			cin>>mp;
			avg=runs/mp;
			cout<<"Enter hundreds: ";
			cin>>hundreds;	
			cout<<"Enter fifties: ";
			cin>>fifties;
		}
		void batsmanshow()
		{
			cout<<"Runs: "<<runs;
			cout<<"Matches played: "<<mp;
			cout<<"Batting Average: "<<avg;
			cout<<"Hundreds: "<<hundreds;
			cout<<"Fifties: "<<fifties;
		}	
};
class bowler:virtual public cricketer{
	public:
		int wickets;
		int mp;
		float avg;
		int five_wh;
		int hat_trick;
		void bowlerget()
		{
			cout<<"Enter wickets: ";
			cin>>wickets;
			cout<<"Enter matches played: ";
			cin>>mp;
			avg=wickets/mp;
			cout<<"Enter five wh: ";
			cin>>five_wh;	
			cout<<"Enter hat-trick: ";
			cin>>hat_trick;
		}
		void bowlershow()
		{
			cout<<"wickets: "<<wickets;
			cout<<"Matches played: "<<mp;
			cout<<"Bowling Average: "<<avg;
			cout<<"five wh: "<<five_wh;
			cout<<"hat-trick: "<<hat_trick;
		}	
};
class allrounder:public batsman, public bowler{
	public:
	get();
	show();
	batsmanget();
	batsmanshow();
	bowlerget();
	bowlershow();
};
int main()
{
	allrounder obj;
	obj.get();
	obj.show();
	obj.batsmanget();
	obj.batsmanshow();
	obj.bowlerget();
	obj.bowlershow();
	return 0;
}
