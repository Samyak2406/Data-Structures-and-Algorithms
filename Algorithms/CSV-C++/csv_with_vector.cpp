#include "CSV_with_vectors.hpp"

int main() {
    csv_writer_vector(csv_reader_vector("csv_files/Sample100.csv", ","), ", ", "Results/with_vectors/1.csv");
    csv_writer_vector(csv_reader_vector("csv_files/Sample500.csv", ","), ", ", "Results/with_vectors/2.csv");
    
    // [['int', 5, 10], ['float', 4, 6], ['alphabets_lower_Case', 5], ['alphabets_upper_Case', 7], ['random_string', 4]].
    vector<Field> fields = {Field("int", 5, 10), Field("float", 4.0, 6.0), Field("alphabets_lower_Case", 5), Field("alphabets_upper_Case", 7), Field("random_string", 4)};

    generate_random_csv_vector("Results/with_vectors/3.csv", ",", 20000, fields);
    return 0;
}