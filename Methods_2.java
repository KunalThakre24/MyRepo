public class Methods_2 {
    public static void main(String[] args) {
        String name = "kunal";
        System.out.print(name);
    }
    // the output will be kunal not pawan coz of ( call by value system)
    // naame is an instance of string name.
    public static void name(String naam) {
        naam = "pawan";
    }
}
