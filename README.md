# qwertyScript
a ridiculous scripting language where the only commands are letters of QWERTYUIOP.

everything excpeting these letters are commented, including all undercase letters of qwertyuiop.

variables work in an integer stack, you can push and pop and modify the elements.

Q: push a number 0 through 9 to the stack by putting a letter Q through P directly after
    example: QT - push 4 to stack
W: remove top element from stack
E: print the top element of the stack as a number
R: print the ascii value of the to element of the stack
T: add and remove the two top elements of the stack, leaving only the sum
Y: subtract the top element from the second top element, leaving only the difference
U: multiply the top two elements and leave the product
I: divide the second top element by the top element and leave the quotient
O: divide the top two elements and leave the remainder
P: duplicate the top element

To run a qwerty script, run the java file and put the script path in the argument.
To debug a script, put anything in the second argument.
