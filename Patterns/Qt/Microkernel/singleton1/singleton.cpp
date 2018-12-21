#include "singleton.h"

#include <QDebug>

Singleton* Singleton::_instance = nullptr;

Singleton::Singleton()
{

}

Singleton* Singleton::Instance(){

    if (_instance == nullptr){
        _instance = new Singleton;
        qDebug() << "Singleton criado!";
    }
    return _instance;
}
