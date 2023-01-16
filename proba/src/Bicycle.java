class Bicycle{
    static int Speed = 20;
    public static void main(String[] args){

        MountainBike mountainBike = new MountainBike(20, 8, 16);
        mountainBike.applyBrake(5);
        System.out.println(mountainBike.newinfo());
    }
}

 class Bicicle {
    int Speed;
    int Gear;
    Bicicle(int Speed, int Gear){
        this.Speed = Speed;
        this.Gear = Gear;
    }

    int applyBrake(int dec){
        Speed = Speed - dec;
        return Speed;
    }
    int speedUp(int inc){
        Speed = Speed + inc;
        return Speed;
    }
     String Information(){
         return ("Speed of the bike is " + Speed + " and it has " + Gear + "gears.");
     }


}
    class MountainBike extends Bicicle{

     int WheelSize;
     MountainBike(int Speed, int Gear, int WheelSize){
         super(Speed, Gear);
         this.WheelSize = WheelSize;

     }
        @Override
        int applyBrake(int dec){
            Speed = Speed - dec;
            return Speed;
        }
        @Override
        int speedUp(int inc){
            Speed = Speed + inc;
            return Speed;
        }
     int ReplaceWheel(int WheelSize){
         Speed = Speed + 1/4*WheelSize;
         return Speed;
     }
     String newinfo() {
         return "after replacing wheel the speed is: " + Speed;
     }
}

