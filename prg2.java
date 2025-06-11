public class Main {
    public static void main(String[] args) {
        int age=23;
        String gen="Female";
        
        if(age>=23 && gen=="female")
        {
        System.out.println("eligible for women");
       }
    else if(age>=25 && gen=="male")
    {
        System.out.println("eligible for men");
    }
    else{
        System.out.println("not eligible");
    }
}
}