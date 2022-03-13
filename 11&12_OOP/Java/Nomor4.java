public class Nomor4 {
    public static void main(String[] args) {
        Animals parent = new Animals();
        Animals.parent();
        Animals herbivor = new herbivor();
        herbivor.parent();
        Animals carnivor = new carnivor();
        carnivor.parent();
        Animals omnivor = new omnivor();
        omnivor.parent();
    }

    public class Animals {
        private String name;
        private String Jenis;
        private String Gigi;
        System.out.println("Hi I m Parent of all animals"
        + "My name is"
        + name);
    }

    public class herbivor extends Animals{
        private String classes;
        private String name;
        private String name2;
        private String food1;
        private String food2;
        private String gigi;
        public void parent(){
            name ="Sport Cars";
            name2 = "Pickups Cars";
            System.out.println("Hi I m"
        + classes
        + "My Name is"
        + name
        + "'"
        + "My Food is"
        + food1
        + "I have"
        + gigi
        );
        System.out.println("Hi I m"
        + classes
        + "My Name is"
        + name
        + "'"
        + "My Food is"
        + food1
        + "I have"
        + gigi
        );
        }
        public class carnivor extends Animals{
            private String classes;
            private String name;
            private String name2;
            private String food1;
            private String food2;
            private String gigi;
            public void parent(){
                name ="Sport Cars";
                name2 = "Pickups Cars";
                System.out.println("Hi I m"
            + classes
            + "My Name is"
            + name
            + "'"
            + "My Food is"
            + food1
            + "I have"
            + gigi
            );
            System.out.println("Hi I m"
            + classes
            + "My Name is"
            + name
            + "'"
            + "My Food is"
            + food1
            + "I have"
            + gigi
            );
            }
    
    }
    public class omnivor extends Animals{
        private String classes;
        private String name;
        private String name2;
        private String food1;
        private String food2;
        private String gigi;
        public void parent(){
            name ="Sport Cars";
            name2 = "Pickups Cars";
            System.out.println("Hi I m"
        + classes
        + "My Name is"
        + name
        + "'"
        + "My Food is"
        + food1
        + "I have"
        + gigi
        );
        System.out.println("Hi I m"
        + classes
        + "My Name is"
        + name
        + "'"
        + "My Food is"
        + food1
        + "I have"
        + gigi
        );
        }

}




}
