public class Exercise02 {
    public static void main(String[] args) {
        int [] testArray = {1,2,3};

        testArray = reverseArray(testArray);

        for (int i : testArray){
            System.out.println(i);
        }


    }
    public static int[] reverseArray (int [] arrayNumber){
        /*
        This method reverse an array
         */
        int [] reversedArray = new int[arrayNumber.length];
        int indexDec = arrayNumber.length - 1;
        int index = 0;

        for (;indexDec>=0; indexDec--){
            reversedArray[index] = arrayNumber [indexDec];
            index ++;
        }

        return reversedArray;
    }
}
