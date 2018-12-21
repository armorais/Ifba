#ifndef PLUGINCONTROLLER_H
#define PLUGINCONTROLLER_H

#include "../mkinterfaces/iplugincontroller.h"

class PluginController : public IPluginController
{
public:
    PluginController();
    virtual bool initialize();
    virtual ~PluginController();
};

#endif // PLUGINCONTROL
