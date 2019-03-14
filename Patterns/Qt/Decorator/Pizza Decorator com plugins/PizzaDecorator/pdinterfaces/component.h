#ifndef COMPONENT_H
#define COMPONENT_H
#include <QtPlugin>
class QString;


class Component
{
public:
    Component();
    virtual ~Component();
    virtual QString ingredients() = 0;
    virtual void assar() = 0;
};

#endif // COMPONENT_H
