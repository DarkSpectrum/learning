public class HelloWorld {
    public static String Weather = "Winter";

    public static void main(String args[]){
        HelloWorld obj1 = new HelloWorld();
        HelloWorld obj2 = new HelloWorld();
        HelloWorld obj3 = new HelloWorld();
        
        System.out.println(obj1.Weather);
        System.out.println(obj2.Weather);
        System.out.println(obj3.Weather);

        obj2.Weather = "Fall";

        System.out.println(obj1.Weather);
        System.out.println(obj2.Weather);
        System.out.println(obj3.Weather);

/*
Explanation

In the first println the variable was from the public class (Winter). Overwriting obj2 overwrites the variable for the rest of the code, so the remainder prints out "Fall".

*/
    }
}