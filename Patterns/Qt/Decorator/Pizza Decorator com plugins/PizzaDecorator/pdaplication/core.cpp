#include "core.h"
#include "plugincontroller.h"
#include "uicontroller.h"
#include "QtDebug"

Core::Core() :
    _pluginController(new class PluginController),
    _uiController(new class UiController)
{

}

IPluginController *Core::PluginController()
{
    return _pluginController;
}

IUiController *Core::UiController()
{
    return _uiController;
}

Core::~Core(){
    delete _pluginController;
    delete _uiController;
}

bool Core::initialize()
{
    if(!_instance){
        _instance = new Core;
        _instance->PluginController()->initialize();
        _instance->UiController()->initialize();
    }
    return true;
}
