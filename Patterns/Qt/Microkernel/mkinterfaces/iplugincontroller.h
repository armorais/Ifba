#ifndef IPLUGINCONTROLLER_H
#define IPLUGINCONTROLLER_H


class IPluginController
{
public:
    virtual bool initialize() = 0;
    virtual ~IPluginController();
};

#endif // IPLUGINCONTROLLER_H
