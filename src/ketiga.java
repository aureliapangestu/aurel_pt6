class ketiga {
    String name;

    public ketiga(String name) {
        this.name = name;

    }

    public void warna() {
        System.out.println("laptop ini berwarna: ");
    }
}
    class Asus extends ketiga {
        public Asus(String name) {
            super(name);
        }

        @Override
        public void warna() {
            System.out.println(name + "Laptop ini berwarna: silver");

        }
    }
     class Lenovo extends ketiga{
            public Lenovo (String name){
                super (name);
            }


        @Override
        public void warna() {
            System.out.println(name + "Laptop ini berwarna: silver");
        }
    }


