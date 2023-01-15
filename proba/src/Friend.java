public class Friend {
    String name;

    static int number_of_friends;

    Friend(String name){
        this.name = name;
        number_of_friends++;
    }
    static void display(){

        System.out.println("you have" + number_of_friends + "friends");
    }

}
