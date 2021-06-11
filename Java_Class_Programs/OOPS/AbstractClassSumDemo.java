abstract class Operation{
    abstract public void sum ();
}


class IntSum extends Operation{
    int val1, val2, sum;

    public void sum(){
        val1 = 10;
        val2 = 20;

        sum = val1 + val2;

        System.out.println("Sum of Int = "+sum);
    }
}

class FloatSum extends Operation{
    float val1, val2, sum;

    public void sum(){
        val1 = 10.50f;
        val2 = 20.30f;

        sum = val1 + val2;

        System.out.println("Sum of Float = "+sum);
    }
}
class AbstractClassSumDemo{
    public static void main(String [] args){
       // Operation operation1 = new Operation(); // invalid since operation is abstract class

        Operation operation;   // declaration

        operation = new IntSum();
        operation.sum();

        operation = new FloatSum();
        operation.sum();
    }
}