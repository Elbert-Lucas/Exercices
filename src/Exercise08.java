import java.util.Arrays;

public class Exercise08 {

    public static void main(String[] args) {
        int[] inputArray = {6, 8, 10,7};
        int[] inputArray2 = {8, 9,7,5,10};
        int[] result = sameValues(inputArray, inputArray2);

        for (int value:result){
            System.out.println(value);
        }
    }
    public static int[] sameValues(int[] inputArray, int[] inputArray2){
        /*
            This method compares two arrays, and return an array with the common numbers
         */
        int finalLength = 0;
        int [] temporaryArray;
        int [] outputArray;

        if (inputArray.length>inputArray2.length) temporaryArray = new int[inputArray.length];
        else temporaryArray = new int[inputArray2.length];

        for (int value : inputArray){
            for (int secondValue : inputArray2){
            if (value == secondValue){
                temporaryArray [finalLength] = value;
                finalLength++;
                }
            }
        }

        outputArray = new int[finalLength];
        System.arraycopy(temporaryArray,0,outputArray,0,finalLength);

        return outputArray;
    }
}
