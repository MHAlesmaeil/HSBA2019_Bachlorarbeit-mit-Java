package de.hsba.LinearRegression.demo;

import java.util.*;

/**
 * this class contains the datasets
 * 3 data sets exist and need to be specified once the instance of this class is being created
 */
public class Implementation {
    // list for data set
    double[][] list;
    // if a variable show no improvement within limit, the function stop calling it for further improvement
    int limit = 1000;
    // if true was selected, the comments of developer will be shown in console. Default is false
    public boolean showComments = false;

    // constructor
    public Implementation(int dataset, boolean showComments, int limit) {
        selectDataset(dataset);
        this.showComments = showComments;
        this.limit = limit;
    }

    // select data set | Expected dataset value = {1,2,3}
    public void selectDataset(int dataset) {
        if (dataset < 4 && dataset > 0) {
            if (dataset == 1)
                list = simpleDataset;
            else if (dataset == 2)
                list = bitComplexDataset;
            else if (dataset == 3)
                list = complexDataset;
        } else {
            // show comment of the developer
            if (showComments == true) {
                System.out.println("The list you specified does not exist");
            }
        }
    }

    /**
     * the first elemet of a row represents the "y" value and the rest are "x"s
     */

    // simple data set
    public double[][] simpleDataset = {
            {136, 10},
            {161, 26}
    };

    // a bit complex data set
    public double[][] bitComplexDataset = {
            {140, 20, 18, 0},
            {136, 10, 0, 1},
            {94, 5, 24, 0},
            {190, 22, 0, 1},
            {161, 26, 18, 0},
            {112, 12, 12, 0},
            {143, 16, 12, 0},
            {151, 7, 18, 1},
            {103, 6, 0, 0},
            {181, 34, 18, 1},
            {176, 18, 0, 1},
            {128, 4, 24, 0},
    };

    // complex data set
    // refer to: https://www.superdatascience.com/machine-learning/Multiple_Linear_Regression.zip
    public double[][] complexDataset = {
            {192261.83, 0, 1, 165349, 136898, 471784},
            {191792.06, 0, 0, 162598, 151378, 443899},
            {191050.39, 1, 0, 153442, 101146, 407935},
            {182901.99, 0, 1, 144372, 118672, 383200},
            {166187.94, 1, 0, 142107, 91391.8, 366168},
            {156991.12, 0, 1, 131877, 99814.7, 362861},
            {156122.51, 0, 0, 134615, 147199, 127717},
            {155752.6, 1, 0, 130298, 145530, 323877},
            {152211.77, 0, 1, 120543, 148719, 311613},
            {149759.96, 0, 0, 123335, 108679, 304982},
            {146121.95, 1, 0, 101913, 110594, 229161},
            {144259.4, 0, 0, 100672, 91790.6, 249745},
            {141585.52, 1, 0, 93863.8, 127320, 249839},
            {134307.35, 0, 0, 91992.4, 135495, 252665},
            {132602.65, 1, 0, 119943, 156547, 256513},
            {129917.04, 0, 1, 114524, 122617, 261776},
            {126992.93, 0, 0, 78013.1, 121598, 264346},
            {125370.37, 0, 1, 94657.2, 145078, 282574},
            {124266.9, 1, 0, 91749.2, 114176, 294920},
            {122776.86, 0, 1, 86419.7, 153514, 0},
            {118474.03, 0, 0, 76253.9, 113867, 298664},
            {111313.02, 0, 1, 78389.5, 153773, 299737},
            {110352.25, 1, 0, 73994.6, 122783, 303319},
            {108733.99, 1, 0, 67532.5, 105751, 304769},
            {108552.04, 0, 1, 77044, 99281.3, 140575},
            {107404.34, 0, 0, 64664.7, 139553, 137963},
            {105733.54, 1, 0, 75328.9, 144136, 134050},
            {105008.31, 0, 1, 72107.6, 127865, 353184},
            {103282.38, 1, 0, 66051.5, 182646, 118148},
            {101004.64, 0, 1, 65605.5, 153032, 107138},
            {99937.59, 1, 0, 61994.5, 115641, 91131.2},
            {97483.56, 0, 1, 61136.4, 152702, 88218.2},
            {97427.84, 0, 0, 63408.9, 129220, 46085.2},
            {96778.92, 1, 0, 55493.9, 103057, 214635},
            {96712.8, 0, 0, 46426.1, 157694, 210798},
            {96479.51, 0, 1, 46014, 85047.4, 205518},
            {90708.19, 1, 0, 28663.8, 127056, 201127},
            {89949.14, 0, 0, 44069.9, 51283.1, 197029},
            {81229.06, 0, 1, 20229.6, 65947.9, 185265},
            {81005.76, 0, 0, 38558.5, 82982.1, 174999},
            {78239.91, 0, 0, 28754.3, 118546, 172796},
            {77798.83, 1, 0, 27892.9, 84710.8, 164471},
            {71498.49, 0, 0, 23640.9, 96189.6, 148001},
            {69758.98, 0, 1, 15505.7, 127382, 35534.2},
            {65200.33, 0, 0, 22177.7, 154806, 28334.7},
            {64926.08, 0, 1, 1000.23, 124153, 1903.93},
            {49490.75, 1, 0, 1315.46, 115816, 297114},
            {42559.73, 0, 0, 0, 135427, 0},
            {35673.41, 0, 1, 542.05, 51743.2, 0},
            {14681.4, 0, 0, 0, 116984, 45173.1}
    };

    /**
     * ### SECTION 1: SIMPLE METHODS ###########
     * General methods for information about the data set
     */
    // Number of row in a data set
    public int numberOfRows() {
        if (list != null) {
            return list.length;
        } else {
            return 0;
        }
    }

    // return how many elements in the first row
    // We assume  that all rows are compelete with no text input
    public int numberOfItemsOfSingleRow() {
        if (list != null) {
            double[] temp = list[0];
            return temp.length;
        } else {
            return 0;
        }
    }

    /**
     * ######## SECTION 2: VARIABLES #################
     * Methods to calculate the result
     * the initial value of all "A" and "B" is 1, however, this value is going to be adjusted with "determineBestStart" function
     */
    double bVariable = 1;
    double a1 = 1;
    double a2 = 1;
    double a3 = 1;
    double a4 = 1;
    double a5 = 1;
    double a6 = 1;
    double a7 = 1;
    double a8 = 1;
    double a9 = 1;

    /**
     * getter and setter of the "A"s and "B"
     */
    public double getbVariable() {
        return bVariable;
    }

    public void setbVariable(double bVariable) {
        this.bVariable = bVariable;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    public double getA4() {
        return a4;
    }

    public void setA4(double a4) {
        this.a4 = a4;
    }

    public double getA5() {
        return a5;
    }

    public void setA5(double a5) {
        this.a5 = a5;
    }

    public double getA6() {
        return a6;
    }

    public void setA6(double a6) {
        this.a6 = a6;
    }

    public double getA7() {
        return a7;
    }

    public void setA7(double a7) {
        this.a7 = a7;
    }

    public double getA8() {
        return a8;
    }

    public void setA8(double a8) {
        this.a8 = a8;
    }

    public double getA9() {
        return a9;
    }

    public void setA9(double a9) {
        this.a9 = a9;
    }

    /**
     * ##### SECTION 3: METHODS FOR VARIABLES ###########
     * Setter and getter switcher
     * this method is going to be used to optimize calling of setter and getter
     * instead of hard coding each of them
     */
    public void setOfsetter(int x, double newValueToInject) {
        if (x <= numberOfItemsOfSingleRow()) {
            if (x == 0)
                setbVariable(newValueToInject);
            else if (x == 1)
                setA1(newValueToInject);
            else if (x == 2)
                setA2(newValueToInject);
            else if (x == 3)
                setA3(newValueToInject);
            else if (x == 4)
                setA4(newValueToInject);
            else if (x == 5)
                setA5(newValueToInject);
            else if (x == 6)
                setA6(newValueToInject);
            else if (x == 7)
                setA7(newValueToInject);
            else if (x == 8)
                setA8(newValueToInject);
            else if (x == 9)
                setA9(newValueToInject);
        } else {
            // show comment of the developer
            if (showComments == true) {
                System.out.println("Check the number of ITEM you are calling");
            }

        }
    }

    public double getOfGetter(int x) {
        if (x <= numberOfItemsOfSingleRow()) {
            double value = 0;
            if (x == 0)
                value = getbVariable();
            else if (x == 1)
                value = getA1();
            else if (x == 2)
                value = getA2();
            else if (x == 3)
                value = getA3();
            else if (x == 4)
                value = getA4();
            else if (x == 5)
                value = getA5();
            else if (x == 6)
                value = getA6();
            else if (x == 7)
                value = getA7();
            else if (x == 8)
                value = getA8();
            else if (x == 9)
                value = getA9();
            return value;
        } else {
            return 0;
        }
    }

    /**
     * ########## SECTION 4: ESTIMATING THE RESULT ##########
     * estimating the result for up to 9 variables
     */
    public double estimateReesult() {
        double accumilatedReslt = 0;
        for (int rowCounter = 0; rowCounter < numberOfRows(); rowCounter++) {
            double result = 0;
            // Add the value of "y" to the result
            result += (list[rowCounter][0]);
            // If number of raws are greater than 1 etc. for other if statement
            if (numberOfItemsOfSingleRow() > 0) {
                try {
                    result -= bVariable;
                    result -= (list[rowCounter][1]) * a1;
                } catch (Exception e) {
                }

            }
            if (numberOfItemsOfSingleRow() > 1) {
                try {
                    result -= (list[rowCounter][2]) * a2;
                } catch (Exception e) {
                }

            }
            if (numberOfItemsOfSingleRow() > 2) {
                try {
                    result -= (list[rowCounter][3]) * a3;
                } catch (Exception e) {
                }
            }
            if (numberOfItemsOfSingleRow() > 3) {
                try {
                    result -= (list[rowCounter][4]) * a4;
                } catch (Exception e) {
                }
            }
            if (numberOfItemsOfSingleRow() > 4) {
                try {
                    result -= (list[rowCounter][5]) * a5;
                } catch (Exception e) {
                }
            }
            if (numberOfItemsOfSingleRow() > 5) {
                try {
                    result -= (list[rowCounter][6]) * a6;
                } catch (Exception e) {
                }
            }
            if (numberOfItemsOfSingleRow() > 6) {
                try {
                    result -= (list[rowCounter][7]) * a7;
                } catch (Exception e) {
                }
            }
            if (numberOfItemsOfSingleRow() > 7) {
                try {
                    result -= (list[rowCounter][8]) * a8;
                } catch (Exception e) {
                }
            }
            if (numberOfItemsOfSingleRow() > 8) {
                try {
                    result -= (list[rowCounter][9]) * a9;
                } catch (Exception e) {
                }
            }
            accumilatedReslt += Math.pow(result, 2);
        }
        return accumilatedReslt;
    }

    /**
     * #################### SECTION 5: METHOD NEEDED FROM SIMULATED ANNEALING #########################
     */
    // giveRandom give a random for "numberToBeRandomed
    public double giveRandom(double numberToBeRandomed, double vectorToMultiplyWithOriginalOne) {
        // if the number "numberToBeRandomed" is 0, it needs to be adjusted
        // to a better value which is the "determineBestStart"
        if (numberToBeRandomed == 0) {
            numberToBeRandomed = determineBestStart();
        }
        // random needs chance to be also negative
        double random = -1 * new Random().nextDouble() + 1 * new Random().nextDouble();
        double randomMe = numberToBeRandomed * vectorToMultiplyWithOriginalOne * random;
        return randomMe;
    }

    /**
     * If a new value which is randomly generated does not give a better estimation
     * of the total result we need to check if a bad solution can be accepted
     * z= a new random number which is between (0-1)
     * p= (1/e^(|f(Xnew)-f(X)|)/T
     */
    public double possiblityToAcceptASolution(double newResultOfAVariable,
                                              double oldResultOfAVariable,
                                              double timeOfCooling) {
        double p;
        double fDiffernce = newResultOfAVariable - oldResultOfAVariable;
        fDiffernce = 1 / Math.exp((Math.abs(fDiffernce) / timeOfCooling));
        p = (fDiffernce);
        return p;
    }

    /**
     * Best start value for all "A" variables
     * some values will be selected and quickly checked to see which start value
     * gives the best minimized values
     */
    public double determineBestStart() {
        double bestStart = 0;
        double bestResult = 0;
        // array with values that needs to be checked and one of them needs to be selected as start value
        double[] possibleValues = {0.0625, 0.125, 0.25, 0.5, 1, 2, 3, 4, 5, 7, 10, 15, 20, 30, 40, 50, 70, 100, 150, 200};
        // calling the setter of the setter
        for (int x = 0; x < possibleValues.length; x++) {
            // set all "A"s and "B" with the value of our array
            for (int y = 0; y < numberOfItemsOfSingleRow(); y++) {
                setOfsetter(y, possibleValues[x]);
            }
            // check the result
            if (x == 0) {
                // first result
                bestResult = estimateReesult();
                bestStart = possibleValues[x];
            } else {
                // if new result here smaller than the best then new result := best result
                if (estimateReesult() < bestResult) {
                    bestResult = estimateReesult();
                    bestStart = possibleValues[x];
                }
            }
        }
        return bestStart;
    }

    /**
     * ########## SECTION 6: OPTIMIZATION OF A & B ################
     */
    // variables which needed for simulated annealing
    public void optimizationOfAandB(double temp, double coolingRate, double vectorToMultiplyWith) {
        // start time
        long startTime = System.nanoTime();
        // result of "giveMeBestStart"
        double bestStart = determineBestStart();
        // show comment of the developer
        if (showComments == true) {
            System.out.println("The selected start point is: " + bestStart);
        }
        // set variables with bestStart value
        for (int xStartpoint = 0; xStartpoint < numberOfItemsOfSingleRow(); xStartpoint++) {
            setOfsetter(xStartpoint, bestStart);
        }
        /**
         * ############### ORGANIZATION STAFF #############
         * here are staff that is going to be used to print out data in certain style
         */
        // the best found record
        String bestRecord = "";
        // list to keep the records in certain loop
        List<String> tableOfFigures = new ArrayList<String>();
        // Estimate the best result
        double bestResult = estimateReesult();
        // A table to show the development of variables on loop# 10,50,100, 200,500, 1000,2000
        int counterTOShowDevelopement = 0;
        // creating an array and initial it with value of 0
        Map<Integer, Integer> variableStatus = new HashMap<>();
        for (int x = 0; x < numberOfItemsOfSingleRow(); x++) {
            variableStatus.put(x, 0);
        }
        // once breakProcess is true, processing will stop in the second round
        boolean breakProcess = false;


        // temprature needs to be above 1
        while (temp > 1) {
            /**
             * The funciton doesVaribleShowImprovement takes two arguments
             * int variable which refers to the variable
             * boolean: to be placed in a array to count the
             * int the number by which a limit will be specified to stop call a varibale for further improvement
             */
            // Print out the header of the table of records with set temperature, cooling rate, the factor to multiply and limit
            if (counterTOShowDevelopement == 0) {
                String verticalSpace = "";
                String start = "###########################################################";
                tableOfFigures.add(verticalSpace);
                tableOfFigures.add(verticalSpace);
                tableOfFigures.add(start);
                tableOfFigures.add(start);
                // the form of "|" is used to be able to work filter the data on excel
                String conditionsOfExperiment = "Best_Start_Value| " + bestStart + " |The_start_temperature| " + temp + " | the_cooling_rate| " + coolingRate + "| the_factor_to_multiply_with| " + vectorToMultiplyWith + "| The Variable limit | " + limit;
                conditionsOfExperiment = conditionsOfExperiment.replace(".", ",");

                tableOfFigures.add(conditionsOfExperiment);
            }
            for (int x = 0; x < numberOfItemsOfSingleRow(); x++) {

                // if one variables is still under the limit, process contine
                for (int variablesCheck = 0; variablesCheck < numberOfItemsOfSingleRow(); variablesCheck++) {
                    // if all are false then temprature=1 and break the process
                    if (variableStatus.get(variablesCheck) < limit) {
                        //System.out.println("there is an element which did not reach the limit and it is"+ x);
                        breakProcess = false;
                    }
                }
                // if variable is within the set limit
                if (variableStatus.get(x) < limit) {
                    // show comment of the developer
                    if (showComments == true) {
                        System.out.println("variable " + x + " has a value of " + variableStatus.get(x));
                    }

                    try {
                        // call the a variable x
                        double oldValueOfTheVariable = getOfGetter(x);
                        // the total estimation before the change
                        double resultBefor = estimateReesult();
                        // call random method
                        double newValueOfTheVariable = giveRandom(oldValueOfTheVariable, vectorToMultiplyWith);
                        // check if an improvement is detected by injecting the random in the setter of the (x)
                        setOfsetter(x, newValueOfTheVariable);
                        // compare the two results resultBefore and resultAfter
                        double resultAfter = estimateReesult();
                        // show comment of the developer
                        if (showComments == true) {
                            System.out.println("The current value: " + oldValueOfTheVariable +
                                    " and the new random one is: " + newValueOfTheVariable +
                                    " The Old Value: " + resultBefor + " New value: " + resultAfter);
                        }
                        // if resultAfter smaller than resultBefore then keep changes
                        // else: reverse if statement
                        if (resultAfter < resultBefor) {
                            // if a variable shows an improvement, it records will be reset to 0
                            variableStatus.put(x, 0);
                            /**
                             * if a random of a variable has shown a positive progress
                             * it will be given another chance to
                             * use the same absolute value once again to the old value
                             */
                            double trySameValue = Math.abs(oldValueOfTheVariable - newValueOfTheVariable);
                            // call the setter and add the trySameVaue to the exist one
                            setOfsetter(x, getOfGetter(x) + trySameValue);
                            // Get the new result
                            double resulTrySameValue = estimateReesult();
                            // as long as the difference shows improvement in the result keep improve the result
                            while (resulTrySameValue < resultAfter) {
                                setOfsetter(x, getOfGetter(x) + trySameValue);
                                resultAfter = resulTrySameValue;
                                resulTrySameValue = estimateReesult();
                                // show comment of the developer
                                if (showComments == true) {
                                    System.out.println("2nd chanance where given to variable number " + (x + 1));
                                }
                            }
                            setOfsetter(x, getOfGetter(x) - trySameValue);
                            // show comment of the developer
                            if (showComments == true) {
                                System.out.println("No more improvement was detected");
                            }

                        } else {
                            // show comment of the developer
                            if (showComments == true) {
                                System.out.println("No improvement was detected");
                            }
                            // if a random<P then keep the changes
                            // z is random number < p which is an equation
                            double zValue = Math.random();
                            // calculte p value
                            double pValue = possiblityToAcceptASolution(resultAfter, resultBefor, temp);
                            // show comment of the developer
                            if (showComments == true) {
                                System.out.println("the value of the random Number is: " + zValue + " and the value of the p: " + pValue);
                            }
                            // if true do not reverse the changes which have been made in if statement
                            if (zValue < pValue) {
                                // show comment of the developer
                                if (showComments == true) {
                                    System.out.println("A limited bad result is accepted");
                                }
                                // tricker for variable limit
                                variableStatus.put(x, 0);
                            } else {
                                // the old value is set again --> no changes is taking place
                                setOfsetter(x, oldValueOfTheVariable);
                                // as a variable did not show any possible improvement, it will get a false
                                // in case that the false reaches the set limit, the variable will not be called again for a new improvement
                                variableStatus.put(x, variableStatus.get(x) + 1);
                            }
                        }
                    } catch (Exception e) {
                    }
                }
            }
            // getting the best result
            if (estimateReesult() < bestResult) {
                bestResult = estimateReesult();
                bestRecord = "Best_Loop# " + counterTOShowDevelopement;
                for (int x = 0; x < numberOfItemsOfSingleRow(); x++) {
                    if (x == 0) {
                        bestRecord += "|B|" + getOfGetter(x);
                    } else {
                        bestRecord += "|A" + x + "|" + getOfGetter(x);
                    }
                }
                bestRecord += "|FunctionValue| " + estimateReesult();
            }
            // inceasing the counter to know the number of loops
            counterTOShowDevelopement++;
            // in a certain loop number keep the variables values
            if (counterTOShowDevelopement == 10 ||
                    counterTOShowDevelopement == 20 ||
                    counterTOShowDevelopement == 50 ||
                    counterTOShowDevelopement == 100 ||
                    counterTOShowDevelopement == 200 ||
                    counterTOShowDevelopement == 500 ||
                    counterTOShowDevelopement == 1000 ||
                    counterTOShowDevelopement == 1500 ||
                    counterTOShowDevelopement == 2000 ||
                    counterTOShowDevelopement == 3000 ||
                    counterTOShowDevelopement == 5000 ||
                    counterTOShowDevelopement == 10000) {
                String s = "Loop# " + counterTOShowDevelopement;
                for (int x = 0; x < numberOfItemsOfSingleRow(); x++) {
                    if (x == 0) {
                        s += "|B|" + getOfGetter(x);
                    } else {
                        s += "|A" + x + "|" + getOfGetter(x);
                    }
                }
                s += "|FunctionValue| " + estimateReesult();
                // replacing dorts with comma
                s = s.replace(".", ",");
                tableOfFigures.add(s);
            }
            // if this value was change over, it will break the process
            if (breakProcess == true) {
                // show comment of the developer
                if (showComments == true) {
                    System.out.println("function has been stopped as all variables have reached their set limit");
                }
                temp = 1;
            }
            temp *= 1 - coolingRate;
            // this value need to change over if there is any element has not reach its limit
            breakProcess = true;
        }
        // showing the result that was gathered through the loops
        for (String singleString : tableOfFigures) {
            System.out.println(singleString);
        }
        // show the final loop result
        String finalLoop = "The_Final_Loop# " + counterTOShowDevelopement;
        for (int x = 0; x < numberOfItemsOfSingleRow(); x++) {
            if (x == 0) {
                finalLoop += "|B|" + getOfGetter(x);
            } else {
                finalLoop += "|A" + x + "|" + getOfGetter(x);
            }
        }
        // Print out the rest of the result
        finalLoop += "|FunctionValue| " + estimateReesult();
        finalLoop = finalLoop.replace(".", ",");
        System.out.println(finalLoop);
        // Print out the best record that was noticed
        System.out.println("###############");
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("The_Best_Record, Total Time of Execution in ms: " + totalTime / 1000000);
        System.out.println("###############");
        System.out.println(bestRecord.replace(".", ","));
    }
}
