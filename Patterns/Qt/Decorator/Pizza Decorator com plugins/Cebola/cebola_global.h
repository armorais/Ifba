#ifndef CEBOLA_GLOBAL_H
#define CEBOLA_GLOBAL_H

#include <QtCore/qglobal.h>

#if defined(CEBOLA_LIBRARY)
#  define CEBOLASHARED_EXPORT Q_DECL_EXPORT
#else
#  define CEBOLASHARED_EXPORT Q_DECL_IMPORT
#endif

#endif // CEBOLA_GLOBAL_H
