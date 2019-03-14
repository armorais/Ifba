#ifndef PRESUNTO_H
#define PRESUNTO_H

#include <QObject>
#include "presunto_global.h"
#include "../PizzaDecorator/pdinterfaces/pizzadecorator.h"

class PRESUNTOSHARED_EXPORT Presunto : public QObject,
                                       public PizzaDecorator
{
    Q_OBJECT
    Q_PLUGIN_METADATA(IID "br.edu.ifba.pizza.PizzaDecorator" FILE "presunto.json")
    Q_INTERFACES(PizzaDecorator)
public:
    Presunto();
    ~Presunto();
    virtual void assar();
    virtual QString ingredients();
    virtual PizzaDecorator *clone();
};

#endif // PRESUNTO_H
