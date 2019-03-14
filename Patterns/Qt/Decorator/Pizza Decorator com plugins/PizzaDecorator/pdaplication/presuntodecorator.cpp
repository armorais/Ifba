#include "presuntodecorator.h"
#include <QDebug>

PresuntoDecorator::PresuntoDecorator()
{

}

PresuntoDecorator::~PresuntoDecorator()
{

}

void PresuntoDecorator::assar()
{
    _decorated->assar();
    qDebug("Incluindo ingrediente adicional: presunto ");
}
