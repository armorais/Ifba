#ifndef IPLUGINCONTROLLER_H
#define IPLUGINCONTROLLER_H
class PizzaDecorator;
class QString;

class IPluginController
{
public:
    virtual ~IPluginController();
    virtual PizzaDecorator* getIngredient(QString name) = 0;
    virtual bool initialize() = 0;
};

#endif // IPLUGINCONTROLLER_H
