public class Square implements Shape {
    @Override
    public void draw(){

        for(int x=0; x<5; x++){//width
            for(int y=0;y<5;y++){  //length
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
