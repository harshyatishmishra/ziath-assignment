## Ziath Assignment
Assignment questions([link](https://github.com/harshyatishmishra/ziath-assignment/tree/master/src/main/resources/files))

by Harsh Mishra

### Tech stack
* Java 11 [Installation Guide](https://www.java.com/en/download/help/download_options.html)
* Gradle 6.7 [installation Guide](https://gradle.org/install/)
* Opencsv 5.3

### How to build project
 
  ```./gradlew build```
  
### To run the application
``` ./gradlew run ```

### Application logs
```
4:57:24 PM: Executing task 'ProcessSample.main()'...


> Task :compileJava

> Task :processResources UP-TO-DATE
> Task :classes
Note: /Users/harmishr1/XXX/ziath-assignment/src/main/java/com/ziath/utils/FileUtils.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

> Task :ProcessSample.main()
Task 1: List all the Subjects. Including ID, name, and last name.
Person_Id = 1 Name = 'Rick' Surname = 'James' isOperator = false
Person_Id = 3 Name = 'Kimberly' Surname = 'Martin' isOperator = false
Person_Id = 6 Name = 'Phoebe' Surname = 'Thomas' isOperator = false
Person_Id = 9 Name = 'Shawn' Surname = 'White' isOperator = false
Person_Id = 12 Name = 'Stuart' Surname = 'Hall' isOperator = false
Person_Id = 13 Name = 'Ted' Surname = 'Jones' isOperator = false
Person_Id = 14 Name = 'Shane' Surname = 'Turner' isOperator = false
Person_Id = 16 Name = 'Alice' Surname = 'Davies' isOperator = false
Person_Id = 17 Name = 'Ricardo' Surname = 'Smith' isOperator = false
Person_Id = 18 Name = 'Juliana' Surname = 'Thomas' isOperator = false
Person_Id = 19 Name = 'Douglas' Surname = 'Collins' isOperator = false
Person_Id = 20 Name = 'Claude' Surname = 'Jackson' isOperator = false
Person_Id = 21 Name = 'Scott' Surname = 'Evans' isOperator = false
Person_Id = 22 Name = 'Clarence' Surname = 'Wilson' isOperator = false
Person_Id = 24 Name = 'Graciela' Surname = 'King' isOperator = false
Person_Id = 25 Name = 'Teresa' Surname = 'Phillips' isOperator = false
Person_Id = 26 Name = 'Jessie' Surname = 'King' isOperator = false
Person_Id = 27 Name = 'Traci' Surname = 'Thomas' isOperator = false
Person_Id = 28 Name = 'Harold' Surname = 'Walker' isOperator = false
Person_Id = 30 Name = 'Rosa' Surname = 'Moore' isOperator = false

Task 2: List all the Samples first blood, then tissue and then saliva. On each group order by date.Including sample type, ID, date, and volume.
Blood Sample
Sample_Id = 11 Sample_Type = BLOOD Volume = 72.0 Date = 2001-03-19
Sample_Id = 34 Sample_Type = BLOOD Volume = 60.0 Date = 2001-07-29
Sample_Id = 52 Sample_Type = BLOOD Volume = 41.0 Date = 2002-03-20
Sample_Id = 24 Sample_Type = BLOOD Volume = 47.0 Date = 2002-06-08
Sample_Id = 26 Sample_Type = BLOOD Volume = 81.0 Date = 2003-05-29
Sample_Id = 31 Sample_Type = BLOOD Volume = 69.0 Date = 2003-12-03
Sample_Id = 8 Sample_Type = BLOOD Volume = 49.0 Date = 2004-07-23
Sample_Id = 45 Sample_Type = BLOOD Volume = 67.0 Date = 2005-01-14
Sample_Id = 7 Sample_Type = BLOOD Volume = 95.0 Date = 2005-10-31
Sample_Id = 30 Sample_Type = BLOOD Volume = 41.0 Date = 2006-05-05
Sample_Id = 27 Sample_Type = BLOOD Volume = 97.0 Date = 2006-08-29
Sample_Id = 53 Sample_Type = BLOOD Volume = 64.0 Date = 2007-04-29
Sample_Id = 40 Sample_Type = BLOOD Volume = 45.0 Date = 2008-04-28
Sample_Id = 39 Sample_Type = BLOOD Volume = 40.0 Date = 2008-06-25
Sample_Id = 15 Sample_Type = BLOOD Volume = 22.0 Date = 2008-06-28
Sample_Id = 44 Sample_Type = BLOOD Volume = 88.0 Date = 2010-11-11
Sample_Id = 1 Sample_Type = BLOOD Volume = 74.0 Date = 2010-11-20
Sample_Id = 5 Sample_Type = BLOOD Volume = 78.0 Date = 2013-02-27
Sample_Id = 59 Sample_Type = BLOOD Volume = 18.0 Date = 2014-10-17
Sample_Id = 2 Sample_Type = BLOOD Volume = 27.0 Date = 2015-01-29
Sample_Id = 50 Sample_Type = BLOOD Volume = 31.0 Date = 2015-02-19
Sample_Id = 54 Sample_Type = BLOOD Volume = 43.0 Date = 2015-06-12
Sample_Id = 33 Sample_Type = BLOOD Volume = 85.0 Date = 2018-04-09
Sample_Id = 25 Sample_Type = BLOOD Volume = 76.0 Date = 2018-08-19
Sample_Id = 56 Sample_Type = BLOOD Volume = 1.0 Date = 2019-01-30
Sample_Id = 6 Sample_Type = BLOOD Volume = 40.0 Date = 2019-08-03
Sample_Id = 29 Sample_Type = BLOOD Volume = 2.0 Date = 2019-12-12
Tissue Sample
Sample_Id = 9 Sample_Type = TISSUE Volume = 60.0 Date = 2000-07-17
Sample_Id = 36 Sample_Type = TISSUE Volume = 62.0 Date = 2000-08-27
Sample_Id = 23 Sample_Type = TISSUE Volume = 27.0 Date = 2003-01-05
Sample_Id = 37 Sample_Type = TISSUE Volume = 58.0 Date = 2003-01-17
Sample_Id = 18 Sample_Type = TISSUE Volume = 52.0 Date = 2003-11-04
Sample_Id = 41 Sample_Type = TISSUE Volume = 63.0 Date = 2003-11-26
Sample_Id = 14 Sample_Type = TISSUE Volume = 10.0 Date = 2004-03-23
Sample_Id = 12 Sample_Type = TISSUE Volume = 15.0 Date = 2006-03-09
Sample_Id = 13 Sample_Type = TISSUE Volume = 18.0 Date = 2006-05-19
Sample_Id = 3 Sample_Type = TISSUE Volume = 30.0 Date = 2008-11-02
Sample_Id = 55 Sample_Type = TISSUE Volume = 56.0 Date = 2008-11-11
Sample_Id = 20 Sample_Type = TISSUE Volume = 5.0 Date = 2009-08-10
Sample_Id = 51 Sample_Type = TISSUE Volume = 87.0 Date = 2014-10-08
Sample_Id = 4 Sample_Type = TISSUE Volume = 18.0 Date = 2016-03-07
Sample_Id = 48 Sample_Type = TISSUE Volume = 97.0 Date = 2018-06-13
Sample_Id = 22 Sample_Type = TISSUE Volume = 82.0 Date = 2019-12-06
Sample_Id = 49 Sample_Type = TISSUE Volume = 37.0 Date = 2020-01-30
Sample_Id = 28 Sample_Type = TISSUE Volume = 16.0 Date = 2020-02-06
Sample_Id = 35 Sample_Type = TISSUE Volume = 80.0 Date = 2020-06-23
Sample_Id = 38 Sample_Type = TISSUE Volume = 71.0 Date = 2020-07-15
Sample_Id = 43 Sample_Type = TISSUE Volume = 49.0 Date = 2021-02-11
Saliva Sample
Sample_Id = 16 Sample_Type = SALIVA Volume = 93.0 Date = 2006-11-16
Sample_Id = 58 Sample_Type = SALIVA Volume = 10.0 Date = 2011-07-27
Sample_Id = 17 Sample_Type = SALIVA Volume = 6.0 Date = 2011-08-21
Sample_Id = 42 Sample_Type = SALIVA Volume = 53.0 Date = 2013-10-13
Sample_Id = 32 Sample_Type = SALIVA Volume = 78.0 Date = 2016-02-29
Sample_Id = 10 Sample_Type = SALIVA Volume = 90.0 Date = 2016-06-05
Sample_Id = 57 Sample_Type = SALIVA Volume = 10.0 Date = 2017-10-28
Sample_Id = 47 Sample_Type = SALIVA Volume = 32.0 Date = 2018-03-30
Sample_Id = 46 Sample_Type = SALIVA Volume = 30.0 Date = 2019-09-04
Sample_Id = 21 Sample_Type = SALIVA Volume = 36.0 Date = 2020-10-14
Sample_Id = 19 Sample_Type = SALIVA Volume = 43.0 Date = 2021-02-18

Task 3: List all the samples sorted by volume. Including sample type, ID, date, and volume.
Sample_Id = 56 Sample_Type = BLOOD Volume = 1.0 Date = 2019-01-30
Sample_Id = 29 Sample_Type = BLOOD Volume = 2.0 Date = 2019-12-12
Sample_Id = 20 Sample_Type = TISSUE Volume = 5.0 Date = 2009-08-10
Sample_Id = 17 Sample_Type = SALIVA Volume = 6.0 Date = 2011-08-21
Sample_Id = 58 Sample_Type = SALIVA Volume = 10.0 Date = 2011-07-27
Sample_Id = 14 Sample_Type = TISSUE Volume = 10.0 Date = 2004-03-23
Sample_Id = 57 Sample_Type = SALIVA Volume = 10.0 Date = 2017-10-28
Sample_Id = 12 Sample_Type = TISSUE Volume = 15.0 Date = 2006-03-09
Sample_Id = 28 Sample_Type = TISSUE Volume = 16.0 Date = 2020-02-06
Sample_Id = 13 Sample_Type = TISSUE Volume = 18.0 Date = 2006-05-19
Sample_Id = 59 Sample_Type = BLOOD Volume = 18.0 Date = 2014-10-17
Sample_Id = 4 Sample_Type = TISSUE Volume = 18.0 Date = 2016-03-07
Sample_Id = 15 Sample_Type = BLOOD Volume = 22.0 Date = 2008-06-28
Sample_Id = 2 Sample_Type = BLOOD Volume = 27.0 Date = 2015-01-29
Sample_Id = 23 Sample_Type = TISSUE Volume = 27.0 Date = 2003-01-05
Sample_Id = 46 Sample_Type = SALIVA Volume = 30.0 Date = 2019-09-04
Sample_Id = 3 Sample_Type = TISSUE Volume = 30.0 Date = 2008-11-02
Sample_Id = 50 Sample_Type = BLOOD Volume = 31.0 Date = 2015-02-19
Sample_Id = 47 Sample_Type = SALIVA Volume = 32.0 Date = 2018-03-30
Sample_Id = 21 Sample_Type = SALIVA Volume = 36.0 Date = 2020-10-14
Sample_Id = 49 Sample_Type = TISSUE Volume = 37.0 Date = 2020-01-30
Sample_Id = 6 Sample_Type = BLOOD Volume = 40.0 Date = 2019-08-03
Sample_Id = 39 Sample_Type = BLOOD Volume = 40.0 Date = 2008-06-25
Sample_Id = 52 Sample_Type = BLOOD Volume = 41.0 Date = 2002-03-20
Sample_Id = 30 Sample_Type = BLOOD Volume = 41.0 Date = 2006-05-05
Sample_Id = 19 Sample_Type = SALIVA Volume = 43.0 Date = 2021-02-18
Sample_Id = 54 Sample_Type = BLOOD Volume = 43.0 Date = 2015-06-12
Sample_Id = 40 Sample_Type = BLOOD Volume = 45.0 Date = 2008-04-28
Sample_Id = 24 Sample_Type = BLOOD Volume = 47.0 Date = 2002-06-08
Sample_Id = 8 Sample_Type = BLOOD Volume = 49.0 Date = 2004-07-23
Sample_Id = 43 Sample_Type = TISSUE Volume = 49.0 Date = 2021-02-11
Sample_Id = 18 Sample_Type = TISSUE Volume = 52.0 Date = 2003-11-04
Sample_Id = 42 Sample_Type = SALIVA Volume = 53.0 Date = 2013-10-13
Sample_Id = 55 Sample_Type = TISSUE Volume = 56.0 Date = 2008-11-11
Sample_Id = 37 Sample_Type = TISSUE Volume = 58.0 Date = 2003-01-17
Sample_Id = 34 Sample_Type = BLOOD Volume = 60.0 Date = 2001-07-29
Sample_Id = 9 Sample_Type = TISSUE Volume = 60.0 Date = 2000-07-17
Sample_Id = 36 Sample_Type = TISSUE Volume = 62.0 Date = 2000-08-27
Sample_Id = 41 Sample_Type = TISSUE Volume = 63.0 Date = 2003-11-26
Sample_Id = 53 Sample_Type = BLOOD Volume = 64.0 Date = 2007-04-29
Sample_Id = 45 Sample_Type = BLOOD Volume = 67.0 Date = 2005-01-14
Sample_Id = 31 Sample_Type = BLOOD Volume = 69.0 Date = 2003-12-03
Sample_Id = 38 Sample_Type = TISSUE Volume = 71.0 Date = 2020-07-15
Sample_Id = 11 Sample_Type = BLOOD Volume = 72.0 Date = 2001-03-19
Sample_Id = 1 Sample_Type = BLOOD Volume = 74.0 Date = 2010-11-20
Sample_Id = 25 Sample_Type = BLOOD Volume = 76.0 Date = 2018-08-19
Sample_Id = 5 Sample_Type = BLOOD Volume = 78.0 Date = 2013-02-27
Sample_Id = 32 Sample_Type = SALIVA Volume = 78.0 Date = 2016-02-29
Sample_Id = 35 Sample_Type = TISSUE Volume = 80.0 Date = 2020-06-23
Sample_Id = 26 Sample_Type = BLOOD Volume = 81.0 Date = 2003-05-29
Sample_Id = 22 Sample_Type = TISSUE Volume = 82.0 Date = 2019-12-06
Sample_Id = 33 Sample_Type = BLOOD Volume = 85.0 Date = 2018-04-09
Sample_Id = 51 Sample_Type = TISSUE Volume = 87.0 Date = 2014-10-08
Sample_Id = 44 Sample_Type = BLOOD Volume = 88.0 Date = 2010-11-11
Sample_Id = 10 Sample_Type = SALIVA Volume = 90.0 Date = 2016-06-05
Sample_Id = 16 Sample_Type = SALIVA Volume = 93.0 Date = 2006-11-16
Sample_Id = 7 Sample_Type = BLOOD Volume = 95.0 Date = 2005-10-31
Sample_Id = 48 Sample_Type = TISSUE Volume = 97.0 Date = 2018-06-13
Sample_Id = 27 Sample_Type = BLOOD Volume = 97.0 Date = 2006-08-29

Task 4: List all samples of saliva type that are observed by the operator with ID 4. Including sample type, ID, date, and volume.
Sample_Id = 47 Sample_Type = SALIVA Volume = 32.0 Date = 2018-03-30
Sample_Id = 42 Sample_Type = SALIVA Volume = 53.0 Date = 2013-10-13
Sample_Id = 19 Sample_Type = SALIVA Volume = 43.0 Date = 2021-02-18
Sample_Id = 21 Sample_Type = SALIVA Volume = 36.0 Date = 2020-10-14

Task 5: Find the operator who is responsible for processing sample 14. Show its ID, name, and surname.
Person_Id = 29 Name = 'Myra' Surname = 'Turner' isOperator = true

Task 6: List all the racks with their required storage temperature which is the minimum of all the storage temperatures for the samples within the rack. Include the ID of the rack, its total capacity, and the required storage temperature.
Rack_Id = 8 Required Temp = 5.0 Capacity=5
Rack_Id = 2 Required Temp = 10.0 Capacity=4
Rack_Id = 4 Required Temp = 5.0 Capacity=3
Rack_Id = 13 Required Temp = 5.0 Capacity=6
Rack_Id = 9 Required Temp = 5.0 Capacity=5
Rack_Id = 15 Required Temp = 5.0 Capacity=2
Rack_Id = 14 Required Temp = 5.0 Capacity=4
Rack_Id = 11 Required Temp = 5.0 Capacity=3
Rack_Id = 5 Required Temp = 5.0 Capacity=6
Rack_Id = 10 Required Temp = 5.0 Capacity=5
Rack_Id = 3 Required Temp = 5.0 Capacity=4
Rack_Id = 7 Required Temp = 10.0 Capacity=1
Rack_Id = 12 Required Temp = 5.0 Capacity=3
Rack_Id = 6 Required Temp = 10.0 Capacity=2
Rack_Id = 1 Required Temp = 5.0 Capacity=6

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.7/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 654ms
3 actionable tasks: 2 executed, 1 up-to-date
4:57:25 PM: Task execution finished 'ProcessSample.main()'.


```