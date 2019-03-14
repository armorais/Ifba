#ifndef SALAME_H
#define SALAME_H

#include <QObject>
#include "salame_global.h"
#include "../PizzaDecorator/pdinterfaces/pizzadecorator.h"

class SALAMESHARED_EXPORT Salame : public QObject,
                                   public PizzaDecorator
{
    Q_OBJECT
    Q_PLUGIN_METADATA(IID "br.edu.ifba.pizza.PizzaDecorator" FILE "salame.json")
    Q_INTERFACES(PizzaDecorator)

public:
    Salame();
    virtual void assar();
    virtual QString ingredients();
    virtual PizzaDecorator *clone();
};

#endif // SALAME_H
