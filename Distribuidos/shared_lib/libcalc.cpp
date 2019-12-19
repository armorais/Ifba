#include <iostream>
#include "libcalc.h"

using namespace std;

int adicao(int a, int b) {
    return a + b;
}

int multiplicacao(int a, int b) {
    return a * b;
}

int divisao(int a, int b) {
    return a / b;
}

int subtracao(int a, int b) {
    return a - b;
}

int calcular(std::string a, std::string sinal, std::string b) {
    int numa = stoi(a);
    int numb = stoi(b);
    char charSinal = sinal.at(0);

    switch(charSinal){
        case '+':
            return adicao(numa, numb);
        case '-':
            return subtracao(numa, numb);
        case '*':
            return multiplicacao(numa, numb);
        case '/':
            return divisao(numa, numb);
        default:
            cout << "O sinal inserido nao eh suportado";
            break;
    }
    return 0;
}