public class car_554 extends Vehicle{

    private String make;//for 596
    private String model;
    private int year;


    car_554(String make, String model, int year){
       this.setMake(make);                //  this.make = make;
       this.setModel(model);               // this.model = model;
       this.setYear(year);                //  this.year = year;

    }

    //getters
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    //setters
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void copy(car_554 x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    }
    @Override
    public void go(){
        System.out.println("The car is moving");
    }



    //subclass or child class

    int wheels = 4;
    int doors = 4;
}
