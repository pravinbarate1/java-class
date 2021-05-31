class SwapWithoutThirdVar{
    public static void main(String [] args){

        int x = 10;
        int y = 20;

        System.out.println("Before swapping x = "+x+" y = "+ y);

        x = x + y; // x = 30
        y = x - y; // 30-20 y = 10
        x = x - y; // 30- 10 x = 20

        System.out.println("After swapping x = "+x+" y = "+ y);
    }
}