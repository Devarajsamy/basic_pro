public class palin1 {
      static void palindrome(int num){
            int newNum = 0, reminder, temp;
            temp = num;
            //find sum of all digit's of the number.
            while(temp != 0){
                  reminder = temp % 10;
                  newNum = newNum*10 + reminder;
                  temp = temp/10;
            }
            //Check if sum of all digit's of the number
            //is equal to the given number or not.
            if(newNum == num){
                  System.out.println(num +" is palindrome.");
            }else{
                  System.out.println(num +" is not palindrome.");
            }
      }    
 
      public static void main(String args[]){
            //method call
            palindrome(12321);
      }
}