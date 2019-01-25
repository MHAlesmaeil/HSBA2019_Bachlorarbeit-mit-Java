package de.hsba.LinearRegression.demo;

import java.util.*;

/**
 *  this class contains the datasets
 *  3 data sets exist and need to be specified once the instance of this class is being created
*/
public class Datasets {

    double[][] list;

    public Datasets(int dataset) {
        selectDataSet(dataset);
    }


    /**
     * constrcutor
    */
    public void  selectDataSet (int dataSet) {
        if (dataSet<4 && dataSet>0){
            if (dataSet==1)
                list = simpleDataSet;
            else if (dataSet == 2)
                list =bitComplexDataSet;
            else if (dataSet==3)
                list =complexDataset;
        }else{
            System.out.println("The list you specified does not exist");
        }
    }


    // simple data set
    public double [][] simpleDataSet=
            {{140,20,18,0},
            {136,10,0,1},
            {94,5,24,0},
            {190,22,0,1}};

    // a bit complex data set
    public double[][] bitComplexDataSet =
            {{140,20,18,0},
            {136,10,0,1},
            {94,5,24,0},
            {190,22,0,1},
            {161,26,18,0},
            {112,12,12,0},
            {143,16,12,0},
            {151,7,18,1},
            {103,6,0,0},
            {181,34,18,1},
            {176,18,0,1},
            {128,4,24,0},
};

    // complex data set
    public double[][] complexDataset =
            {{7490,61000,80,2010,1},
            {7990,36036,75,2009,1},
            {8250,40985,80,2010,1},
            {8900,6400,75,2013,0},
            {9950,49900,75,2011,0},
            {10950,19420,80,2013,1},
            {10975,48000,102,2012,1},
            {11790,47600,116,2011,1},
            {12990,49800,105,2012,0},
            {13490,43425,102,2014,0},
            {13800,26720,102,2014,1},
            {13900,7000,80,2016,0},
            {14975,24623,80,2016,0},
            {14995,4850,80,2015,1},
            {15900,8600,80,2015,1},
            {17400,48000,105,2013,0},
            {17829,26500,105,2015,0},
            {18450,11879,110,2015,1},
            {18980,8287,102,2016,1},
            {18990,25500,122,2014,0},
            {19229,9500,105,2015,1},
            {19490,12934,122,2014,0},
            {19900,20964,160,2014,0},
            {19900,17000,105,2016,1},
            {21200,6000,105,2016,0},
            {22500,40000,300,2011,1},
            {22650,42500,140,2015,0},
            {23870,15126,160,2016,1},
            {23900,37300,230,2013,0},
            {23987,17512,200,2013,0},
            {25990,8105,140,2016,0},
            {28890,16466,211,2015,0},
            {29490,31500,170,2015,0},
            {44540,5000,271,2016,0}};

    /**
     * ### SECTION 1: SIMPLE METHODS ###########
    * General methods for the data set
    */
    public int numberOfRaws() {
        if (list != null) {
            return list.length;
        } else {
            return 0;
        }
    }
    // return how many elements in the first row
    public int numberOfItemsOfSingleRaw() {
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
     * the initial value of all "A" and "B" is 1
    */
    double bVariable=1;
    double a1=1;
    double a2=1;
    double a3=1;
    double a4=1;
    double a5=1;
    double a6=1;
    double a7=1;
    double a8=1;
    double a9=1;
    /**
     * getter and setter of the A and B
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
    /**##### SECTION 3: METHODS FOR VARIABLES ###########
     * Setter and getter switcher
     * this method is going to be used to optimize a single
     * instand of hard coding calling the setter and getter of each variable
     * we could do the same be calling the first one when the switcher on 1 and 2nd when the
     * switcher on 2 and so on and so forth
    */
    public void setOfThesetter (int x, double theNewValue){
        if (x<=numberOfItemsOfSingleRaw()){
            if (x==0)
                setbVariable(theNewValue);
            else if (x==1)
                setA1(theNewValue);
            else if (x==2)
                setA2(theNewValue);
            else if (x==3)
                setA3(theNewValue);
            else if (x==4)
                setA4(theNewValue);
            else if (x==5)
                setA5(theNewValue);
            else if (x==6)
                setA6(theNewValue);
            else if (x==7)
                setA7(theNewValue);
            else if (x==8)
                setA8(theNewValue);
            else if (x==9)
                setA9(theNewValue);
        }else{
            System.out.println("Check the number of ITEM you are calling");
        }
    }
    public double getOfTheGetter (int x){
        if (x <= numberOfItemsOfSingleRaw()){
            double value=0;
            if (x==0)
                value= getbVariable();
            else if (x==1)
                value= getA1();
            else if (x==2)
                value= getA2();
            else if (x==3)
                value= getA3();
            else if (x==4)
                value= getA4();
            else if (x==5)
                value= getA5();
            else if (x==6)
                value= getA6();
            else if (x==7)
                value= getA7();
            else if (x==8)
                value= getA8();
            else if (x==9)
                value= getA9();
            return value;
        }else{
            return 0;
        }
    }


    /**
     * ########## SECTION 4: ESTIMATING THE RESULT ##########
     * estimating the result for up to 9 variables
    */
    public double estimatingTheReesult(){
        double accumilatedReslt=0;
        for (int rawCount=0; rawCount<numberOfRaws();rawCount++){
            double result =0;
                    result+=(list[rawCount][0]);
                            if (numberOfItemsOfSingleRaw()>0){
                                try {
                                    result-=bVariable;
                                    result-=(list[rawCount][1])*a1;
                                }catch (Exception e){}

                            }if (numberOfItemsOfSingleRaw()>1){
                                try {
                                    result-=(list[rawCount][2])*a2;
                                }catch (Exception e){}

                            }if (numberOfItemsOfSingleRaw()>2){
                                try {
                                    result-=(list[rawCount][3])*a3;
                                }catch (Exception e){}
                            }if (numberOfItemsOfSingleRaw()>3){
                                try {
                                    result-=(list[rawCount][4])*a4;
                                }catch (Exception e){}
                            }if (numberOfItemsOfSingleRaw()>4){
                                try {
                                    result-=(list[rawCount][5])*a5;
                                }catch (Exception e){}
                            }if (numberOfItemsOfSingleRaw()>5){
                                try {
                                    result-=(list[rawCount][6])*a6;
                                }catch (Exception e){}
                            }if (numberOfItemsOfSingleRaw()>6){
                                try {
                                    result-=(list[rawCount][7])*a7;
                                }catch (Exception e){}
                            }if (numberOfItemsOfSingleRaw()>7){
                                try {
                                    result-=(list[rawCount][8])*a8;
                                }catch (Exception e){}
                            }if (numberOfItemsOfSingleRaw()>8) {
                                try {
                                    result -= (list[rawCount][9]) * a9;
                                } catch (Exception e) {
                                }
                            }
            accumilatedReslt += Math.pow(result,2);
        }
        return accumilatedReslt;
    }
    /**
     * #################### SECTION 5: METHOD NEEDED FROM SIMULATED ANNEALING #########################
     * The method giveMeARadom give a random which suppose to give estimated value a chance for better estimation
     */
    public double giveMeARandom (double numberToBeRandomed, double factorToMultiplyWithOriginalOne){
        // if the number to be randomed is 0, it needs to be adjusted and the best
        // candidate is the best start values
        if (numberToBeRandomed==0){numberToBeRandomed=giveMeBestStartValue();}
        // With the variable randomPossitiveOrNegative give a number between -1 and 1
        
        double random = -1* new Random().nextDouble() + 1 * new Random().nextDouble();
        double randomMe = numberToBeRandomed*factorToMultiplyWithOriginalOne* random;
        return randomMe;
    }
    /**
     * If a new value which is randomly generated does not give a better estimation
     * of the total result we need to check if a bad solution can be accepted
     * z= a new random number which is between (0-1)
     * p= (1/e^(|f(Xnew)-f(X)|)/T
     */
    public double possiblityToAcceptASolution (double newResultOfAVariable,
                                               double oldResultOfAVariable,
                                               double timeOfCooling){
        double p;
        double fDiffernce = newResultOfAVariable-oldResultOfAVariable;
        fDiffernce= 1/Math.exp((Math.abs(fDiffernce)/timeOfCooling));
        p= (fDiffernce);
        return p;
    }
    /**
     * Best start value for all "A" variables
     * some values will be selected and quickly checked to see which start value
     * gives the best minimized values
    */
    public double giveMeBestStartValue (){
        double bestStart=0;
        double bestResult=0;
        // array with values that need to be checked and of them to be selected as start value
        double [] possibleValues ={0.0625,0.125,0.25,0.5,1,2,3,4,5,7,10,15,20,30,40, 50, 70, 100, 150,200};
        // calling the setter of the setter
        for (int x =0; x < possibleValues.length;x++){
            // set all A with the value of our array
            for (int y = 0; y<numberOfItemsOfSingleRaw();y++){
                setOfThesetter(y,possibleValues[x]);
            }
            // check the result
            if (x==0){
                // first result
                bestResult= estimatingTheReesult();
                bestStart= possibleValues[x];
            }else{
                // if new result smaller than the best then new result = best result
                if (estimatingTheReesult()<bestResult){
                    bestResult = estimatingTheReesult();
                    bestStart= possibleValues[x];
                }

            }
        }
        return bestStart;

    }


    /**
     *
    */
    public boolean blockVariable;

    public boolean isBlockVariable() {
        return blockVariable;
    }

    public void setBlockVariable(boolean blockVariable) {
        this.blockVariable = blockVariable;
    }




    

    /**
     * ########## SECTION 6: OPTIMIZATION OF A & B ################
     */
    // variables which needed for simulated annealing
    
    public void optimizationOfAandB (double temp, double coolingRate,double factorToMultiply){

        /**
         * rest the values of the variables for the next round
        */
        double bestStart = giveMeBestStartValue();
        System.out.println("her eis the sdouzb" +  bestStart);
        for(int xxx=0; xxx<numberOfItemsOfSingleRaw();xxx++){
                      setOfThesetter(xxx,bestStart);
        }


        /**
         *
        */


        /**
         * ############### ORGANIZATION STAFF #############
         * here are staff that is going to be used to print out data in certain style
         */
        // the best found record
        String bestRecord="";
        // list to keep the records in certain loop
        List<String> tableOfFigures = new ArrayList<String>();
        // local variable to be compare with the new result if the new estimation of the result is smaller than this value the best record will be saved
        double bestResult= estimatingTheReesult();
        //a table to show the development of variables on 10,50,100, 200,500, 1000,2000
        int counterTOShowDevelopement=0;
        // creating an array and initial it with value of 0
        Map<Integer,Integer> variableStatus = new HashMap<>();
        for (int x =0; x<numberOfItemsOfSingleRaw();x++){
            variableStatus.put(x,0);
        }

        // limit
        int limit = 1000;
        
        while (temp > 1) {
            /**
             * The funciton doesVaribleShowImprovement takes two arguments
             * int variable which refers to the variable
             * boolean: to be placed in a array to count the
             * int the number by which a limit will be specified to stop call a varibale for further improvement
            */


            // set temperature, cooling rate and the factor to multiply
            if (counterTOShowDevelopement==0){
                String verticalSpace="";
                String start="###########################################################";
                tableOfFigures.add(verticalSpace);
                tableOfFigures.add(verticalSpace);
                tableOfFigures.add(start);
                tableOfFigures.add(start);
                /**
                 *the form of "|" is used to be able to work filter the data on excel
                 */
                String conditionsOfExperiment="The_original_temperature| "+temp+" | the_cooling_rate| "+ coolingRate+"| the_factor_to_multiply_with| "+ factorToMultiply;
                conditionsOfExperiment=conditionsOfExperiment.replace(".",",");
                tableOfFigures.add(conditionsOfExperiment);
            }
            for (int x=0;x<numberOfItemsOfSingleRaw();x++){
                if (variableStatus.get(x)<limit){
                    //System.out.println("variable" + x + " has a value of "+ variableStatus.get(x));

                    // is there an improvement variable
                    // todo boolean improvementTricker = false;
                    // System.out.println("the X value is: "+x);
                    /**
                     *calling the checking function
                     * if a variable did not show an improvement for a certain times of loops then it will be escaped
                     * and so the time of computing will be shorten
                     */
                    try {
                        // call the a variable x
                        double oldValueOfTheVariable= getOfTheGetter(x);
                        // the total estimation before the change
                        double resultBefor= estimatingTheReesult();
                        // call random method
                        double newValueOfTheVariable=giveMeARandom(oldValueOfTheVariable,factorToMultiply);
                        // check if an improvement is detected by injecting the random in the setter of the (x)
                        setOfThesetter(x, newValueOfTheVariable);
                        // compare the two results resultBefore and resultAfter
                        double resultAfter= estimatingTheReesult();
                        // call improvementTricker to see if there is an improvement
                        // todo improvementTricker=newValueOfTheVariable<oldValueOfTheVariable;
                        // System.out.println("The current value: "+oldValueOfTheVariable+" and the new random one is: "+newValueOfTheVariable+" The Old Value: "+resultBefor +" New value: "+resultAfter);
                        // if resultBefore greater than result after then keep the change of the random value
                        // else keep the old value of the variable
                        if (resultAfter<resultBefor){
                            /**
                             * if a variable show an improvement it false recorods will be set to 0
                            */
                            variableStatus.put(x,0);
                        }else{
                            // System.out.println("No improvement was detected");
                            // if a random<P then keep the changes
                            // z is random number < p which is an equation
                            double zValue= Math.random();
                            /**
                             *first I have try to plugin the function values, however the absolute value can be huge and that might lead to p= infinity
                             * As a result I have taken the values of the variables to be the
                             */
                            double pValue= possiblityToAcceptASolution(resultAfter, resultBefor,temp);
                            //double pValue= generalMethods.possiblityToAcceptASolution(newValueOfTheVariable, oldValueOfTheVariable,temp);
                            //System.out.println("the value of the random Number is: "+ zValue +" and the value of the p: "+ pValue);
                            if (zValue<pValue){
                                //System.out.println("A limited bad result is accepted");
                                variableStatus.put(x,0);
                            }else {
                                // the old value is set again --> no changes is taking place
                                setOfThesetter(x,oldValueOfTheVariable);
                                // as a variable did not show any possible improvement it will get a false
                                // in case that the false reachs its limit the variable will not be called again to an improvent
                                variableStatus.put(x,variableStatus.get(x)+1);
                            }
                        }
                    }catch (Exception e){
                        // System.out.println("there is an error");
                        }
                }

            }
            // getting the best result
            if (estimatingTheReesult()<bestResult){
                bestResult= estimatingTheReesult();
                bestRecord="Best_Loop# "+counterTOShowDevelopement;
                for (int x=0; x<numberOfItemsOfSingleRaw();x++){
                    if (x==0){
                        bestRecord +="|B|"+ getOfTheGetter(x);
                    }else{
                        bestRecord +="|A"+x+"|"+ getOfTheGetter(x);
                    }
                }
                bestRecord +="|FunctionValue| "+ estimatingTheReesult();
            }
            // inceasing the counter to know the number of loops
            counterTOShowDevelopement++;
            // in a certain loop number keep the variables values
            if (counterTOShowDevelopement==10||
                    counterTOShowDevelopement==20||
                    counterTOShowDevelopement==50||
                    counterTOShowDevelopement==100||
                    counterTOShowDevelopement==200||
                    counterTOShowDevelopement==500||
                    counterTOShowDevelopement==1000||
                    counterTOShowDevelopement==1500||
                    counterTOShowDevelopement==2000||
                    counterTOShowDevelopement==3000||
                    counterTOShowDevelopement==5000||
                    counterTOShowDevelopement==10000){
                String s="Loop# "+counterTOShowDevelopement;
                for (int x=0; x<numberOfItemsOfSingleRaw();x++){
                    if (x==0){
                        s +="|B|"+ getOfTheGetter(x);
                    }else{
                        s +="|A"+x+"|"+ getOfTheGetter(x);
                    }
                }
                s +="|FunctionValue| "+ estimatingTheReesult();
                // replacing dorts with comma
                s=s.replace(".",",");
                tableOfFigures.add(s);
            }
            temp *= 1-coolingRate;
        }
        // showing the result that was gathered through the loop
        for (String singleString: tableOfFigures){
            System.out.println(singleString);
        }
        // show the final loop result

        String finalLoop="Best_Loop# "+counterTOShowDevelopement;
        for (int x=0; x<numberOfItemsOfSingleRaw();x++){
            if (x==0){
                finalLoop +="|B|"+ getOfTheGetter(x);
            }else{
                finalLoop +="|A"+x+"|"+ getOfTheGetter(x);
            }
        }
        finalLoop +="|FunctionValue| "+ estimatingTheReesult();
        finalLoop= finalLoop.replace(".",",");
        System.out.println(finalLoop);
        // Print out the best record that was noticed
        System.out.println("###############");
        System.out.println("The_Best_Record, Data_and_Time: "+ new Date());
        System.out.println("###############");
        System.out.println(bestRecord.replace(".",","));
    }
}
