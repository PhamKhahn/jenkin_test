#!/usr/bin/env groovy
/**
//COMMENT
println 'test'
*/

class Person {
    String name
    //Create greet method
    String greet(String otherPerson) {
        println "Hello ${otherPerson}"
    }
}

def NewOb = new Person()
NewOb.greet("Pham Quoc Khanh")
NewOb.name = "ABCXZY"
println NewOb. name

/* KEYWORD cua Groovy
as

assert

break

case

catch

class

const

continue

def

default

do

else

enum

extends

false

finally

for

goto

if

implements

import

in

instanceof

interface

new

null

package

return

super

switch

this

throw

throws

trait

true

try

var

while

*/

//### Định danh
// Normal identifiers
def name
def item3
def with_underscore
def $dollarStart

// keyword sau dấu chấm đều được định danh hợp lệ
/*
foo.as
foo.assert
foo.break
foo.case
foo.catch
*/

// Quoted identifiers
def map = [:]

map."an identifier with a space and double quotes" = "ALLOWED"
map.'with-dash-signs-and-single-quotes' = "ALLOWED"

assert map."an identifier with a space and double quotes" == "ALLOWED"
assert map.'with-dash-signs-and-single-quotes' == "ALLOWED"
map.'single quote'
map."double quote"
map.'''triple single quote'''
map."""triple double quote"""
map./slashy string/
map.$/dollar slashy string/$


def firstname = "Homer"
map."Simpson-${firstname}" = "Homer Simpson"

assert map.'Simpson-Homer' == "Homer Simpson"


///#### Strings
//



class Example1 { 
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
	  
      // Defining a variable in uppercase  
      int X = 6; 
	  
      // Defining a variable with the underscore in it's name 
      def _Name = "Joe"; 
		
      println(x); 
      println(X); 
      println(_Name); 
   } 
}

      def range = 5..10
      println(range) 
      println(range.get(2))

