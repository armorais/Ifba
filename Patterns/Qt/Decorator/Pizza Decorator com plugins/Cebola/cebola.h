#ifndef CEBOLA_H
#define CEBOLA_H

#include "cebola_global.h"
#include <QObject>
#include "../PizzaDecorator/pdinterfaces/pizzadecorator.h"

class CEBOLASHARED_EXPORT Cebola : public QObject,
                                   public PizzaDecorator
{
    Q_OBJECT
    Q_PLUGIN_METADATA(IID "br.edu.ifba.pizza.PizzaDecorator" FILE "cebola.json")
    Q_INTERFACES(PizzaDecorator)

public:
    Cebola();
    virtual QString ingredients();
    virtual void assar();
    virtual PizzaDecorator *clone();
};

#endif // CEBOLA_H
