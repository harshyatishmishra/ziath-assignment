package com.ziath.service;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;

public interface BiologicalService {
    void loadBiologicalSampleData() throws IOException, CsvValidationException;

    void task_print_all_subject_data_with_details();

    void task_print_sample_data_group_by_type_sort_by_date();

    void task_print_all_samples_sorted_by_volume();

    void task_print_sample_of_saliva_observed_by_operator_4();

    void task_print_operator_info_handle_sample_14();

    void task_list_racks_with_temp_and_capacity();
}
