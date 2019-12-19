#ifndef __LIBCALC_H_INCLUDED
#define __LIBCALC_H_INCLUDED

#include <string>

int adicao(int a, int b);
int multiplicacao(int a, int b);
int divisao(int a, int b);
int subtracao(int a, int b);
int calcular(std::string a, std::string sinal, std::string b);

#endif