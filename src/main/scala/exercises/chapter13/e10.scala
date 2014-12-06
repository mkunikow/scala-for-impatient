package exercises.chapter13

/**
 * Created by michal on 12/6/14.
 */
object e10 extends App {
    val str = "test"
    val frequencies = new scala.collection.mutable.HashMap[Char, Int]

    //Parallel mutable collection
    //bad idea using mutable collection in par method with mutating collection -> not thread safe
    for (c <- str.par) frequencies(c) = frequencies.getOrElse(c, 0) + 1
    println(frequencies)


    //Parallel immutable collection, aggregate method
    val pr = str.par.aggregate(Map[Char, Int]())((m, c) => m + (c -> (m.getOrElse(c, 0) + 1)),
        (lmap, rmap) => lmap ++ rmap.map{ case (k,v) => k -> (v + lmap.getOrElse(k,0))}
    )
    println(pr)

    //No Parallel, immutable collection, fold left
    val r = (Map[Char, Int]() /: str) { (m, c) => m + (c -> (m.getOrElse(c, 0) + 1))}
    println(r)



}
