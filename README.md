1.Fibonacci Series:

In this program, we delve into the workings of the Fibonacci series, employing Java and utilizing loops as a fundamental construct.
To facilitate user input, we incorporate the Scanner package. This package allows us to seamlessly obtain input from the user, enriching the interactivity of our program.
The essence of the program lies in a basic mathematical formula derived from the principles of modular arithmetic. Specifically, the remainder when a number is divided by 10 corresponds to the last digit of the number. For instance, 1234345 mod 10 equals 5. Leveraging this formula, we can discern Fibonacci numbers within the given input.
Upon acquiring the sequence of numbers from the user, we store the input in an 'inp' object. Initializing the count variable to 0, we embark on a while loop that iterates as long as 'n' (the input) is greater than 0. This loop ensures that the program processes each digit in the sequence.
Within the loop, the aforementioned mathematical formula is applied. We focus on the presence of the digit '3' in the sequence, and if encountered, the count is incremented by 1 (count++). This incremental count effectively tracks the occurrences of the digit '3' in the sequence.
Subsequently, we divide the number by 10, thereby eliminating the last digit after each iteration. This process continues until all the digits in the sequence have been processed.
The program concludes by printing the count as the output, encapsulating the number of occurrences of the digit '3' in the provided sequence, and we printing the count as output.

2.REVERSE THE NUMBER:

Input Number (num): The code initializes a variable num with the value 234457. You can modify this value to test the program with different input numbers.
Reversed Number (ans): Another variable ans is initialized to 0. This variable will be used to store the reversed number.
While Loop: The code uses a while loop to reverse the digits of the input number (num). The loop continues until the input number becomes 0.
Extracting the Last Digit (rem): Inside the loop, the code calculates the remainder (rem) when dividing num by 10. This gives the last digit of the number.
Removing the Last Digit (num /= 10): The last digit is removed from the input number by dividing it by 10.
Building the Reversed Number (ans = ans * 10 + rem): The reversed number (ans) is constructed by multiplying the current value of ans by 10 and then adding the extracted digit (rem). This process is repeated in each iteration of the loop.
Print Reversed Number (System.out.print(ans)): Finally, the reversed number is printed
