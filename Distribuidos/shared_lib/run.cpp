#include <iostream>
#include <vector>
#include <boost/algorithm/string.hpp>
#include "run.h"
#include "libcalc.h"

using namespace std;

int main() {

    string input;
    vector<string> fields;

    cout << "Entre com a operacao no formato <numero_a sinal numero_b>. Exemplo: 4 * 5: " << endl;
    getline(cin, input);

    fields = getFields(input);
    cout << "Resultado eh: " << endl;
    cout << calcular(fields.at(0),fields.at(1),fields.at(2)) << endl;
}

vector<string> getFields(string input) {
    vector<string> fields;

    boost::split(fields,input,boost::is_any_of(" "));

    return fields;
}