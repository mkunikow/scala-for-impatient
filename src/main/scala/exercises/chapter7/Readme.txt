4. Why do you think the Scala language designers provided the package object
syntax instead of simply letting you add functions and variables to a package?

A package can contain classes, objects, and traits, but not the definitions of
functions or variables. That’s an unfortunate limitation of the Java virtual machine.
It would make more sense to add utility functions or constants to a package than
to some Utils object. Package objects address this limitation.

5. What is the meaning of private[com] def giveRaise(rate: Double) ? Is it useful?

This makes method giveRaise visible only package "com" scope.

8. What is the effect of
import java._
import javax._
Is this a good idea?

Imports all from java packages import java._, javax._. This is not good idea due it can overwrite some scala classes.


10. Apart from StringBuilder , what other members of java.lang does the scala
package override?
String, Double