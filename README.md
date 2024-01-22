
2.REVERSE THE NUMBER:

Input Number (num): The code initializes a variable num with the value 234457. You can modify this value to test the program with different input numbers.
Reversed Number (ans): Another variable ans is initialized to 0. This variable will be used to store the reversed number.
While Loop: The code uses a while loop to reverse the digits of the input number (num). The loop continues until the input number becomes 0.
Extracting the Last Digit (rem): Inside the loop, the code calculates the remainder (rem) when dividing num by 10. This gives the last digit of the number.
Removing the Last Digit (num /= 10): The last digit is removed from the input number by dividing it by 10.
Building the Reversed Number (ans = ans * 10 + rem): The reversed number (ans) is constructed by multiplying the current value of ans by 10 and then adding the extracted digit (rem). This process is repeated in each iteration of the loop.
Print Reversed Number (System.out.print(ans)): Finally, the reversed number is printed
