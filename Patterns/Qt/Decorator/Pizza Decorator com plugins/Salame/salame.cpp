#include "salame.h"
#include <QString>


Salame::Salame()
{
}

QString Salame::ingredients()
{
    return "Salame";
}

PizzaDecorator *Salame::clone()
{
    return new Salame;
}

void Salame::assar()
{
    _decorated->assar();
    qDebug("Incluindo ingrediente adicional: salame ");
}
