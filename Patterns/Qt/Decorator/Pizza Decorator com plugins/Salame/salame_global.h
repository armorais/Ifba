#ifndef SALAME_GLOBAL_H
#define SALAME_GLOBAL_H

#include <QtCore/qglobal.h>

#if defined(SALAME_LIBRARY)
#  define SALAMESHARED_EXPORT Q_DECL_EXPORT
#else
#  define SALAMESHARED_EXPORT Q_DECL_IMPORT
#endif

#endif // SALAME_GLOBAL_H
