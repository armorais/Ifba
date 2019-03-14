#include "presunto.h"
#include <QString>


Presunto::Presunto()
{
}

Presunto::~Presunto()
{

}

QString Presunto::ingredients()
{
    return "Presunto";
}

PizzaDecorator *Presunto::clone()
{
    return new Presunto;
}

void Presunto::assar()
{
    _decorated->assar();
    qDebug("Incluindo ingrediente adicional: presunto ");
}
