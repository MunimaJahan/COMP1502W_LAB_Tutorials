# Task 1
## <c>1-1: is Divisible </c>

Write a function/method that determines if one integer is evenly divisible by another. The function should be called isDivisible and should take two integers and return true if the first is evenly divisible by the second and false otherwise.


Remember that any number is evenly divisible if the remainder of the division is 0.
Test isDivisible by calling it in your main, with the following pairs of values and printing out the result (using the provided System.out.println) :

<pre>
10, 1
10, 2
10, 10
1, 10
10, 3
</pre>

For example: the first test should return true.

Use the given starter code for your program:
<pre>
    class Main {
      public static void main(String[] args) {

        System.out.println("Hello Divisible!");

        System.out.println(/*isDivisible(10,1)*/);
        System.out.println(/*isDivisible(10,2)*/);
        System.out.println(/*isDivisible(10,10)*/);
        System.out.println(/*isDivisible(1,10)*/);
        System.out.println(/*isDivisible(10,3)*/);


      }

      // isDivisible goes here

    }
  
</pre>
# Task 2
## 1-2: Is Prime
Write a method that determines if prime. The function should be called isPrime and should take a single integer as an argument. It should return true if the number is prime and false if the number is not. Remember that any number is prime if the only numbers that it is divisible by are the numbers 1 and itself. So you should consider using your isDivisible method from Is Divisible and a loop to test all of the numbers less than the input to see if the number is prime or not. Assume that your input will always be 2 or greater. Test isPrime by calling it in your main, with the following values and printing out the result (using System.out.println) : 
<pre>
2
3
4
10
11
12
</pre>
(For example: the first call to isPrime should return true, so your program should print true.) 

Your main should look like the following:
<pre>
class Main {
  public static void main(String[] args) {
    System.out.println("Hello Prime!");
    
    System.out.println(/*isPrime(2)*/);
    System.out.println(/*isPrime(3)*/);
    System.out.println(/*isPrime(4)*/);
    System.out.println(/*isPrime(10)*/);
    System.out.println(/*isPrime(11)*/);
    System.out.println(/*isPrime(12)*/);
   }
  //isPrime goes here
  
}
</pre>
# Task 3
## 1-4: Star Piles
Write a method called drawStars which takes an integer and prints out a triangle of '*' characters that many lines high. 
For example, if you give the method 2, it should draw for you: 
<pre>
   *
  ***
 </pre>
And if you give the method 5, it should draw for you: 
<pre>
      *
     ***
    *****
   *******
  *********
 </pre>
Your function should print the stars so that they are always centred. Assume that the input will always be a positive integer less than 30. Test your program with calls to drawStars with the values 1, 2, 5 and 12. Print one blank line after each call. 

Use the following code as your starter:
<pre>
class Main {
  public static void main(String[] args) {
    System.out.println("Hello Stars!");
    
    //drawStars(1);
    System.out.println();
    //drawStars(2);
    System.out.println();
    //drawStars(5);
    System.out.println();
    //drawStars(12);
    System.out.println();
    
  }
  
  // drawStars goes here
}
<pre>    
    
 

