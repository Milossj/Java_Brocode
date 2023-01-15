import java.util.Random;


public class dice_roller {
    //global variables, declared in a class, visible to all parts of that class

    Random random;
    int number;

    dice_roller(){
        //local variable, declared inside and only visible to one method
        Random random = new Random();
        int number = 0;
        roll(random,number);


    }
    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
