#include "Split_And_Join.hpp"

int main() {
    string array[2] = {"Het", "Daftary"};
    cout << join_Strings(array, " ", 2) << endl;
    cout << join_Strings(array, "\n", 2) << endl;

    string test_string = "Het Daftarty";
    string* ans_for_test_string = split_String(test_string, " ", 2);
    cout << ans_for_test_string[0] << endl;
    cout << ans_for_test_string[1] << endl; 
    return 0;
}