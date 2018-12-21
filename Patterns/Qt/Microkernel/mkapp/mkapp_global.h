#ifndef MKAPP_GLOBAL_H
#define MKAPP_GLOBAL_H

#include <QtCore/qglobal.h>

#if defined(MKAPP_LIBRARY)
#  define MKAPPSHARED_EXPORT Q_DECL_EXPORT
#else
#  define MKAPPSHARED_EXPORT Q_DECL_IMPORT
#endif

#endif // MKAPP_GLOBAL_H
