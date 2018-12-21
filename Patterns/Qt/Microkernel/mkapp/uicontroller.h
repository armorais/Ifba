#ifndef UICONTROLLER_H
#define UICONTROLLER_H


#include "../mkinterfaces/iuicontroller.h"

class UiController : public IUiController
{
public:
    UiController();
    virtual bool initialize();
    virtual ~UiController();
};

#endif // UICONTROLLER_H
