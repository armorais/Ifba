#include "singleton.h"

#include <QCoreApplication>

int main(int argc, char *argv[])
{
    QCoreApplication a(argc, argv);
    Singleton* sing = Singleton::Instance();

    return a.exec();
}
