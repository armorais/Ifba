#include "pizzacontroller.h"
#include "pizzadecorator.h"
#include "icore.h"
#include "QtDebug"
#include "plugincontroller.h"
#include "pizzaqueijo.h"

PizzaController::PizzaController() :
    ingredients(new QList<PizzaDecorator*>)
{

}


PizzaController::~PizzaController()
{

}

void PizzaController::bakePizza()
{
    PizzaQueijo* base = new PizzaQueijo;
    ingredients->push_front(dynamic_cast<PizzaDecorator*>(base));

    if(ingredients->count()>1) {
        ingredients->at(1)->setDecorated(base);
        for (int index = 2 ; index < ingredients->count() ; index++ )
            ingredients->at(index)->setDecorated(ingredients->at(index-1));
    }

    ingredients->last()->assar();
}

void PizzaController::setIngredients(QStringList* ingredientsList)
{

    IPluginController* pluginController = ICore::Instance()->PluginController();

    for (QStringList::iterator it = ingredientsList->begin(); it != ingredientsList->end(); ++it) {
        ingredients->append(pluginController->getIngredient(*it));
    }

    qDebug() << "FORAM ADICIONADOS " << ingredients->count() << " ingredientes";

    bakePizza();


}

