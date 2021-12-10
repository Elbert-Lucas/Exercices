import java.util.Arrays;

public class SubdivideArray {
    public static void main(String[] args) {
        int [] inputArray = {1, 2, 3, 4, 5};
        int [][] outputArray = subdivideArray(inputArray, 2);

        for (int [] array : outputArray){
            for (int value : array){
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
    public static int[][] subdivideArray(int[] inputArray, int subdivideSize){
        /*
            This method subdivide a simple an array in a multidimensional array
         */
        int [][] outputArray;
        int index = 0;

        /*
            An if/else to make sure that array ins´t too short (or too long) in case of a subdivision with remainder
         */
        if (inputArray.length % subdivideSize == 0) {
            outputArray = new int[inputArray.length / subdivideSize][subdivideSize];
        }
        else{
            outputArray = new int[inputArray.length/subdivideSize + 1] [subdivideSize];
            int sizeForLastArray = 0;

            for (int[] array: outputArray){
                sizeForLastArray += array.length;
            }
            outputArray [outputArray.length-1] = new int[ sizeForLastArray - inputArray.length];
        }

        /*
            {Try / catch} to Array out of bounds, this means the process is done,
            so just finish the function
         */
        for (int [] array : outputArray){

            for (int value =0; value < array.length; value++){
                try {
                    array[value] = inputArray[index];
                    index++;
                }catch (ArrayIndexOutOfBoundsException e){
                    break;
                }
            }

        }
        return outputArray;
    }
}
