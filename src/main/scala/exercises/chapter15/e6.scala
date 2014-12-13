package exercises.chapter15

/**
 * Created by michal on 12/13/14.
 */
object e6 extends App {

  object Volatile {
    @volatile var flag: Boolean  = false;
  }

  object VolatileSetter extends Runnable {
    override def run(): Unit =  {
      Thread.sleep(4000);
      Volatile.flag = true;
      println("VolatileSetter: flag sets to true. Exiting ...")
    }
  }

  object VolatileChecker extends Runnable {
    override def run(): Unit =  {
      while(Volatile.flag == false) {
        println("VolatileChecker: flag is set to false. Going sleep ...")
        Thread.sleep(500);
      }
      println("VolatileChecker: flag is set to true. Exiting ...")
    }
  }

  val checkerThread = new Thread(VolatileChecker, "checker")
  val setterThread = new Thread(VolatileSetter, "setter")

  print("Starting checker thread... ")
  checkerThread.start(); println("READY")
  print("Starting setter thread... ")
  setterThread.start(); println("READY")

}
