package de.hsba.LinearRegression.demo;


public class DemoApplication {

	public static void main(String[] args) {
	    /**
	     * The constructor needs 3 pieces of information in order to execute
         * The code.
         * 1. Dataset need to be specified. Give the data set number which is between 1 and 3
         * 2. ShowComment: select true to show the comments of the developer. It will be recommended to select dataset number 1.
         * 3. Limit: when a variable does not show any improvement for a certain number of time on a row with in the limit, it will not be called again for further development
         * 4. LimitToStopSecondChance: When a variable achieves a positive improvement it need to limit the times, by which a second chance is given to not allow a local optimum to be created.
	    */
		Implementation dataset = new Implementation(3, false,4000, 40);

        // temprature value needs to be more than one
       double [] tempratueValues= {5, 3, 2};
        // cooling rate e.g. 0.001
        double [] coolingRate= {0.000001, 0.0000001, 0.0000001};
        // vectorToMultiply must be greater than one
        double [] vectorToMultiply= { 3, 2};
        for (int x=0;x<tempratueValues.length;x++){
            for (int y=0; y<coolingRate.length;y++){
                for (int z =0; z<vectorToMultiply.length;z++){
                    dataset.optimizationOfAandB(tempratueValues[x],coolingRate[y],vectorToMultiply[z]);
                }
            }
        }
	}
}

