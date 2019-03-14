#include "pizzadecorator.h"

PizzaDecorator::PizzaDecorator()
{

}

void PizzaDecorator::setDecorated(Component *pizzaDecorator)
{
    _decorated=pizzaDecorator;
}

void PizzaDecorator::assar()
{
    _decorated->assar();
}

PizzaDecorator::~PizzaDecorator()
{
    delete _decorated;
}
