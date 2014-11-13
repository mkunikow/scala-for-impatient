10. The file scala/collection/immutable/Stack.scala contains the definition
class Stack[A] protected (protected val elems: List[A])
Explain the meanings of the protected keywords. (Hint: Review the discussion
of private constructors in Chapter 5.)

The protected near constructor indicates that this class constructor is only visible to class that extend this class.
The protected next to field definition indicates that field is visible only to class that extends this class.