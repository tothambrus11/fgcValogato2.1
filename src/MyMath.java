import java.util.ArrayList;
import java.util.function.Predicate;

public class MyMath {

    /**
     * Returns the largest number
     * @param numbers
     * @return
     * @throws Exception
     */
    static Float largestNumber(ArrayList<Float> numbers) throws Exception {
        Float largestNumber = null;

        if(numbers.size() <= 0) {
            throw new Exception("No elements passed in array");
        }

        for (Float current : numbers) {
            if (largestNumber == null || current > largestNumber) {
                largestNumber = current;
            }
        }

        return largestNumber;
    }

    /**
     * @param numbers
     * @param nthLargest
     * @return the nth largest number
     * @throws Exception
     */
    static float nthLargest(ArrayList<Float> numbers, int nthLargest) throws Exception {
        if(nthLargest > 1){

            // Copy all the elements but the largest number into a new ArrayList
            Float largestNumber = largestNumber(numbers);

            ArrayList<Float> newNumbers = new ArrayList(numbers);
            for (int i = 0; i < newNumbers.size(); i++) {
                if(newNumbers.get(i).equals(largestNumber)){
                    newNumbers.remove(i);
                    break;
                }
            }


            // Run this function recursively on the new ArrayList until hte nthLargest variable will be 1
            return nthLargest(newNumbers, nthLargest -1);
        }
        else{
            // Return the 1. largest number
            return largestNumber(numbers);
        }
    }



}
