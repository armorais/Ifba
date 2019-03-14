#include "ceboladecorator.h"
#include <QDebug>

CebolaDecorator::CebolaDecorator()
{

}

CebolaDecorator::~CebolaDecorator()
{

}

void CebolaDecorator::assar()
{
    _decorated->assar();
    qDebug("Incluindo ingrediente adicional: cebola ");
}
