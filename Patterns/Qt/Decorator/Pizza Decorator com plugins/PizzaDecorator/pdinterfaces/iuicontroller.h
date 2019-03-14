#ifndef IUICONTROLLER_H
#define IUICONTROLLER_H
class MainWindow;

class IUiController
{
public:
    virtual ~IUiController();
    virtual bool initialize() = 0;
    virtual MainWindow* window() =0;
};

#endif // IUICONTROLLER_H
