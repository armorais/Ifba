#ifndef IPIZZACONTROLLER_H
#define IPIZZACONTROLLER_H
class QStringList;


class IPizzaController
{
public:
    IPizzaController();
    virtual ~IPizzaController();
    virtual void bakePizza() = 0;
    virtual void setIngredients(QStringList* ingredients) = 0;
};

#endif // IPIZZACONTROLLER_H
