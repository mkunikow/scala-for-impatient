package exercises.Chapter7

/**
 * Created by michal on 11/10/14.
 */

//1.

//Breaks not chained package

//Error:(21, 43) object mutable is not a member of package exercises.Chapter7.com.horstmann.collection
//val subordinates = new collection.mutable.ArrayBuffer[String]
//^

//package com {
//  package horstmann {
//    package collection {
//
//    }
//  }
//}

package com {
  package horstmann {
    package impatient {
      class Manager {
        val subordinates = new collection.mutable.ArrayBuffer[String]
      }
    }
  }
}

package com.horstmann.impatient {
  class Manager2 {
    val subordinates = new collection.mutable.ArrayBuffer[String]
  }
}



object main extends App {


}
