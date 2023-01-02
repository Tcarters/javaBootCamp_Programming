 * Exception Handling *
 - Mechanism to handle the runtime errors so that normal flow of the application can be maintained.


 ***  What  is Exception ? ***
  - Exception is an abnormal condition .
  - In Java, an exception is an event that disrupts the normal flow of the program.
  - It is an object which is thrown at runtime.

> Types of Exceptions ?
 -> Checked
 -> Un-checked 
 -> Error 

> Checked Exceptions ?
 - The classes which directly inherit Throwable class except RuntimeException and Error are known as `Checked exceptions`.
  e.g IOException, SQLException, etc... Checked exceptions are checked at compile-time.

> Unchecked Exceptions ?
 - The classes which inherit RuntimeException are known as unchecked exception .
  e.g: ArithmeticException, NullPointerExeption, ArrayIndexOutOfBoundsException etc..
  Unchecked exceptions arre not checked at compile-time, but they are checked at runtime.

> Error 
 - Irrecoverable actions.


> Try
 -> The "try" keyword is used to specify a block where we should place exception code.
 -> The try block must be followed by either catch or finally. It means, we can't use try block alone.
 -> If an execption occurs at the particular statement of try block, the rest of the block code will not execute. 
    So, it is recommended not to keeping the code in try block that will not throw an execption.


> Catch
 -> The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone.
  It can be followed by finally block later.
 -> The catch Block must be used after the try block only. You can use multiple catch block with a single try block.
 -> Java catch block is used to handle the Exception by declaring the type of exception within the parameter.
    The declared execption must be the parent class exeption (i.e, Exception) o the generated type of execption.


> finally
 -> The "finally" block is used to execute the important code of the program.
  It is executed whether an execption is handled or not.

> Throw 
  -> The "Throw" keyword is used to throw an exception.

> Throws
 -> The "throws" keyword is used to declare exceptions. It doesn't throw an exception.
  + It specifies that there may occur an exception in the method.
  + It is always used with method signature.
  + The "Java throws keyword " is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exeption handling code so that normal flow can be maintained.
  e.g  void method() throws IOException {
    System.out.println(" device operation performed");
  }

> Multi-catch
 - A try block can be followed by one one or more catch blocks.
 - Each catch block must contain a different execption handler.
 - So, if you have to perform different tasks at the occurence of different exceptions, use java multi-catch block.


*** Points to Remember *** 
 + At a time only one exception occurs and ata time only one catch block is executed.
 + All catch blocks must be ordered from most specific before catch for Exception.


> Finally Block 
  - Java finally block is a block that is used to execute important code such as closing connection, stream etc ..
  - java finally block is always executed whether exception is handled or not.
  - Java finally block follows try or  catch block .


> ** Propagration **

An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method, if not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack. This is called  `exception propagation ` .