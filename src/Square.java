public class Square extends Shape{
    public float length;
    private float square_area;
    @Override
    public float area(){
        square_area = length*length;
        return square_area;
    }
}
