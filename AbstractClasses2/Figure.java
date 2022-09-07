
/*Due to we are going to declare an abstract method, we must to declare the class like abstract too*/
public abstract class Figure{
    /*An abstract class can be heredate by a lot of child classes but it can't be instantiate */
        private int sidesNumber;

        //This is a way to create a constructor
        public Figure(int sidesNumber){
            this.sidesNumber  = sidesNumber;
        }

        /* Due to the child classes are going to override the function, we must to declare it like abstract*/
        public abstract void area();
}
