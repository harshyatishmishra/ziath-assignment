package com.ziath.service.impl;

import com.ziath.constants.Constants;
import com.ziath.constants.SampleTemp;
import com.ziath.constants.SampleType;
import com.ziath.constants.Separators;
import com.ziath.model.Operators;
import com.ziath.model.Personal;
import com.ziath.model.Racks;
import com.ziath.model.Samples;
import com.ziath.response.RackResponse;
import com.ziath.service.BiologicalService;
import com.ziath.utils.FileUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.ziath.constants.Constants.FOURTEEN_NUMBER;
import static com.ziath.constants.Constants.FOUR_NUMBER;

/**
 * Service is responsible for the execution logic
 * author Harsh Mishra
 */
public class BiologicalServiceImpl implements BiologicalService {

    private List<Personal> personalDataList;
    private List<Samples> samplesDataList;
    private List<Racks> racksDataList;
    private List<Operators> operatorsDataList;

    /**
     * Loading the data from files
     */
    @Override
    public void loadBiologicalSampleData() {

        personalDataList = Personal.getPersonal(FileUtils.readFile(Constants.FILES_PERSONAL_CSV, Separators.COMMA_SEPARATOR, Personal.class));
        samplesDataList = Samples.getSamples(FileUtils.readFile(Constants.FILES_SAMPLES_CSV, Separators.COMMA_SEPARATOR, Samples.class));
        racksDataList = Racks.getRacks(FileUtils.readFile(Constants.FILES_RACKS_CSV, Separators.COMMA_SEPARATOR, Racks.class));
        operatorsDataList = Operators.getOperators(FileUtils.readFile(Constants.FILES_OPERATORS_CSV, Separators.COMMA_SEPARATOR, Operators.class));

    }

    /**
     * To print all the subjects with detail.
     * We can use Personal data and check weather isOperator=FALSE.
     * i.e. Subjects are those who are not operators.
     *
     * I have added the sorting on personal_id.
     */
    @Override
    public void task_print_all_subject_data_with_details() {

        personalDataList.stream().filter(personal -> !personal.isOperator()).sorted(Comparator.comparing(Personal::getId)).collect(Collectors.toList()).forEach(System.out::println);

    }

    /**
     * NOTE: Sorting order is not mentioned in question. So, keeping natural order.
     * Samples data sorted by date and then group by sample type
     * then we have the grouped sample type with ordered date
     * <p>
     * I have added the separate print statement but we can
     * use the @{@link java.util.LinkedHashMap} to add them
     * to preserve the order of insertion.
     *
     * Sorting on key is not possible because of alphabetic
     * nature. Blood,Saliva,Tissue(Ascending) or Tissue,Saliva,Blood(Descending)
     */
    @Override
    public void task_print_sample_data_group_by_type_sort_by_date() {

        Map<SampleType, List<Samples>> sampleTypeListMap = samplesDataList.stream().sorted(Comparator.comparing(Samples::getDate))
                .collect(Collectors.groupingBy(Samples::getSampleType));


        System.out.println("Blood Sample");
        sampleTypeListMap.getOrDefault(SampleType.BLOOD, new ArrayList<>()).forEach(System.out::println);

        System.out.println("Tissue Sample");
        sampleTypeListMap.getOrDefault(SampleType.TISSUE, new ArrayList<>()).forEach(System.out::println);

        System.out.println("Saliva Sample");
        sampleTypeListMap.getOrDefault(SampleType.SALIVA, new ArrayList<>()).forEach(System.out::println);

    }


    /**
     * NOTE: Sorting order is not mentioned in question. So, keeping natural order.
     * List all the samples sorted by volume. Including sample type, ID, date, and volume.
     */
    @Override
    public void task_print_all_samples_sorted_by_volume() {

        samplesDataList.stream().sorted(Comparator.comparing(Samples::getVolume)).forEach(System.out::println);

    }

    /**
     * List all samples of saliva type that are observed by the operator with ID 4. Including sample type, ID, date, and volume.
     * <p>
     * First to extract the subject id who is operated by operator_id = 4, then check the sample type
     */
    @Override
    public void task_print_sample_of_saliva_observed_by_operator_4() {

        List<Integer> sampleListOperatedBy4 = operatorsDataList.stream().filter(operator -> operator.getOperatorId() == FOUR_NUMBER).map(Operators::getSubjectId).collect(Collectors.toList());

        samplesDataList.stream().filter(samples -> SampleType.SALIVA.equals(samples.getSampleType()) && sampleListOperatedBy4.contains(samples.getSubjectId())).forEach(System.out::println);

    }

    /**
     * Find the operator who is responsible for processing sample 14. Show its ID, name, and surname.
     * <p>
     * To get the solution of this problem we need to join the data from sample, operators, personal.
     * <p>
     * 1. Fetch the Subject_id from the samples list { samplesDataList} whose sample_id is 14
     * 2. Now with Subject_id, find the operator_id from Operators list({operatorsDataList })
     * 3. With this operator_id, we can get the personal details ID, name, and surname from personal data list{ personalDataList}.
     */
    @Override
    public void task_print_operator_info_handle_sample_14() {

        samplesDataList.stream().filter(samples -> samples.getSampleId() == FOURTEEN_NUMBER).map(Samples::getSubjectId).findFirst().flatMap(subjectId ->
                operatorsDataList.stream().filter(operators -> operators.getSubjectId() == subjectId).map(Operators::getOperatorId).findFirst())
                .ifPresent(operationId -> personalDataList.stream().filter(personal -> personal.getId() == operationId)
                        .forEach(System.out::println));


    }

    /**
     * Racks and samples data can be useful here, For capacity we need to find the total number of samples in a rackId.
     * Samples within the rackId, check for the temperature, Sample require 10 Degree celsius but Blood requires 5 Degree celsius or less.
     * So if there is at-least one blood sample in rack then required minimum temperature is 5 Degree celsius
     */

    @Override
    public void task_list_racks_with_temp_and_capacity() {

        List<RackResponse> listOfRackWithTempAndCapacity = racksDataList.stream().map(racks -> {
            int count = 0;
            float temp = Float.MAX_VALUE;
            for (Samples sam : samplesDataList) {
                if (racks.getRacksId() == sam.getRackId()) {
                    count++;
                    int sampleTemp = SampleTemp.valueOf(sam.getSampleType().name()).getTemp();
                    if (sampleTemp < temp) {
                        temp = sampleTemp;
                    }
                }
            }
            return new RackResponse(racks.getRacksId(), temp, count);
        }).collect(Collectors.toList());

        listOfRackWithTempAndCapacity.forEach(System.out::println);
    }

}
