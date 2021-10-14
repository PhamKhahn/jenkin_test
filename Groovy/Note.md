## 1.Import statement
- keyword `import`
- import chức năng từ các library khác 
```
import groovy.util.* 

import java.math.BigInteger 
```
## 2.Identifiers
- keyword `def`
- Identifiers sử dụng để define các variable,function hay các variable do người dùng define

## Keyword

```
as	    assert	break	    case
catch	class	const	    continue
def	    default	do	        else
enum	extends	false	    Finally
for	    goto	if	        implements
import	in	    instanceof	interface
new	    pull	package	    return
super	switch	this	    throw
throws	trait	true	    try
while	
```
## 3. Datatype

```
class Example { 
   static void main(String[] args) { 
      //Example of a int datatype 
      int x = 5; 
		
      //Example of a long datatype 
      long y = 100L; 
		
      //Example of a floating point datatype 
      float a = 10.56f; 
		
      //Example of a double datatype 
      double b = 10.5e40; 
		
      //Example of a BigInteger datatype 
      BigInteger bi = 30g; 
		
      //Example of a BigDecimal datatype 
      BigDecimal bd = 3.5g; 
		
      println(x); 
      println(y); 
      println(a); 
      println(b); 
      println(bi); 
      println(bd); 

          // Defining a variable in lowercase  
      int x = 5;
	  
      // Defining a variable in uppercase  
      int X = 6; 
	  
      // Defining a variable with the underscore in it's name 
      def _Name = "Joe"; 
		
      println(x); 
      println(X); 
      println(_Name);

      println("The value of x is " + x + "The value of X is " + X);
   } 
}
```

## 4.Operators
Operator thường
- `+ - * / % ++ --` 

Operator quan hệ
- `== != < <= > >=`

Operator Logic
- `&& || !`

Operator Bit
- `& | ^ ~`

Operator Assignment
- `+= -= *= /= %=`

Operator range (`..`)
- def range = 0..5

## 5.Loop
- 3 loại : `While for for-in`
```
While : xét 1 điều kiện trước (1 giá trị Boolean) nều là true thì thực thi loop

for và for-in : để lặp qua 1 tập các giá trị
```
- Loop control statements: `break và continue`

```
      int count = 0;
		
      while(count<5) {
         println(count);
         count++;
      }


      for(int i = 0;i<5;i++) {
         println(i);
      }      


    int[] array = [0,1,2,3]; 	
    for(int i in array) { 
        println(i); 
    }

      for(int i in 1..5) {
         println(i);
      }


// Dạng Map

      def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];
		
      for(emp in employee) {
         println(emp);
      }
```


## 6. Điều kiện

```
if 
if/else 
Nested if
Switch
Nested Switch
```

```
      int a = 12 
		
      //Check for the boolean condition 
      if (a>100) { 
         //If the condition is true print the following statement 
         println("The value is less than 100"); 
      } else { 

      if (a>5) { 
         //If the condition is true print the following statement 
         println("The value is greater than 5 and greater than 100"); 
      } else { 
         //If the condition is false print the following statement 
         println("The value of a is less than 5"); 
      } 
      }  



      switch(a) {            
         //There is case statement defined for 4 cases 
         // Each case statement section has a break condition to exit the loop 
			
         case 1: 
            println("The value of a is One"); 
            break; 
         case 2: 
            println("The value of a is Two"); 
            break; 
         case 3: 
            println("The value of a is Three"); 
            break; 
         case 4: 
            println("The value of a is Four"); 
            break; 
         default: 
            println("The value is unknown"); 
            break; 
      }





      int i = 0; 
      int j = 1; 
		
      // First evaluating the value of variable i 
      switch(i) { 
         case 0: 
            // Next evaluating the value of variable j 
            switch(j) { 
               case 0: 
                  println("i is 0, j is 0"); 
                  break; 
               case 1: 
                  println("i is 0, j is 1"); 
                  break; 
               
               // The default condition for the inner switch statement 
               default: 
               println("nested default case!!"); 
            } 
         break; 
			
         // The default condition for the outer switch statement 
         default: 
            println("No matching case found!!"); 
      }
```
