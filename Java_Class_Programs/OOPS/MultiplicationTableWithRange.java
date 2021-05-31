class MultiplicationTableWithRange{
    int n1;
    int n2;

    void assign(int x, int y){
        n1 = x;
        n2 = y;
    }

    void table(){
        for(int i = 1; i<=10; i++ ){
            for(int j = 1;j<=10; j++){
                System.out.println(n1*j+" ");
            }
        }
        
    }
}

class MulTableExecution{
    public static void main(String [] args){

        System.out.println("args length = "+ args.length);
        if(args.length == 0){   // 1 != 1  false 1 = 1 !true false
            System.out.println("Please enter one values");
        }else{

            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if(x <= 0 || y <= 0){   //2 <= 0  false
                System.out.println(x + "is invalid");
            }else{
                MultiplicationTable multiplicationTable = new MultiplicationTable();

                multiplicationTable.assign(x);
                multiplicationTable.table();
            }
        }
    }
}