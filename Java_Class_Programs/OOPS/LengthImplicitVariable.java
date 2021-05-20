class LengthImplicitVariable{

    public static void main(String [] args){

        int a[] ={10,20,30};

        System.out.println("No. of elements of a = "+ a.length);

        String s[] = {"abc","pqr","Java", "C Lang."};

        System.out.println("No. of Names of s = "+s.length);

        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}