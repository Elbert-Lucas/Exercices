public class Exercise04 {
    public static void main(String[] args) {
        int [] array = {1,1,2,3,4,3,5};
        array = removeItemsArray(array, 1,2,3);

        for (int b:array){
            System.out.println(b);
        }

    }
    public static int[] removeItemsArray(int[] array, int... delete){
        /*
        This method removes unwanted elements from an array

        This method maybe return zeros in arrays, it's because is impossible know the size of the final array in advance.
        Use a list can fix that, but the idea is use an array
         */
        int [] removedArray = new int[array.length - delete.length];
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
                removedArray[index] = number;
                index++;
            }
        }
        return removedArray;
    }
}
