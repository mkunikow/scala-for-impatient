//1
def signum(number: Int): Int = if (number > 0) 1 else if (number < 0) -1 else 0
signum(2)
signum(0)
signum(-3)
//2 empty expression type = Unit
val expr = {}

//3
var y = 1
var x = y = 1

//4 for (int i = 10; i >= 0; i--) System.out.println(i);
for (i <- 10 to 0 by -1) println(i)
//5
def countdown(n: Int) = for (i <- n to 0 by -1) println(i)
countdown(5)
//6
def unicodeProdForString(s: String):Long = {var x:Long = 1; for (c <- s) x *= c; x}
unicodeProdForString("Hello")
//7 and 8
def product(s: String):Long = s.foldLeft(1L)(_*_.toInt)
product("Hello")
//9
def productRec(s: String):Long = {
  if (s.length == 0) return 1
  else s.head.toInt * productRec(s.tail)
}
productRec("Hello")

//10
def exp(x: Int, n: Int): Double = {
  if (n == 0) 1
  else if (n == 1) x
  else if (n > 0 && n % 2 == 0) exp(x, n/2) * exp(x, n/2)
  else if (n > 0) x * exp(x, n -1)
  else   1 / exp(x, -n)
}

exp(2,0)
exp(2,1)
exp(2,3)
exp(2,4)
exp(2,-1)


