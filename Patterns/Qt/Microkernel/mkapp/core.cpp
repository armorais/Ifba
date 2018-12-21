#include "core.h"
#include "uicontroller.h"
#include "plugincontroller.h"


Core::Core():
    _pluginController(new PluginController),
    _uiController(new UiController)
{
    _pluginController->initialize();
    _uiController->initialize();
}

Core::~Core()
{
    delete _pluginController;
    delete _uiController;
}
