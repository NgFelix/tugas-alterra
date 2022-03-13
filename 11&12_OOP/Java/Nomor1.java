public class Nomor1 {
    public static void main(String[] args) {
        catclass cat = new catclass("Hitam","4");
        System.out.println("Saya kucing dengan detail, " + "Warna Bulu : "
        + cat.getWarna()
        + " "
        + "dengan jumlah kaki : "
        + cat.getJumlahkaki());

        fishclass fish = new fishclass();
        fish.setJenis("Paus");
        fish.setMakanan("Plankton");
        System.out.println("Saya ikan dengan detail, " + "Jenis: "
                + fish.getJenis()
                + " "
                + "Makanan : "
                + fish.getMakanan());

        Flowerclass flower = new Flowerclass();
        flower.setJenis("Bangkai");
        flower.setColor("Merah");
        flower.setNumofPetal("12");
        System.out.println("Saya bunga dengan detail, " + "Jenis: "
                + flower.getJenis()
                + " "
                + "Color : "
                + flower.getColor());
                
                carclass car = new carclass();
        car.setType("Sedan");
        car.setColor("Merah");
        car.setNumofTire("4");
        System.out.println("Saya mobil dengan detail, " + "Jenis: "
                + car.getType()
                + " "
                + "Color : "
                + car.getColor());
    }
    }

    public static class catclass {
        private String warna;
        private String jumlahkaki;

        public catclass(String warna, String jumlahkaki){
            this.warna = warna;
            this.jumlahkaki = jumlahkaki;
        }
        public String getWarna(){
            return warna;
        }
        public void setWarna(String warna){
            this.warna = warna;
        }
        public String getJumlahkaki(){
            return jumlahkaki;
        }
        public void setJumlahkaki(String jumlahkaki){
            this.jumlahkaki = jumlahkaki;
        }
    }

    public static class fishclass {
        private String Jenis;
        private String Makanan;

        public  String getJenis() {
            return Jenis;
        }
        public void setJenis(String jenis) {
            this.Jenis = jenis;
        }
        public  String getMakanan() {
            return Makanan;
        }
        public void setMakanan(String makanan) {
            this.Makanan = makanan;
        }
    }
    public static class flowerclass {
        private String Jenis;
        private String Color;
        private String NumofPetal;

        public  String getJenis() {
            return Jenis;
        }
        public void setJenis(String jenis) {
            this.Jenis = jenis;
        }
        public  String getColor() {
            return Color;
        }
        public void setColor(String color) {
            this.Color = color;
        }
        public  String getNumofPetal() {
            return NumofPetal;
        }
        public void setNumofPetal(String numofpetal) {
            this.NumofPetal = numofpetal;
        }

    }
    public static class carclass {
        private String Type;
        private String Color;
        private String NumofTire;

        public  String getType() {
            return Type;
        }
        public void setType(String jenis) {
            this.Type = type;
        }
        public  String getColor() {
            return Color;
        }
        public void setColor(String color) {
            this.Color = color;
        }
        public  String getNumofTire() {
            return NumofTire;
        }
        public void setNumofPetal(String numofTire) {
            this.NumofTire = numofTire;
        }

    }

