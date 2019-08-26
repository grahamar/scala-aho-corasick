import Versions._

name := "scala-aho-corasick"
organization := "io.grhodes"
version := appVersion

scalaVersion := "2.12.2"

licenses += ("Apache-2.0", url("http://opensource.org/licenses/apache-2.0"))

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.17",
  "org.scalacheck" %% "scalacheck" % "1.13.5" % Test
)
