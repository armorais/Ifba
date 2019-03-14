#include "cebola.h"
#include <QString>

Cebola::Cebola()
{
}

QString Cebola::ingredients()
{
    return ("Cebola");
}

void Cebola::assar()
{
    _decorated->assar();
    qDebug("Incluindo ingrediente adicional: cebola ");
}

PizzaDecorator *Cebola::clone()
{
    return new Cebola;
}
