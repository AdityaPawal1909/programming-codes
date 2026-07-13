#include <iostream>
using namespace std;
class student {
private:
    string name;
    int id;
public:
    student()
    {
    cout<<"copy constructor"<<endl;
    }
    void getdata() {
        cout<<"Enter name: ";
        cin>>name;
        cout<<"Enter ID: ";
        cin>>id;
    }
    void display() {
        cout << "Student Name : "<<name<<endl;
        cout << "Student ID   : "<<id<<endl;
    }
    student(student &ref) {
        name = ref.name;
        id = ref.id;
    }
};
int main() {
    student obj;
    obj.getdata();
    student obj2 = obj;
    obj.display();
    obj2.display();
}
