import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner new_in = new Scanner(System.in);

//        Student o = new Student();
//        o.firstname = "Mio";
//        o.lastname = "Aida";
//        o.id = 118;
//        System.out.println(o.firstname + " " + o.lastname + " id :"+o.id);
//        o.login();

        Student y = new Student("Yuta");
//        y.firstname = "Taiga";
        y.lastname = "Aida";

        System.out.println(y.firstname + " " + y.lastname + " id :"+y.id);
        y.login();

        Ta t = new Ta();
        System.out.print("Please enter your name : ");
        t.firstname = new_in.nextLine();
        System.out.print("The subject you know : ");
        t.subject = new_in.nextLine();
        System.out.printf("%s you help students with %s\n",t.firstname,t.subject);
        t.login();

        Gta gta = new Gta();
        gta.salary = 3000;
        gta.firstname = "Rhiad";
        System.out.println("-----------------------------------------------------");
        gta.login();


    }
}