#include <QApplication>
#include <QDir>
#include <QPluginLoader>
#include <QtDebug>

#include "plugincontroller.h"
#include "component.h"
#include "icore.h"
#include "uicontroller.h"
#include "ui_mainwindow.h"
#include <QMap>


PluginController::PluginController() :
    ingredients(new QMap<QString, PizzaDecorator*>)
{

}

PluginController::~PluginController()
{
    foreach(PizzaDecorator * aux, ingredients->values())
            delete aux;
    delete ingredients;
}

bool PluginController::initialize()
{
    MainWindow* window = ICore::Instance()->UiController()->window();

    QDir pluginsDir = QDir(qApp->applicationDirPath());
    if (!pluginsDir.cd("plugins")) {
        qDebug() << "Pasta de plugins nao existe. Verifique sua instalacao.";
        return false;
    }
    const auto entryList = pluginsDir.entryList(QDir::Files);
    qDebug() << "Existem " << entryList.size() << " plugins instalados";
    foreach (QString fileName, entryList) {
        // Create plugin loader
        QPluginLoader* pluginLoader = new QPluginLoader(pluginsDir.absoluteFilePath(fileName));
        // Load plugin
        if(!pluginLoader->load())
            qDebug() << "Could not load plugin " << fileName;
        else {
            PizzaDecorator *plugin = qobject_cast<PizzaDecorator*>(pluginLoader->instance());
            ingredients->insert(plugin->ingredients(),plugin);
        }
    }

    QStringList *list = new QStringList;
    foreach (QString aux, ingredients->keys())
        list->append(aux);
    window->setIngredients(list);

    return true;
}

PizzaDecorator *PluginController::getIngredient(QString name)
{
    return ingredients->value(name)->clone();
}
