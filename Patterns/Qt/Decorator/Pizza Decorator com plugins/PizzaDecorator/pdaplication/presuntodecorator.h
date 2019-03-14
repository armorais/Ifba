#ifndef PRESUNTODECORATOR_H
#define PRESUNTODECORATOR_H

#include "pizzadecorator.h"


class PresuntoDecorator : public PizzaDecorator
{
public:
    PresuntoDecorator();
    ~PresuntoDecorator();
    virtual void assar();
};

#endif // PRESUNTODECORATOR_H
