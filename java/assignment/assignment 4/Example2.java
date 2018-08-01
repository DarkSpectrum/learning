class Example2 {

    private int var;
    
    //default constructor
    public Example2() {
        this.var = 10; 
    }

//parameterized constructor
    public Example2(int num) {
    this.var = num;
    }

    public int getValue() {
    return var;
    }

    public static void main(String args[]){
        Example2 obj = new Example2();
        Example2 obj2 = new Example2(100);
        System.out.println("var is: "+obj.getValue());
        System.out.println("var is: "+obj2.getValue());
    }
}

/*
1) Declare a variable "var"
2) Create a constructor class and set the variable to 10
3) Create a variable that is replaced in the constructor and return it in another one.
4) 
*/