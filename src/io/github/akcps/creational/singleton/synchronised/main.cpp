/*
Run online using https://coliru.stacked-crooked.com/
*/

# include <iostream>
# include <mutex>
# include <thread>

using namespace std;

class Singleton {

    // non-inheritable singleton
    private:
        Singleton() {}
        ~Singleton() {}

        static std::mutex _mu;
        static Singleton *_instance;
        
        Singleton(Singleton const&) = delete;        // disable copy
        void operator=(Singleton const&) = delete;   // disable copy

    public:

        static Singleton* getInstance() {
            std::lock_guard lock(_mu);
            if (_instance == NULL) {
                _instance = new Singleton;
            }
            return _instance;
        }

};

Singleton* Singleton::_instance = NULL;
std::mutex Singleton::_mu;

int main() {

    auto createSingleton = []() {
        cout << Singleton::getInstance() << endl;
    };

    std::thread t1(createSingleton);
    std::thread t2(createSingleton);

    t1.join();
    t2.join();
    
    cout << "done";
    return 0;
}