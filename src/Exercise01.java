public class Exercise01 {

    public static void main(String[] args) {

        System.out.println(createArray(5, 'b'));
    }

    public static char[] createArray(int quantity, char letra){
        /*
        This method receive an int and a char variable, and create an array.
        The array's size is the int var, and the content is the char.
        */
        char [] result = new char[quantity];

        for (int index=0; index < result.length; index++){
            result[index] = letra;
        }
        return result;
    }
}
