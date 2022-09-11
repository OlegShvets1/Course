package Lesson_5;

/*    11. What is the difference between package-private access and protected access?

package-private (often just called package) means that other members of the same package have access to the item.
package-private is the default access modifier and does not have a keyword, because package is used to specify the
 package for a class or interface.

 Default Access Modifier - No Keyword
Default access modifier means we do not explicitly declare an access modifier for a class, field, method, etc.

A variable or method declared without any access control modifier is available to any other class in the same package.
The fields in an interface are implicitly public static final and the methods in an interface are by default public.


Protected Access Modifier - Protected
Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the
subclasses in other package or any class within the package of the protected members' class.

The protected access modifier cannot be applied to class and interfaces. Methods, fields can be declared protected,
however methods and fields in a interface cannot be declared protected.

Protected access gives the subclass a chance to use the helper method or variable, while preventing a nonrelated
class from trying to use it.
 */


public class Task_11 {
}