name := """scala-for-impatient"""

version := "1.0"

scalaVersion := "2.11.2"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.6" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "2.4.13" % "test")

  // with Scala 2.9.3 (specs2 1.12.4.1 is the latest version for scala 2.9.3)
  // "org.specs2" %% "specs2" % "1.12.4.1" % "test",

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test


scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional jars and dependencies:
// http://etorreborre.github.io/specs2/guide/org.specs2.guide.Runners.html#Dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)


