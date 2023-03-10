public class Circle extends Shape{
    public float radius;
    private float circle_area;
    @Override
    public float area(){
        circle_area = pi*radius*radius;
        return circle_area;
    }
}
