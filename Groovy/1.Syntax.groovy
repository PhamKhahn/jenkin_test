#!/usr/bin/env groovy
/**
//COMMENT
println 'test'
*/

class Person {
    String name
    //Create greet method
    String greet(String otherPerson) {
        "Hello ${otherPerson}"
    }
}

def NewOb = new Person()
println NewOb.greet("Pham Quoc Khanh")

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
foo.as
foo.assert
foo.break
foo.case
foo.catch


// Quoted identifiers (DD dấu chấm)
