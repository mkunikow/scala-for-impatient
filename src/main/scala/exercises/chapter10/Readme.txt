3. Look at the BitSet class, and make a diagram of all its superclasses and traits.
Ignore the type parameters (everything inside the [...] ). Then give the
linearization of the traits.

Lin(BitSet)
= BitSet >> lin(Serializable) >> lin(BitSetLike) >> lin(collection.BitSet) >> lin(SortedSet[Int]) >> lin(AbstractSet[Int])
= BitSet  >> (Serializable >> java.io.Serializable) >>
             (BitSetLike  >> SortedSetLike >> SortedSet) >>
             (collection.BitSet >> BitSetLike >> SortedSet) >>
             (SortedSet >> SortedSetLike >> collection.SortedSet >> Set) >>
             (AbstractSet >> Set >> AbstractIterable)
=            (Serializable >> java.io.Serializable) >>
             (collection.BitSet >> BitSetLike) >>
             (SortedSet >> SortedSetLike >> collection.SortedSet) >>
             (AbstractSet >> Set >> AbstractIterable)
=            Serializable >> java.io.Serializable >> collection.BitSet >> BitSetLike >> SortedSet >> SortedSetLike >>
             collection.SortedSet >> AbstractSet >> Set >> AbstractIterable

6. In the Java AWT library, we have a class Container , a subclass of Component that
collects multiple components. For example, a Button is a Component , but a Panel
is a Container . That’s the composite pattern at work. Swing has JComponent and
JButton , but if you look closely, you will notice something strange. JComponent
extends Container , even though it makes no sense to add other components to,
say, a JButton . The Swing designers would have ideally preferred the design
in Figure 10–4.
But that’s not possible in Java. Explain why not. How could the design be
executed in Scala with traits?

The JContainer can't extend two classes in Java (JComponent and Container).
In scala the Container could be trait -> JContainer extends JComponent with Container



