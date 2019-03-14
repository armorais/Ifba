#ifndef ICORE_H
#define ICORE_H

#include "pdinterfaces_global.h"
class IPluginController;
class IUiController;

class PDINTERFACESSHARED_EXPORT ICore
{

public:
    virtual ~ICore();
    virtual IPluginController *PluginController() = 0;
    virtual IUiController *UiController() = 0;
    static ICore *Instance();
protected:
    ICore();
    static ICore *_instance;
};

#endif // ICORE_H
