public class Nomor3 {
    public static void main(String[] args) {
        Vehicles parent = new Vehicles();
        parent.parent();
        Vehicles bike = new bikes();
        bike.parent();
        Vehicles car = new Cars();
        car.parent();
        Vehicles bus = new buses();
        bus.parent();
    }

    public class Vehicles {
        private String name;
        private String Engine;
        System.out.println("Hi I m Parent of all vehicles"
        + "My name is"
        + name
        + "My engine status is"
        + "'"
        + Engine
        + "'");

    }

    public class Cars extends Vehicles{
        private String name;
        private String Engine;
        private int Wheel;
        private String Engine_Type;
        private String name2;
        private String Engine_Type2;

        public void parent(){
            name ="Sport Cars";
            name2 = "Pickups Cars";
            Engine ="With Engine";
            Wheel = 4;
            Engine_Type ="V8";
            Engine_Type2 = "Solar";
            System.out.println("Hi I m Car"
        + "My name is"
        + name2
        + "My engine status is"
        + "'"
        + Engine
        + "'"
        + "I Have"
        + Wheel
        + " Wheel(s)"
        + "My Engine Type = "
        + Engine_Type2);
        System.out.println("Hi I m Car"
        + "My name is"
        + name
        + "My engine status is"
        + "'"
        + Engine
        + "'"
        + "I Have"
        + Wheel
        + " Wheel(s)"
        + "My Engine Type = "
        + Engine_Type);
        }
        public class Buses extends Vehicles{
            private String name;
            private String Engine;
            private int Wheel1;
            private String Bus_Type;
            private String name2;
            private String Bus_Type2;
    
            public void parent(){
                name ="Trans Jakarta";
                name2 = "School Bus";
                Engine ="With Engine";
                Wheel1 = 4;
                Bus_Type ="Public Bus";
                Bus_Type2 = "Private Engine";
                System.out.println("Hi I m Bus"
            + "[" + Bus_Type
            + "]"
            + "My Name is"
            + name
            + "My Engine Status Is"
            + "'"
            + Engine
            + "'"
            + "I have"
            + Wheel1
            + " Wheel(s)");
            System.out.println("Hi I m Bus"
            + "[" + Bus_Type2
            + "]"
            + "My Name is"
            + name2
            + "My Engine Status Is"
            + "'"
            + Engine
            + "'"
            + "I have"
            + Wheel1
            + " Wheel(s)");
            }
    
    }
    public class Bikes extends Vehicles{
        private String namebike;
        private String namebike2;
        private String Enginebike1;
        private String Enginebike2;
        private int Wheelcounter;

    
        public void parent(){
            namebike ="Pedal Bike";
            namebike2 = "Motor Bike";
            Enginebike1 ="No Engine";
            Enginebike2 ="With Engine";
            Wheelcounter = 2 ;
            
            System.out.println("Hi I m Bike"
        + "My Name is"
        + namebike
        + "My Engine Status is"
        + "'"
        + Enginebike
        + "'"
        + "I have"
        + Wheelcounter
        + " Wheel(s)");
        System.out.println("Hi I m Bike"
        + "My Name is"
        + namebike2
        + "My Engine Status is"
        + "'"
        + Enginebike2
        + "'"
        + "I have"
        + Wheelcounter
        + " Wheel(s)");
        }

}




}
