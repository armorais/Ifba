#ifndef PIZZAQUEIJO_H
#define PIZZAQUEIJO_H

#include "component.h"


class PizzaQueijo : public Component
{
public:
    PizzaQueijo();
    ~PizzaQueijo();
    virtual void assar();
    QString ingredients();
};

#endif // PIZZAQUEIJO_H
