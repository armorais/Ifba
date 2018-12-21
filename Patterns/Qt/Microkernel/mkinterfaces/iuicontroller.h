#ifndef IUICONTROLLER_H
#define IUICONTROLLER_H


class IUiController
{
public:
    virtual bool initialize() = 0;
    virtual ~IUiController();
};

#endif // IUICONTROLLER_H
