package com.manny;

public class Main {

    public static void main(String[] args) {
	    int count =1;
	    while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }
        // Three types of loops: for, while, do while
        // In the case of the while loop, there's no variable that's set up
        // within the while loop like there is within the for loop.
        // So, we need to create our loop if we're going to do a counting mechanism
        // before we start the while statement
        // Then, we also need to increment our variable manually (count++) withing the loop itself
        System.out.println("*************");

	    count = 1;
	    while(true){
	       if(count == 6){
	           break;
           }
           System.out.println("Count value is " + count);
	       count++;
        }
        // In the case of while(true), this is what is called an infinite loop
        // The loop will continue processing forever
        // The way to get out of the loop is to do some type of test to check whether a given
        // expression is true to then break out of the loop (break;)

        // The do while loop will always execute at least once, if not more times
        // depending on the way we define our test expressions
        count = 1;
        do{
            System.out.println("Count value is " + count);
            count++;

            if(count >100){
                break;
            }
        }while(count !=6);

        //Challenge!
        //
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine the argument passed to the method is an even number or not
        // return true if an even number, otherwise, return false

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber){
//            if(!isEvenNumber(number)){
//                number++;
//                continue;
//            }
//            System.out.println("Even number " + number);
//            number++;
//        }
        //Challenge!
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // At the end, display the total number of even numbers found
        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total number of even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        if((number % 2) ==0){
            return true;
        }else{
            return false;
        }
    }
}
