#-------------------------------------------------
#
# Project created by QtCreator 2019-02-10T01:18:10
#
#-------------------------------------------------

QT       -= gui

TARGET = pdinterfaces
TEMPLATE = lib

DEFINES += PDINTERFACES_LIBRARY

# The following define makes your compiler emit warnings if you use
# any feature of Qt which has been marked as deprecated (the exact warnings
# depend on your compiler). Please consult the documentation of the
# deprecated API in order to know how to port your code away from it.
DEFINES += QT_DEPRECATED_WARNINGS

# You can also make your code fail to compile if you use deprecated APIs.
# In order to do so, uncomment the following line.
# You can also select to disable deprecated APIs only up to a certain version of Qt.
#DEFINES += QT_DISABLE_DEPRECATED_BEFORE=0x060000    # disables all the APIs deprecated before Qt 6.0.0

SOURCES += \
        icore.cpp \
    iplugincontroller.cpp \
    iuicontroller.cpp \
    component.cpp \
    pizzadecorator.cpp \
    ipizzacontroller.cpp

HEADERS += \
        icore.h \
        pdinterfaces_global.h \ 
    iplugincontroller.h \
    iuicontroller.h \
    component.h \
    pizzadecorator.h \
    ipizzacontroller.h

unix {
    target.path = /usr/lib
    INSTALLS += target
}
