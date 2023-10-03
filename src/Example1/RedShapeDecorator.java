package Example1;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setBorder(decoratedShape);
    }

    public void setBorder(Shape shape){
        System.out.println("A message from RedShapeDecorator. Border color: Red");
    }
}
