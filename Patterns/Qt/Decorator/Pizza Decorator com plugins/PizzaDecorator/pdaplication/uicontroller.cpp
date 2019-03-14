#include "uicontroller.h"
#include "mainwindow.h"

UiController::UiController():
    _window(new class MainWindow)
{

}

UiController::~UiController()
{

}

MainWindow *UiController::window()
{
    return _window;
}

bool UiController::initialize()
{
    _window->show();
    return true;
}
