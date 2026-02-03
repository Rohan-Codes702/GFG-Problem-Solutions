import java.util.*;

class GFG {

    public static void main(String[] args) {
        // code here
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
         if(num%5==0 && num%3==0){
            System.out.println("FizzBuzz");
        }
        else if(num%3==0){
            System.out.println("Fizz");
        }
        else if(num%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);

        }
    }
}
