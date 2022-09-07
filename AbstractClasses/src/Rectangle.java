public class Rectangle extends GeometricFigure {
    public Rectangle (String figureType){
        super(figureType);
    }
    @Override
    public void draw(){
        System.out.println("This prints a " + this.getClass().getSimpleName());
    }

}
