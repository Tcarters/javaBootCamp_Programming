** Control Statements **

- It controls flow of program executions
- It controls "if a set of code/line will be executed or not."
- It is more like following conditions/instructions.


> If-else Statements:
 + The are used to test conditions.
 + It checks boolean conditions and respond to it.
 + The are various types:
    - If Statements
    - If-else Statements
    - If-else-if ladder
    - Nested if statements

-------------------------------------------------------------------------------------------
** Switch Statements **
- Expression and case type should be same
- Case value must be const or literals, i does not allow variables.
- Case values must be unique, else compie time error.
- Each statement can have break statement, but it is optional.
- Case value can have default ( optional) label.

> Switch statements:
  - Executes one statement out of many.
  - It is similar to if-else ladder.
  - It works with: byte, shorty, int, long , enum types, strings & someother wrapper types.



  ---------------------------------------------------------------------------------------------
 ** Loop **

- This is a control statement which iterates  a part of code multiple times.

There are mainly 3 types of loops statement:
    - For Loop
    - While Loop
    - Do-while Loop

> *** For Loop ***
    + for ( init; condition; incr/decr ) {
        // code to be executed
    }

We have different for loops also:
    - Simple FOR loops
    - Labelled FOR loops
    - For-Each loop

> *** For-Each Loop ***

    for ( Type var:array) {
        // code to be  executed
    }

    Example: 
        for ( int i:arr ) {
            System.out.println
        }
    

> *** While Loop ***
    - It is very similar to FOR loop
    - If numbers of iterations are not fixed, it is advised to use WHILE loop.
while ( condition ) {
    // code to be executed 
}    


> *** Do-while ***
    - It is very clear from name itself.
    - Very similar to while loop
    - If the number of iteration is not fixed and you must have to execute the loop minimum one time.

    Syntaxe:
        do {
            // code to be executed 
        } while ( condition ); //remeber this semicolon;

> *** Break Statement ***
 + If it is encountered inside a loop, then the loop statement is terminated.
 + Used to break loop / Switch statements.
 + It breaks only inner loops.

> *** Continue Statement ***

 - We use this, when we wnat to jump to next iteration in an loop.
 - It continues the flow, but only skips once when that condition is satisfied.
 - In case of inner loop, it continues the inner loop only.

