public class exercise06 {
    public static void main(String[] args) {
        int [][] inputAray = {{1, 2}, {3}, {4, 5}};
        int [] outputArray = simplifyArray(inputAray);

        for (int value:outputArray){
            System.out.println(value);
        }
    }
    public static int[] simplifyArray(int [][] inputArray){
        /*
        This method simplify a multidimensional array on a simple array
         */
        int outputSize = 0;
        int [] outputArray;
        int index = 0;

        for (int [] size : inputArray){
            outputSize += size.length;
        }

        outputArray = new int[outputSize];

        for (int [] arrays : inputArray){
            for (int value : arrays){
                outputArray[index]=value;
                index++;
            }
        }
        return outputArray;
    }
}
