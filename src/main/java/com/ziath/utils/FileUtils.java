package com.ziath.utils;

import com.opencsv.bean.CsvToBeanBuilder;
import com.ziath.constants.Separators;
import com.ziath.exception.BiologicalServiceException;
import com.ziath.exception.FileReadException;
import com.ziath.main.ProcessSample;
import com.ziath.model.BaseModel;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;


public class FileUtils {

    public static List<BaseModel> readFile(String fileName, Separators separators, Class<? extends BaseModel> clazz) {

        try {

            ClassLoader classloader = ProcessSample.class.getClassLoader();
            File file = new File(Objects.requireNonNull(classloader.getResource(fileName)).getFile());

            FileReader reader = new FileReader(file);

            List result = new CsvToBeanBuilder(reader)
                    .withSkipLines(1)
                    .withSeparator(separators.getSeparator())
                    .withType(clazz)
                    .build()
                    .parse();

            reader.close();
            return result;
        } catch (IOException e) {
            System.err.println("Error Occurred while reading the file " + e.getLocalizedMessage());
            throw new FileReadException("Error Occurred while reading the file " + e.getLocalizedMessage(), e);
        } catch (Exception e) {
            System.err.println("Error Occurred " + e.getLocalizedMessage());
            throw new BiologicalServiceException("Error Occurred while reading the file " + e.getCause().getMessage(), e);
        }
    }
}
