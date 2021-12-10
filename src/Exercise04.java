public class Exercise04 {
    public static void main(String[] args) {
        int [] array = {1,1,2,3,4,3,5,0,6,8};
        array = removeItemsArray(array, 1,2,3);

        for (int b:array){
            System.out.println(b);
        }

    }
    public static int[] removeItemsArray(int[] array, int... delete){
        /*
        This method removes unwanted elements from an array
         */
        int [] temporaryArray = new int[array.length];
        int [] finalArray;
        int index = 0;

        for (int number:array){
            boolean canPut = true;

            for (int num:delete){
                if (number == num){
                    canPut = false;
                    break;
                }
            }
            if (canPut){
                temporaryArray[index] = number;
                index++;
            }
        }
        /*
        It´s impossible know the size of array in advance,
        so the next loop put the first values in the final array,
        discarding the last values what may unwanted (as 0 or Null)
         */
        finalArray = new int[index];

        for (int position = 0; position<index; position++){
            finalArray [position] = temporaryArray[position];
        }

        return finalArray;
    }
}
