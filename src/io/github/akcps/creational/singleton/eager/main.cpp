# include <iostream>

using namespace std;

class Singleton {

    // non-inheritable singleton
    private:
        Singleton() {}
        ~Singleton() {}
        
        static Singleton _instance;

    public:

        static Singleton& getInstance() {
            return _instance;
        }

};

Singleton Singleton::_instance;

int main() {
    cout << &Singleton::getInstance() << endl;
    cout << &Singleton::getInstance() << endl;
    return 0;
}