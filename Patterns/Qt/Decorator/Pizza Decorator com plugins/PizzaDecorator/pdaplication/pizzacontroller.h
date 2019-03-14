#ifndef PIZZACONTROLLER_H
#define PIZZACONTROLLER_H
#include <ipizzacontroller.h>
#include <QList>

class PizzaDecorator;

class PizzaController : public IPizzaController
{
public:
    PizzaController();
    ~PizzaController();
    virtual void bakePizza();
    virtual void setIngredients(QStringList* ingredientsList);
private:
    QList<PizzaDecorator*>* ingredients;
};

#endif // PIZZACONTROLLER_H
