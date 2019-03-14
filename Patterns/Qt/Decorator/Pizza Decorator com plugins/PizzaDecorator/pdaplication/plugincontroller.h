#ifndef PLUGINCONTROLLER_H
#define PLUGINCONTROLLER_H
#include "iplugincontroller.h"
#include <QMap>
#include <pizzadecorator.h>

class PluginController : public IPluginController
{
public:
    PluginController();
    ~PluginController();
    virtual bool initialize();
    virtual PizzaDecorator *getIngredient(QString name);
private:
    QMap<QString, PizzaDecorator*>* ingredients;

};

#endif // PLUGINCONTROLLER_H
