#ifndef CORE_H
#define CORE_H

#include "icore.h"
class IPluginController;
class IUiController;

class Core : public ICore
{
public:
    static bool initialize();
    virtual IPluginController *PluginController();
    virtual IUiController *UiController();
private:
    Core();
    ~Core();
    IPluginController *_pluginController;
    IUiController *_uiController;
};

#endif // CORE_H
