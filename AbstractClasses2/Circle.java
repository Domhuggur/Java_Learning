
class Circle extends Figure {
    public float radio = 2;
    
    public void area(){
        System.out.println("The area is: " + (3.1415f * (this.radio * this.radio)));
        
    }

    public Circle(int sidesNumber){
        super(sidesNumber);
    }
} 



