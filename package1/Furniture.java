package package1;

public class Furniture {
    class Chair {
        String type;
        int price;

        public Chair(String type, int price) {
            this.type = type;
            this.price = price;
        }
    }

    static class Table {
        String type;
        int price;

        public Table(String type, int price) {
            this.type = type;
            this.price = price;
        }
    }


    public static void main(String[] args) {
//    Chair c1=new Chair("Italian",150);
//    Chair c2=new Chair("Indian",250);
        // above both lines will show error because a static context is being made to a non-static class.
        // since Chair class is dependent to Furniture class, so we can't make objects of inner class
        // so either make inner class static or make the objects of outer class.

        Table t1=new Table("Italian",150);
        Table t2 = new Table("Indian",230);
        System.out.println(t1.price);
        // we can do this
        // we can make objects of Table class because it is a static class.
    }
}
