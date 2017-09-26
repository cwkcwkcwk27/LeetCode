//0412
//170523

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
	       
        LinkedList<String> list = new LinkedList<String>();
        
        for(int i = 1;i<=n;i++){
            //String temp = "";
            if(i % 3 == 0){
                if(i % 5 == 0){
                    list.add("FizzBuzz");
                }
                else{
                    list.add("Fizz");
                }
            }
            else if(i % 5 == 0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
            
        }
        return list ;
    }
}

//main of this
/*
import java.util.Scanner;

public class main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         FizzBuzz temp = new FizzBuzz();
         System.out.println(temp.fizzBuzz(n));
         scanner.close();
     }
}
*/

