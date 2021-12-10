public class Exercise05 {
    public static void main(String[] args) {
        int [] fisrtArray = {1,2,3};
        int [] secondArray = {1,2,3};

        boolean result = isEqualArrays(fisrtArray,secondArray);
        System.out.println(result);
    }
    public static boolean isEqualArrays(int[] fisrtArray, int[] secondArray ){
        /*
            This method compares two arrays and return the bool of the equality.
            The order of the values influence on result
         */
        if (fisrtArray.length != secondArray.length){
            return false;
        }

        for (int index = 0; index < fisrtArray.length; index++){
           if (fisrtArray[index] != secondArray[index]) return false;
        }
        return true;
    }
}
