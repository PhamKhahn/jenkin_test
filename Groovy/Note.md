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

## 7. Method
- được khai báo với 1 return type hoặc keyword `def`
- có thể nhận 1 số lượng các arguments. Không cần xác định rõ type của argument
- Có thể thêm các modifify như `public, private , protected`. Mặc định là `public`

```
def methodName() { 
   //Method code 
}
```
```
class Example {
   static def DisplayName() {
      println("This is how methods work in groovy");
      println("This is an example of a simple method");
   } 
	
   static void main(String[] args) {
      DisplayName();
   } 
}
```
```
class Example {
   static void sum(int a,int b) {
      int c = a+b;
      println(c);
   }  
	
   static void main(String[] args) {
      sum(10,5);
   } 
}
```
- Có thể đặt giá trị mặc định cho argum
```
def someMethod(parameter1, parameter2 = 0, parameter3 = 0) { 
   // Method code goes here 
} 
```
- Method có thể trả về giá trị (return value)
```
class Example {
   static int sum(int a,int b = 5) {
      int c = a+b;
      return c;
   } 
	
   static void main(String[] args) {
      println(sum(6));
   } 
}
```
- **Instance method** : các method thường được viết trong 1 class. sau đó khi cần sử dụng -> khai báo các object của class -> từ các object cụ thể gọi đến các method để làm các hoạt động tương ứng
```
class Example { 
   int x; 
	
   public int getX() { 
      return x; 
   } 
	
   public void setX(int pX) { 
      x = pX; 
   } 
	
   static void main(String[] args) { 
      Example ex = new Example(); 
      ex.setX(100); 
      println(ex.getX()); 
   } 
}
```
- **Local and External Parameter Names** 
```
class Example { 
   static int x = 100; 
	
   public static int getX() { 
      int lx = 200; 
      println(lx); 
      return x; 
   } 
	
   static void main(String[] args) { 
      println(getX()); 
   }  
}
```

- sử dụng `this` method
```
class Example { 
   int x = 100; 
	
   public int getX() { 
      this.x = 200; 
      return x; 
   } 
	
   static void main(String[] args) {
      Example ex = new Example(); 
      println(ex.getX());
   }
}
```

## 8. Optionals
- sử dụng keyword `def`: ta không cần thiết phải define type của biến. giúp dev nhanh nhưng cần chú ý việc đặt tên biến -> không gây khó khăn sau này

```
class Example { 
   static void main(String[] args) { 
      // Example of an Integer using def 
      def aint = 100; 
      println(aint); 
		
      // Example of an float using def 
      def bfloat = 100.10; 
      println(bfloat); 
		
      // Example of an Double using def 
      def cDouble = 100.101; 
      println(cDouble);
		
      // Example of an String using def 
      def dString = "HelloWorld"; 
      println(dString); 
   } 
}
```

## 9.Number
- 2 loại: interget,float
- có nhiều method hỗ trợ làm việc vs số
```
class Example { 
   float x = 100; 
	
   public int getX() { 
      x = 200.855; 
      return x; 
   } 
	
static void main(String[] args) {
      Example ex = new Example(); 
      println(Math.floor(ex.getX()))
}
}

```
https://www.tutorialspoint.com/groovy/groovy_numbers.htm

## 10.Strings
- String = Đặt văn bản vào trong dấu  `' '` hoặc `"" ""` hoặc `""" """`
- Trong `""" """` có thể phần thành nhiều dòng

```
class Example { 
    float x = 100; 
    def msMap = """
      Phamquockhanh:
        new new
      Do thi Van:
        bla lba
      """
	
   public int getX() { 
      x = 200.855; 
      return x; 
   } 
	
}

static void main(String[] args) {
      Example ex = new Example(); 
      println(Math.floor(ex.getX()))

      println(ex.msMap)
}
```
- String Index : bắt đầu từ 0
```
class Example { 
   static void main(String[] args) { 
      String sample = "Hello world"; 
      println(sample[4]); // Print the 5 character in the string
		
      //Print the 1st character in the string starting from the back 
      println(sample[-1]); 
      println(sample[1..2]);//Prints a string starting from Index 1 to 2 
      println(sample[4..2]);//Prints a string starting from Index 4 back to 2 
      
   } 
}
```
- String có các operation cơ bản
   - nối chuỗi +
   - lặp chuỗi *
   - check độ dài chuỗi: vd: sample.length()
- String cũng có các Method phụ trợ: https://www.tutorialspoint.com/groovy/groovy_strings.htm

## 11. Ranges
- cách viết tắt để biểu thị cho 1 chuỗi giá trị
```
1..10 - An example of an inclusive Range
1..<10 - An example of an exclusive Range
‘a’..’x’ – Ranges can also consist of characters
10..1 – Ranges can also be in descending order
‘x’..’a’ – Ranges can also consist of characters and be in descending order.
```
- 1 số method available cho range : https://www.tutorialspoint.com/groovy/groovy_ranges.htm

## 12. List
- lưu và đánh chỉ mục 1 loạt các đối tượng, phân tách bởi dấu phẩy
```
[11, 12, 13, 14] – A list of integer values
[‘Angular’, ‘Groovy’, ‘Java’] – A list of Strings
[1, 2, [3, 4], 5] – A nested list
[‘Groovy’, 21, 2.11] – A heterogeneous list of object references
[ ] – An empty list
```
- 1 số các list method available trong Groovy: https://www.tutorialspoint.com/groovy/groovy_lists.htm

## 13.Maps
- hiểu như là 1 liên kết giữa array,dictionary,table và hash -> 1 tập hợp tham chiếu đối tượng chứ không có thứ tự
- Dạng key:value
```
[‘TopicName’ : ‘Lists’, ‘TopicName’ : ‘Maps’] – Collections of key value pairs which has TopicName as the key and their respective values.

[ : ] – An Empty map.
```
- 1 số các map method trong Groovy: https://www.tutorialspoint.com/groovy/groovy_maps.htm

## 14. Regular Expressions
- Là 1 pattern để tìm substring trong text
- Sử dụng `~` : thay cho việc gọi java.util.regex.Pattern.compile(string) method

VD: def regex = ~'Groovy'

   - `=~` sẽ trả về Boolean trong if/while statement

https://www.tutorialspoint.com/groovy/groovy_regular_expressions.htm
https://www.baeldung.com/groovy-pattern-matching

```
text = 'Some 42 number #12 more'
def ma = (text =~ /\d+/)
println ma              // java.util.regex.Matcher[pattern=\d+ region=0,23 lastmatch=]
println ma[0]           // 42
 
def mb = (text =~ /#\d+/)
println mb              // java.util.regex.Matcher[pattern=#\d+ region=0,23 lastmatch=]
println mb[0]           //  #12
 
def mc = (text =~ /#(\d+)/)
println mc[0]          // [#12, 12]
println mc[0][0]       // #12
println mc[0][1]       // 12


text = '/abc/def/da/de/abc_def_ge.txt'
def m = (text =~ /[^\/]*$/)
println m[0]     // abc_def_ge.txt
```

## 15. Exception handing
- xử lý các lỗi phát sinh khi run để không khiến dừng app
   - finally block sẽ chạy bất kể có exception hay không
```
class Example {
   static void main(String[] args) {
      try {
         def arr = new int[3];
         arr[5] = 5;
      } catch(ArrayIndexOutOfBoundsException ex) {
         println("Catching the Array out of Bounds exception");
         println(ex)
      }catch(Exception ex) {
         println("Catching the exception");
      } finally {
         println("The final block");
      }
		
      println("Let's move on after the exception");
   } 
} 
```

- 1 số exception method available trong Groovy: https://www.tutorialspoint.com/groovy/groovy_exception_handling.htm



```
class Example {
   static void main(String[] args) {
      try {
         def arr = new int[3];
         arr[5] = 5;
      }catch(ArrayIndexOutOfBoundsException ex) {
         println(ex.toString());
         println(ex.getMessage());
         println(ex.getStackTrace());  
      } catch(Exception ex) {
         println("Catching the exception");
      }finally {
         println("The final block");
      }
		
      println("Let's move on after the exception");
   } 
}
```

## 16. Hướng đối tượng
- Class và object -> thể hiện bản chất hướng đối tượng
   - Class : tập các dữ liệu và method hoạt động trên các dữ liệu đó -> đại diện cho 1 số đối tượng -> để giải quyết các vấn đề liên quan đến đối tượng đó

```
class Student {
   int StudentID;
   String StudentName;
	
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.StudentName = "Joe"     
   } 
}
```
=> Class Student đại diện cho Sinh viên -> gồm các thông tin như ID và Tên

- Phương thức getter và setter : các dữ liệu/ biến cần private. -> sử dụng các phương thức getter và setter để set và lấy giá trị của các biến 

```
class Student {
   private int StudentID;
   private String StudentName;
	
   void setStudentID(int pID) {
      StudentID = pID;
   }
	
   void setStudentName(String pName) {
      StudentName = pName;
   }
	
   int getStudentID() {
      return this.StudentID;
   }
	
   String getStudentName() {
      return this.StudentName;
   }
	
   static void main(String[] args) {
      Student st = new Student();
      st.setStudentID(1);
      st.setStudentName("Joe");
		
      println(st.getStudentID());
      println(st.getStudentName());
   } 
}
```