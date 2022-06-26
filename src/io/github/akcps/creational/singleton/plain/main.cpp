# include <iostream>

using namespace std;

class Singleton {

    // non-inheritable singleton
    private:
        Singleton() {}
        ~Singleton() {}
        
        static Singleton *_instance;
        
        Singleton(Singleton const&) = delete;        // disable copy
        void operator=(Singleton const&) = delete;   // disable copy

    public:

        static Singleton* getInstance() {
            if (_instance == NULL) {
                _instance = new Singleton;
            }
            return _instance;
        }

};

Singleton* Singleton::_instance = NULL;

int main() {
    cout << Singleton::getInstance() << endl;
    cout << Singleton::getInstance() << endl;
    return 0;
}