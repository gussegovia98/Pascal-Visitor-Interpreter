program exFunction;
var
   a, b, ret : real;

(*function definition *)
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

begin
   a := 100;
   b := 200;
   (* calling a function to get max value *)
   ret := max(a, b);

   writeln(ret);
   writeln(num1);
end.