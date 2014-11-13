package exercises.chapter9

/**
 * Created by michal on 11/13/14.
 */

object MainE5 extends App {
  for (i <- 0 to 20; x = math.pow(2.0, i); y = math.pow(2.0, -i)) println(f"$x%8.0f    $y%f")
}
