import java.awt.*;
import java.io.*;
import java.lang.module.FindException;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.io.FileReader;
import java.awt.Color;

public class hgfd {
//bro code java
   /*basic
   public static void main(String [] args) {
        System.out.println("bye");
        int x = 123;
        boolean y = true;
        char s = '#';
        String b = "sdsddd";
        System.out.println("My number is: " + y);
    }*/

    /* changing the assignmnet
    public static void main(String [] args){
         String x = "water";
         String y = "coolaid";
         String temp;

         temp = x;
         x = y;
         y = temp;
        System.out.println("x:" +x);
        System.out.println("y:" +y);
    }*/
   /* scanner
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("name:");
       String name = sc.nextLine();

       System.out.println("hello" + name);
       System.out.println("old:");
       int age = sc.nextInt();
       System.out.println("hello " +name + age);
   }*/
   /* expressions
   public static void main(String [] args){

       double friends = 18;
       friends = (double) friends/5;
       friends++;
       System.out.println(" "+ friends);

   }*/
  /*basic gui
   public static void main(String [] args){

       String name = JOptionPane.showInputDialog("Enter your name:");
       JOptionPane.showMessageDialog(null, "Hello" +name);

        int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
    JOptionPane.showMessageDialog(null, "You are: " +age);

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
    JOptionPane.showMessageDialog(null,"You are " +height+ " cm tall");
   }*/
   /*Math class
   public static void main(String [] args){

       double x = 3.14;
       double y = -10;

       double z = Math.max(x, y);
       System.out.println(z);

        double b = Math.abs(y);

       double a = Math.min(x, y);
       System.out.println(a);

       double c = Math.sqrt(x);

       double f = Math.round(x);

       double d = Math.ceil(x); //round up

       double e = Math.floor(x); //round down
       //hypotenuse
        double k;
        double p;
        double o;
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter side k:");
        k = scanner.nextDouble();

       System.out.println("Enter side p:");
       p = scanner.nextDouble();

      z = Math.sqrt((x*x)+(y*y));
       System.out.println("Hypotrnuse is:" + z);

       scanner.close(); //closing the scanner wow
   }*/
   /*random
   public static void main(String [] args){


       Random random = new Random(); //pseudo random numbers
        int x = random.nextInt(6)+1; //between 0 and 5 you know why
       System.out.println(x);

       double y = random.nextDouble(); //between 0 and 1
       System.out.println(y);

       boolean z = random.nextBoolean(); // true or false
       System.out.println(z);
   } */
   /* if statement
    public static void main(String[] args) {

        int age = 76;
        if(age==75) {

            System.out.println("old");
        }
        else if(age>18) {
            System.out.println("adult");
        else if(age>=13) {
                System.out.println("teen");
            }
        }
        else {
            System.out.println("a kid");
        }



    }*/
   /*switches
    public static void main(String[] args) {

        String day = "Fridgfay";
        switch (day){
            case "Monday":
                System.out.println("its Monday");
                break;
            case "Tuesday":
                System.out.println("its Tuesday");
                break;
            case "Wednesday":
                System.out.println("its Wednesday");
                break;
            case "Thursday":
                System.out.println("its Thursday");
                break;
            case "Friday":
                System.out.println("its Friday");
                break;
            case "Saturday":
                System.out.println("its Saturday");
                break;
            case "Sunday":
                System.out.println("its Sunday");
                break;
            default:
                System.out.println("not a day");
            }

    }*/
    //logical operators
    // public static void main(String[] args) {

       /* and
       int temp = 25;              // &&    ||    !
        if (temp>30){               // and     or   not
            System.out.println("hot");
        }
        else if (temp>=20 && temp<=30) {
            System.out.println("nice");
        }
        else {
            System.out.println("cold");
        }
    }*/
   /*|| and just add ! to negate
    Scanner scanner = new Scanner(System.in);

        System.out.println("Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")){
            System.out.println("you quit the game");
        }
        else {
            System.out.println("Still playing");
        }
*/
   /* while loop
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        while(name.isBlank()) {
            System.out.print("Enter your name");
            name = scanner.nextLine();
        }
        System.out.println("hello " + name);
    */

   /* for loop
   public static void main(String[] args) {


        for (int i = 10; i>=0; i--) {
            System.out.println(i);


        }
        System.out.println("happy new year");
    */
  /* nested for loops
  public static void main(String[] args) {

       System.out.println("eneter number of rows: ");
       rows = scanner.nextInt();
       Scanner scanner = new Scanner(System.in);
       int rows;
       int columns;
       String symbol = "";

       System.out.println("eneter number of rows: ");
       rows = scanner.nextInt();
       System.out.println("eneter number of columns: ");
       columns = scanner.nextInt();
       System.out.println("enter symbol to use: ");
       symbol = scanner.next();

       for (int i=1; i<=rows; i++){
           System.out.println();
           for (int j=1; j<=columns; j++){
               System.out.print(symbol);
           }
*/
  /*1d arrays and printing them with for loop
   public static void main(String[] args) {

       String[] cars ={ "Camaro", "Corvo", "Tesla"};
       cars[0] = "Mustang";
       System.out.println(cars[2]);

       String carss[] = new String[3];

       carss [0] = "car1";
       carss [1] = "car 2";
       carss [2] = "car 3";

       for (int i=0; i< carss.length; i++){
           System.out.println(carss[i]);
       }
*/   /* 2d arrays amd printing
    public static void main(String[] args) {

       String[][] cars = new String[3][3];
       cars[0][0] = "car 0 0";
       cars[0][1] = "car 0 1";
       cars[0][2] = "car 0 2";
       cars[1][0] = "car 1 0";
       cars[1][1] = "car 1 1";
       cars[1][2] = "car 1 2";
       cars[2][0] = "car 2 0";
       cars[2][1] = "car 2 1";
       cars[2][2] = "car 2 2";

       for (int i=0; i< cars.length; i++){
           System.out.println();
           for (int j=0; j<cars[i].length; j++){
               System.out.print(cars[i][j] + " ");
           }
       }
*/
  /*String methods
  public static void main(String[] args) {

       String name = "   ja   ";
       //boolean result = name.equals("ja");
                        //name.equalsIgnoreCase("ja"); ignoring the casing (lower or upper)
       //int result = name.length();
       //char result = name.charAt(0);
      // int result = name.indexOf("j");
       // boolean result = name.isEmpty();
       //String result = name.toUpperCase();
       //String result = name.toLowerCase();
       //String result = name.trim();
        String result = name.replace('a', 'o');
       System.out.println(result);
*/
   /*Arraylist
   public static void main(String[] args) {
       ArrayList<String> food = new ArrayList<String>();
       food.add("pizza");
       food.add("burger");

       food.set(0, "sushi");
       food.remove(1);
       food.clear();


       for (int i=0; i<food.size(); i++){
           System.out.println(food.get(i));
*/
  /*2d array lists
  public static void main(String[] args) {

       ArrayList< ArrayList<String>> groceryList = new ArrayList<>();

       ArrayList<String> bakeryList = new ArrayList();
       bakeryList.add("pasta");
       bakeryList.add("bread");
       bakeryList.add("donuts");

       ArrayList<String> produceList = new ArrayList();
       produceList.add("lemon");
       produceList.add("tomatoes");
       produceList.add("cucumbers");

       ArrayList<String> drinksList = new ArrayList();
       drinksList.add("soda");
       drinksList.add("water");
       drinksList.add("juice");

        groceryList.add(bakeryList);
       groceryList.add(produceList);
        groceryList.add(drinksList);


       System.out.println(groceryList.get(0).get(0)); //first index of first list
       System.out.println(groceryList);

 */
  /* for each loops
  public static void main(String[] args) {

     //  String[] animals = {"cat", "dog", "mouse", "parrot","hamster", "pig"};
        ArrayList<String> animals = new ArrayList<String>();

        //         : is read as IN so we can read the foreach loop as String i in list or array animals
        animals.add("cat");
        animals.add("rat");
        animals.add("parrot");
       for (String i : animals){
           System.out.println(i);
       }
*/
  /* methods
  public static void main(String[] args) {

       String name = " ja";
       int age = 21;
       second(name,age);
       int x = 4;
       int y = 3;

      int z = add(x,y);
       System.out.println(z);
       System.out.println(add(x,y));


   }
   static  void second(String name, int age){
       System.out.println("hello" + name + age);

   }
   static int add(int x, int y){

       int z = x + y;
       return z;
       //return x + y;


   }*/
  /* overloaded method
  public static void main(String[] args) {
      int x = add(1,2, 3);
      System.out.println(x);




    }
    static int add(int a, int b){
        System.out.println("overload method 1");

      return a + b;


    }
    static int add(int a, int b, int c){
        System.out.println("overload method 2");
      return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("overload method 3");
        return a + b + c + d;
    }*/
      /* printf, inda reminds me of c with assigning which values to print
      public static void main(String[] args) {
          System.out.printf("This is a format string %d", 123);

          boolean x = true;
          char y = 'c';
          String z = "dgf";
          int v = 123;
          double n = 3.14;


          System.out.printf("%b", x);
          System.out.printf("%c", y);
          System.out.printf("%s", z);
          System.out.printf("%d", v);
          System.out.printf("%f", n);

          System.out.println();
          System.out.printf("hello %10s", z); //[width] minimum number of characters

          System.out.println();
          System.out.printf("this much money %.1f", n); //[precision] set number of digits when outputting floating point values

       */
  /* final (cant be changed after)
   public static void main(String[] args) {

       final double PI = 3.14159;

       System.out.println(PI);



   }*/
  /*OOP introduction car making (car_in_relation_to_hgfd_437.java needed)
    public static void main(String[] args) {


        car_in_relation_to_hgfd_437 car1 = new car_in_relation_to_hgfd_437();
        car_in_relation_to_hgfd_437 car2 = new car_in_relation_to_hgfd_437();

        System.out.println(car1.model);
        System.out.println(car1.make);

        System.out.println();

        System.out.println(car2.model);

        car1.drive();

    }*/

   /* constructors Human.java needed
    public static void main(String[] args){

        Human human1 = new Human("Rick",75, 160);
        Human human2 = new Human("ja", 20, 80);

        System.out.println(human1.name);
        human2.drink(); //doesnt work*/



  /*global and local, see dice_roller.java
  public static void main(String[] args){


       dice_roller diceRoller = new dice_roller();


    }*/
  /* overloaded constructors
  public static void main(String[] args){


      Pizza pizza = new Pizza("thic crust", "tomato", "mozzie", "salami");
      System.out.println("ingridients: ");

      System.out.println(pizza.bread);
      System.out.println(pizza.sauce);
      System.out.println(pizza.cheese);
      System.out.println(pizza.topping);

  }*/
 /*toString method
 public static void main(String[] args){
      car_in_relation_to_hgfd_437 car = new car_in_relation_to_hgfd_437();
    System.out.println(car.model);
    System.out.println(car.make);
    System.out.println(car.age);
    System.out.println(car.color);
    System.out.println(car.price);

    System.out.println(car.toString());

    System.out.println();

    System.out.println(car);
  }*/
  /*array of objects
  public static void main(String[] args){


    int[] numbers = new int[3];
    char[] characters = new char[4];
    String[] strings = new String[5];

    //food[] refrigerator = new food[3];

      food food1 = new food("pizza");
      food food2 = new food("pajser");
      food food3= new food("dajser");

      food[] refrigerator = {food1,food2,food3};

      //refrigerator[0] = food1;
      //refrigerator[1] = food2;
      //refrigerator[2] = food3;

      System.out.println(refrigerator[0].name);
      System.out.println(refrigerator[1].name);


  }*/
/* sending objects as arguments
    public static void main(String[] args){

        garage g1 = new garage();
        car_in_relation_to_hgfd_437 car1 = new car_in_relation_to_hgfd_437("bmw");
        car_in_relation_to_hgfd_437 car2 = new car_in_relation_to_hgfd_437("audi");
        garage.park(car1);
        garage.park(car2);

    }*/
 /*static modifier
  public static void main(String[] args){


      Friend friend1 = new Friend("Spongie");

      Friend friend2 = new Friend("Pattie");

      Friend friend3 = new Friend("Squiddie");


      //System.out.println(Friend.number_of_friends);
      Friend.display();


  }*/

   /* inheritance (subclasses, superclasses)(need Vehicle.java car_554.java Bike.java)
    public static void main(String[] args){

        car_554 car = new car_554();
        car.go();
        Bike bike = new Bike();
        bike.go();
        bike.stop();
        System.out.println(car.speed);
        System.out.println(bike.wheels);
        System.out.println(car.wheels);


    }
    */


   /* method override (Dog.java Animal.java)
    public static void main(String[] args){


        Dog dog = new Dog();
        dog.speak();


    }

    */
 /* super keyword
 public static void main(String[] args){
       Hero hero1 = new Hero("Batman",42,"$$$");
       Hero hero2 = new Hero("Superman",32,"all");

       //System.out.println(hero1.name);
       //System.out.println(hero1.age);
       //System.out.println(hero1.power);
       System.out.println(hero2);



   }*/
//37, 38 skip for now
  /* public static void main(String[] args){
      car_554 car1 = new car_554("audi", "a8", 22);
      System.out.println(car1.getMake());
      System.out.println(car1.getModel()); //getter
      System.out.println(car1.getYear());

      car1.setYear(2022);  //setter (look in car_554.java)

      System.out.println(car1.getMake());
      System.out.println(car1.getModel());
      System.out.println(car1.getYear());

   }*/

    /* copying objects in java (look in car_554.java)
       public static void main(String[] args){



        car_554 car1 = new car_554("audi", "a8", 22);
        car_554 car2 = new car_554("bmw", "5", 32);

        car2.copy(car1);

        System.out.println();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

     }
*/
    //41 skip, idk how to add the interface
 /* polymorphism (Vehicle.java Bike.java Boat.java car_554.java)
 public static void main(String[] args){

      car_554 car = new car_554("audi", "a8", 22);
      Bike bike = new Bike();
      Boat boat = new Boat();

      Vehicle[] racers = {car, bike, boat};

      for(Vehicle x : racers){

          x.go();

      }*/
   /*    dynamic polymorphism (Animal.java Dog.java Cat.java)
   public static void main(String[] args){
        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want");
        System.out.println("1 cat 2 dog");
        int choice = scanner.nextInt();
        if (choice==1){
            animal = new Cat();
            animal.speak();
        }
        else if (choice==2) {
            animal = new Dog();
            animal.speak();
        }
        else {
            System.out.println("invalid input");
        }

    }*/
    /*exception handling
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result " + z);
        }
        catch (ArithmeticException a){
            System.out.println("cant divide by 0");
        }
        catch (InputMismatchException m) {
            System.out.println("numberrrr");
        }
        catch (Exception e){
            System.out.println("something wrong");           //to catch everything, considered lay,
        }                                                    //should be added as a last resort to sort something we maybe forgot

        finally {
            scanner.close();
            System.out.println("this will always print");
        }*/

  /*files and file class
   public static void main(String[] args) {

     File file = new File("s.txt");
       // File file = new File("C:\\Users\\JA\\Desktop");

        if (file.exists()){
            System.out.println("exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();

        }
        else {
            System.out.println("doesnt exist");
        }*/
 /*file writer
  public static void main(String[] args) {

      try {
          FileWriter fileWriter = new FileWriter("poem.txt");
          fileWriter.write("rdssddssaeally \n really miss u");
          fileWriter.append("\n(a poem by my)");
          fileWriter.close();
      }
      catch (IOException e){
          e.printStackTrace();
      }

    }*/

  /* reader
  public static void main(String[] args) {


        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();

            while(data!=-1){
                System.out.print((char)data);
                data = reader.read();

            }
            reader.close();


        }
        catch (FileNotFoundException e){

            e.printStackTrace();
        }
        catch (IOException e){

            e.printStackTrace();
        }
    }*/
    //48 ski[[ed, its audio


  /*frame fuckaround
    public static void main(String[] args) {
   */
       /* JFrame frame = new JFrame();

        frame.setTitle("JFrame title"); //title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //DO Nothing on close (hehe)
        frame.setSize(420,420); //width and height
        frame.setResizable(false); //resize ban
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("download.png"); //changing logo
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(50,150,200)); //color
*/
     //   myframe myframe = new myframe();


     /* frame, label, border methods
     public static void main(String[] args){

            JLabel label = new JLabel(); //make label
            label.setText("BROOOOOO"); //set txt
            ImageIcon icon = new ImageIcon("download.png");
            Border border = BorderFactory.createLineBorder(Color.green,3); //border line



            JFrame frame = new JFrame(); //new fraem

            frame.setTitle("JFrame title"); //title
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //DO Nothing on close (hehe)
            frame.setSize(420,420); //width and height
            frame.setResizable(true); //resize ban
            frame.setVisible(true); //make frame visible
            frame.setLayout(null);
            frame.add(label);// adding label to frame
            frame.pack();


            label.setIcon(icon); //seting a icon next to label
            label.setHorizontalTextPosition(JLabel.CENTER); //setting text position
            label.setVerticalTextPosition(JLabel.BOTTOM);
            label.setForeground(Color.BLUE); //color of text
            label.setFont(new Font("MV Boli",Font.PLAIN,20)); //font setting
            label.setBackground(new Color(50, 200, 230)); //background color
            label.setOpaque(true); //seeing the change
            label.setBorder(border); //border
            label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon + text
            label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon + text
            label.setBounds(100, 100, 250, 250); //set x y position within frame as well as dimensions



        }*/
     public static void main(String[] args){



     }



    }





