## P2 By:
Gustavo Segovia, Sam Bevans-Kerr
## Running the provided code
To run any of the tests and it will run them all.
```
Java Proj2
```
Make sure your path in the Proj2.java main function points towards the tests. 
It automatically runs all of them, so no need to add a number or .pas!

## Situations/Assumptions

The new things implemented

While loops:

 We parsed out the begin and end blocks into a compound statement that can be rerun whenver needed to and saved the condition which is checked once a loop.
```
while a<5 do
  begin
  a := a + 1;
  writeln(a);
  end
```

For loops:

Same idea with saving the block and storing for later, for the number of times We simply stored the start value,the end value and used a java for loop to run the compound block.
```
for a := 10 to 20 do
   begin
      writeln(122);
   end
```

Functions:

They can be declared and define and it runs the code in them correctly, I also implemented the bonus for parameter passing where we can do things like ```ret := max(a, b);```
```
function max(num1, num2: real): real;
var
   (* local variable declaration *)
   result: real;

begin
   if (num1 > num2) then
      result := num1;

   else
      result := num2;
   max := result;
end.
```

Scoping:

We implemented scoping in a lot functions, the general idea was that there were 

```
begin
   if (num1 > num2) then
      result := num1;

   else
      result := num2;
   max := result;
end.

begin
   a := 100;
   b := 200;
   (* calling a function to get max value *)
   ret := max(a, b);

   writeln(ret);
   writeln(num1);
end.
```
This prints num1 rather than the value of num1 since num1 is not a variable in the localscope, so if we search the map of variables it returns false.
