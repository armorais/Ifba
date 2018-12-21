#ifndef IPLUGIN_H
#define IPLUGIN_H


class IPlugin
{
public:
    virtual bool initialize() = 0;
    virtual ~IPlugin();
};

#endif // IPLUGIN_H
