public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType==null){
            return null;
        }
    shapeType=shapeType.toUpperCase();

    if(shapeType.equals("SQUARE")){
        return new Square();

    } else if (shapeType.equals("CIRCLE")) {
        return new Circle(10); // example radius

    } else if (shapeType.equals("RECTANGLE")) {
        return  new Rectangle();

    }else{
        return null;
    }
    }


}