package com.ziath.main;

import com.ziath.service.BiologicalService;
import com.ziath.service.impl.BiologicalServiceImpl;

public class ProcessSample {

    /**
     * Loading the data from the file and executing the task given one by one
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        BiologicalService biologicalService = new BiologicalServiceImpl();

        biologicalService.loadBiologicalSampleData();


        System.out.println("Task 1: List all the Subjects. Including ID, name, and last name.");
        biologicalService.task_print_all_subject_data_with_details();

        System.out.println();

        System.out.println("Task 2: List all the Samples first blood, then tissue and then saliva. On each group order by date." +
                "Including sample type, ID, date, and volume.");
        biologicalService.task_print_sample_data_group_by_type_sort_by_date();

        System.out.println();

        System.out.println("Task 3: List all the samples sorted by volume. Including sample type, ID, date, and volume.");
        biologicalService.task_print_all_samples_sorted_by_volume();

        System.out.println();

        System.out.println("Task 4: List all samples of saliva type that are observed by the operator with ID 4. Including sample type, ID, date, and volume.");
        biologicalService.task_print_sample_of_saliva_observed_by_operator_4();

        System.out.println();

        System.out.println("Task 5: Find the operator who is responsible for processing sample 14. Show its ID, name, and surname.");
        biologicalService.task_print_operator_info_handle_sample_14();

        System.out.println();

        System.out.println("Task 6: List all the racks with their required storage temperature which is the minimum of all the storage" +
                " temperatures for the samples within the rack. Include the ID of the rack, its total capacity, and the required storage temperature.");

        biologicalService.task_list_racks_with_temp_and_capacity();
    }
}
