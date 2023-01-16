class Veh {
    private String color;
    private int NumberOfWheels;

    public Veh(String color, int NumberOfWheels) {
        this.color = color;
        this.NumberOfWheels = NumberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWheels() {
        return NumberOfWheels;
    }

    public void print() {
        System.out.println("Color: " + color);
        System.out.println("Wheels: " + NumberOfWheels);
    }
}

    class Truck extends Veh {
        private double LoadCapacity;

        public Truck(String color, int NumberOfWheels, double LoadCapacity) {
            super(color, NumberOfWheels);
            this.LoadCapacity = LoadCapacity;
        }

        public double getLoadCapacity() {
            return LoadCapacity;
        }

        @Override
        public void print() {
            super.print();
            System.out.println("Load capacity is:" + LoadCapacity);
        }


    }

   class Engine extends Veh {

        public Engine(String color, int NumberOfWheels) {
            super(color, NumberOfWheels);

        }
    }

    public class Fleet {
        public static void main(String[] args) {


            Engine FleetEngine = new Engine("metallic", 4);
            Truck FleetTruck = new Truck("Black", 8, 8.50);

            FleetEngine.print();
            FleetTruck.print();
        }

    }
