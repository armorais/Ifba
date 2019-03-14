#include "pizzaqueijo.h"
#include <QDebug>

PizzaQueijo::PizzaQueijo()
{

}

PizzaQueijo::~PizzaQueijo()
{

}

void PizzaQueijo::assar()
{
    qDebug("Assando ingredientes base + queijo");
}

QString PizzaQueijo::ingredients()
{
    return "Massa e queijo";
}
