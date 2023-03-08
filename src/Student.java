public class Student {
    public String firstname = "Hiruko";
    public String lastname;
    public int id;

    Student(){

        id = 111;
    }

    Student(String firstname){
        this.firstname =  firstname;
        id = 111;
        lastname = "Yuki";
        System.out.println("The first name : "+firstname);
    }

    public void login(){
        System.out.println("You're logged in "+firstname);
    }
}
