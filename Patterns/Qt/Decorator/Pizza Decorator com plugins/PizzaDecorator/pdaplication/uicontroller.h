#ifndef UICONTROLLER_H
#define UICONTROLLER_H

#include "iuicontroller.h"
#include <mainwindow.h>

class UiController : public IUiController
{
public:
    UiController();
    ~UiController();
    MainWindow* window();
    virtual bool initialize();

private:
    MainWindow* _window;
};

#endif // UICONTROLLER_H
