public class car_in_relation_to_hgfd_437 {

    String make = "audi";
    String model = "a8";
    String color = "black";
    double price = 20000.00;
    int age = 2010;
    String name;


    public String toString(){
       /* String myString = make + "\n" + model + "\n" + color + "\n" + age + "\n" + price;
        return myString;
        */
        return  make + "\n" + model + "\n" + color + "\n" + age + "\n" + price;

    }

    void drive(){
        System.out.println("You are driving");

    }
    void brake(){
        System.out.println("you stopped");

    }
    car_in_relation_to_hgfd_437(String name){
        this.name = name;
    }

}
