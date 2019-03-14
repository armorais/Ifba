#ifndef PIZZADECORATOR_H
#define PIZZADECORATOR_H

#include "component.h"
#include <QtPlugin>
class QString;


class PizzaDecorator : public Component
{
public:
    PizzaDecorator();
    ~PizzaDecorator();
    void setDecorated(Component* pizzaDecorator);
    virtual void assar();
    virtual PizzaDecorator* clone() = 0;
protected:
    Component *_decorated;
};

#define PizzaDecorator_iid "br.edu.ifba.pizza.PizzaDecorator/1.0"
Q_DECLARE_INTERFACE(PizzaDecorator, PizzaDecorator_iid)

#endif // PIZZADECORATOR_H
