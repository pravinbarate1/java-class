class MultiplicationTable{
    int n;

    void assign(int x){
        n = x;
    }

    void table(){
        for(int i = 1;i<=10; i++){
            System.out.println(n + "*" + i + " = "+ n*i);
        }
    }
}

class MulExecution{
    public static void main(String [] args){
        if(args.length != 1){
            System.out.println("Please enter one value..");
        }else{

            int x = Integer.parseInt(args[0]);

            if(x <= 0){
                System.out.println(x + "is invalid");
            }else{
                MultiplicationTable multiplicationTable = new MultiplicationTable();

                multiplicationTable.assign(x);
                multiplicationTable.table();
            }
        }
    }
}