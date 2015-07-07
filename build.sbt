organization  := "com.inkenkun.x1"

name := "spark-japanese-tokenizer"

version := "1.0"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "ATILIKA dependencies" at "http://www.atilika.org/nexus/content/repositories/atilika",
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "org.atilika.kuromoji" % "kuromoji" % "0.7.7" % "compile"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-junit" % "3.3.1" % "test"
)

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8", "-target:jvm-1.7")
