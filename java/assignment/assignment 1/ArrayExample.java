class ArrayExample {
    public static void main(String args[]) {
        int Array[] = new int[6];
        for(int count = 0; count < Array.length; count++) {
            Array[count]=count;
            }

        for(int i=0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}    
   

/*
Explanation

1) Intialise an array that is six items long
2) Start the array at zero, and while the array length is larger than the cycle, add one to the count.
3) FIll the array with the variables.
4) while the array length is larger than the cycle, add one to the count and print out the array.
*/