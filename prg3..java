public class Main {
    public static void main(String[] args) {
        int age=19;
        String gen="male";
        
        if(age<18||gen=="female")
        {
            System.out.println("Ticket is free");
        }
        else{
           int km=2;
           switch(km){
        case 5:{
            System.out.println("Rupees is 50");
            
        }
        case 60:{
            System.out.println("Rupees is 120");
        }
        default:{
            System.out.println("Not Applicable");
        }
    }
        }
    }
 }
 