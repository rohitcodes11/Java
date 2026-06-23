           // BitwiseOperator >>-- &(and)= rule          
 // 1 & 1 = 1
// 1& 0 = 0
// 0 & /1 = 0
// 0 & 0 = 0

//  |(or) =rule
// 1 | 1 = 1
// 1 | 0 = 1
// 0 | 1 = 1
// 0 | 0 = 0

//  ^(xor)=rule
// 1 ^ 1 = 0
// 1 ^ 0 = 1
// 0 ^ 1 = 1
// 0 ^ 0 = 0
    

public class BitwiseOperator{
    public static void main(String[]args){
        System.out.println(5&6);
         System.out.println(5|6);
          System.out.println(5^6);
           System.out.println(5<<6); //Jab bit left shift hoti hai to number 2 se multiply hota hai. (<<1 = × 2),
            System.out.println(5>>6); // jab bit right shift hota hai to number value 2 ki power se divide ho jati hai."
             System.out.println(~6);
    }

}



