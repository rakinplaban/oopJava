public class Gta extends Ta{
    public int passing_year;
    private int age = 23;
    @Override
    public void login() {
        super.login();
        System.out.println("Hi GTA! you are "+age+" years old");
    }
}
