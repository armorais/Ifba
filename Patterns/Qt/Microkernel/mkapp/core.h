#ifndef CORE_H
#define CORE_H

#include "mkapp_global.h"
#include "../mkinterfaces/icore.h"

class MKAPPSHARED_EXPORT Core : public ICore
{

public:
    Core();
    virtual IPluginController *pluginController();
    virtual IUiController *uiController();
    virtual ~Core();
private:
    IPluginController *_pluginController;
    IUiController *_uiController;
};

#endif // CORE_H
