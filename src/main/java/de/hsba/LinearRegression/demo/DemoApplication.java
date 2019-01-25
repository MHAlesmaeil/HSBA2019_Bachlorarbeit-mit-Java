package de.hsba.LinearRegression.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

	public static void main(String[] args) {
		Datasets dataset = new Datasets(3);

        /*
        dataset.setbVariable(120);
        System.out.println("Excel calculation is: "+dataset.estimatingTheReesult());*/
        /**
         *Test number 1 to select the best temp,cooling rate and factor
         */
        // temprature value needs to be more than one
       double [] tempratueValues= {2};
        // cooling rate e.g. 0.001
        double [] coolingRate= {0.0001};
        // factorToMultiply must be greater than one
        double [] factorToMultiply= {2};
        for (int x=0;x<tempratueValues.length;x++){
            for (int y=0; y<coolingRate.length;y++){
                for (int z =0; z<factorToMultiply.length;z++){
                    dataset.optimizationOfAandB(tempratueValues[x],coolingRate[y],factorToMultiply[z]);
                }
            }
        }
        // excel values of set 2
        dataset.setbVariable(100.329);
        dataset.setA1(2);
        dataset.setA2(0.007);
        dataset.setA3(30.026);
        System.out.println("Excel calculation is: "+ dataset.estimatingTheReesult());

	}


}

