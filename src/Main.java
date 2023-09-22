public class Main {
    public static void main(String[] args) {
        exemple1();
        exemple2();
    }

    private static void exemple2() {

        String ss = "WHo";

        Cat cat = new Cat("MUMU", 1);

        Printer<String> pr = new Printer<>();
//        pr.printPairOfSimilar(cat, ss);

        Printer<Cat> pr1 = new Printer<>();
//        pr1.printPairOfSimilar(cat, ss);
    }

    private static void exemple1() {
        String s = "Somebody";
        printSmth(s);

        Cat manya = new Cat("Manya", 12);

        printSmth(manya);

//        printPairOfSimilar(manya, s);

        System.out.println(s.getClass());






    }

    public static void printSmth(Object o){
        System.out.println("Something here");
        System.out.println(o.toString());
        System.out.println("wow");
    }

//    public static <T> void printPairOfSimilar(T o1, T o2){
//        System.out.println("Something here");
//        System.out.println(o1.toString() + "; " + o2.toString());
//        System.out.println("wow");
//
//    }

}

class Printer<T>{

    public void printPairOfSimilar(T o1, T o2){
        System.out.println("Something here onetype");
        System.out.println(o1.toString() + "; " + o2.toString());
        System.out.println("wow");
    }




}
