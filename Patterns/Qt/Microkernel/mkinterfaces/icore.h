#ifndef ICORE_H
#define ICORE_H

#include "mkinterfaces_global.h"

class IPluginController;
class IUiController;

class MKINTERFACESSHARED_EXPORT ICore
{

public:
    virtual IPluginController *pluginController() = 0;
    virtual IUiController *uiController() = 0;
    virtual ~ICore() = 0;
};

#endif // ICORE_H
