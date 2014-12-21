7. Look through the methods of the Iterable[+A] trait. Which methods use
the type parameter A ? Why is it in a covariant position in these methods?

All A is in lower bound all in predicate? exampe reduce[A1 >: A](op: (A1, A1) ⇒ A1): A1