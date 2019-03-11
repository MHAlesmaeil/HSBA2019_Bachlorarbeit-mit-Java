package de.hsba.LinearRegression.demo;

public class PseudoCode {


    /**
     * In this class, selected function would be written in Pseudocode
     * ###############################################################
     * ###############################################################
     * Function name: giveRandom
     * Function description: This function generates a random. In case that the variable which is needed to be randomize is equal to zero, the best start value will be assigned to the variable
     * ###############################################################
     *  public double giveRandom(double numberToBeRandomed, double vectorToMultiplyWithOriginalOne)
     *         IF (numberToBeRandomed == 0)
     *             numberToBeRandomed = determineBestStart()
     *         ENDIF
     *         double randomMe = numberToBeRandomed * vectorToMultiplyWithOriginalOne * new Random().nextDouble()
     *         RETURN randomMe
     *
     * #################################################################
     * #################################################################
     * Function name: determineBestStart
     * Function description: This function helps to find the best start value, as no start value is assigned.
     * ###############################################################
     *  public double determineBestStart()
     *         double bestStart = 0
     *         double bestResult = 0
     *         double[] possibleValues = {0.0625, 0.125, 0.25, 0.5, 1, 2, 3, 4, 5, 7, 10, 15, 20, 30, 40, 50, 70, 100, 150, 200}
     *         FOR (int x = 0; x < possibleValues.length; x++)
     *             FOR (int y = 0; y < numberOfItemsOfSingleRow(); y++)
     *                 setOfsetter(y, possibleValues[x])
     *             ENDFOR
     *             IF (x == 0)
     *                 bestResult = estimateReesult()
     *                 bestStart = possibleValues[x]
     *             ELSE
     *                 IF (estimateReesult() < bestResult)
     *                     bestResult = estimateReesult()
     *                     bestStart = possibleValues[x]
     *                 ENDIF
     *             ENDIF
     *         ENDFOR
     *         RETURN bestStart
     * ##################################################################
     * #################################################################
     *  Function name: optmizationOfAandB
     *  Function description: This function tries to optimize the A and B through the flowing:
     *  1-
     * ###############################################################
     *  public void optimizationOfAandB(double temp, double coolingRate, double vectorToMultiplyWith)
     *         long startTime = System.nanoTime()
     *         double bestStart = determineBestStart()
     *         FOR (int xStartpoint = 0; xStartpoint < numberOfItemsOfSingleRow(); xStartpoint++)
     *             setOfsetter(xStartpoint, bestStart)
     *         ENDFOR
     *         double bestResult = estimateReesult()
     *         int counterTOShowDevelopement = 0
     *         Map<Integer, Integer> variableStatus = new HashMap<>()
     *         FOR (int x = 0; x < numberOfItemsOfSingleRow(); x++)
     *             variableStatus.put(x, 0)
     *         ENDFOR
     *         boolean breakProcess = FALSE
     *         WHILE (temp > 1)
     *             FOR (int x = 0; x < numberOfItemsOfSingleRow(); x++)
     *                 FOR (int variablesCheck = 0; variablesCheck < numberOfItemsOfSingleRow(); variablesCheck++)
     *                     IF (variableStatus.get(variablesCheck) < limit)
     *                         breakProcess = FALSE
     *                     ENDIF
     *                 ENDFOR
     *                 IF (variableStatus.get(x) < limit)
     *                     TRY
     *                         double oldValueOfTheVariable = getOfGetter(x)
     *                         double resultBefor = estimateReesult()
     *                         double newValueOfTheVariable = giveRandom(oldValueOfTheVariable, vectorToMultiplyWith);
     *                         setOfsetter(x, newValueOfTheVariable)
     *                         double resultAfter = estimateReesult()
     *                         if (resultAfter < resultBefor)
     *                             variableStatus.put(x, 0)
     *                             double trySameValue = Math.abs(oldValueOfTheVariable - newValueOfTheVariable);
     *                             setOfsetter(x, getOfGetter(x) + trySameValue)
     *                             double resulTrySameValue = estimateReesult()
     *                             int limitOfVarible =0
     *                             WHILE (resulTrySameValue < resultAfter && limitOfVarible <limitToStopSecondChance )
     *                                 setOfsetter(x, getOfGetter(x) + trySameValue)
     *                                 resultAfter = resulTrySameValue
     *                                 resulTrySameValue = estimateReesult()
     *                                 limitOfVarible ++
     *                             ENDWHILE
     *                             setOfsetter(x, getOfGetter(x) - trySameValue)
     *                        ELSE
     *                             double zValue = Math.random()
     *                             double pValue = possiblityToAcceptASolution(resultAfter, resultBefor, temp)
     *                             IF (zValue < pValue)
     *                                 variableStatus.put(x, 0)
     *                             ELSE
     *                                 setOfsetter(x, oldValueOfTheVariable)
     *                                 variableStatus.put(x, variableStatus.get(x) + 1)
     *                             ENDIF
     *                     ENDTRY
     *                     CATCH (Exception e)
     *                     ENDCATCH
     *                 ENDIF
     *             ENDFOR
     *             IF (breakProcess == TRUE)
     *                 temp = 1
     *             ENDIF
     *             temp *= 1 - coolingRate
     *             breakProcess = TRUE
     *         ENDWHILE
     * }
     *
     *
     *
    */
}

