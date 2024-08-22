public class Rectangle implements Shape{
    @Override
    public void draw() {
        for(int y=0; y<4; y++){ //width
            for(int x=0; x<6; x++){ //length
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
