#include "icore.h"

ICore* ICore::_instance = 0;

ICore::ICore()
{

}

ICore::~ICore()
{

}

ICore *ICore::Instance()
{
    return _instance;
}
