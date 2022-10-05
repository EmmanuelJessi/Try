public class Student {
    private static String reg_number;
    private static String firstname;
    private static String lastname;
    private static String programme;

    public static void main(String[] args) {
        Student  Student1 = new Student();
        Student1.reg_number ="21/111/BIT-J";
        Student1.firstname ="Ema";
        Student1.lastname ="jessi";
        Student1.programme ="BSCS";

        System.out.println("The registration number is "+Student1.reg_number);
        System.out.println("The firstname is "+Student1.firstname);
        System.out.println("The lastname is "+Student1.lastname);
        System.out.println("The programme is "+Student1.programme);



        Student Student2 = new Student();
        Student2.reg_number = "21/112/BIT-J";
        Student2.firstname = "Sabi";
        Student2.lastname = "yafiet";
        Student2.programme = "BIT";


        System.out.println("The registration number is "+Student2.reg_number);
        System.out.println("The firstname is "+Student2.firstname);
        System.out.println("The lastname is "+Student2.lastname);
        System.out.println("The programme is "+Student2.programme);


        Student Student3 = new Student();
        Student3.reg_number = "21/132/HEC-M";
        Student3.firstname = "Elen";
        Student3.lastname = "yafiet";
        Student3.programme = "HEC";




        System.out.println("The registration number is "+Student3.reg_number);
        System.out.println("The firstname is "+Student3.firstname);
        System.out.println("The lastname is "+Student3.lastname);
        System.out.println("The programme is "+Student3.programme);


    }
}