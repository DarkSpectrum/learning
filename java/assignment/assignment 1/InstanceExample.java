public class InstanceExample {
    String Weather = "Winter";

    public static void main(String args[]){
        InstanceExample obj1 = new InstanceExample();
        InstanceExample obj2 = new InstanceExample();
        InstanceExample obj3 = new InstanceExample();
        
        System.out.println(obj1.Weather);
        System.out.println(obj2.Weather);
        System.out.println(obj3.Weather);

        obj2.Weather = "Fall";

        System.out.println(obj1.Weather);
        System.out.println(obj2.Weather);
        System.out.println(obj3.Weather);
    }
}
/*
Explanation

We created a different instance of the object, so we can dynamically set the output of it. Therefore, we can change the class inside the main class dynamically.

*/