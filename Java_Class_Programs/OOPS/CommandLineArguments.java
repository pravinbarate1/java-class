class CommandLineArguments{

    public static void main(String [] args){
        System.out.println("No. of values = "+args.length);

        //String [] args = {"10","20","30"}; internal transformation of str arr understanding purpose only

        
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}