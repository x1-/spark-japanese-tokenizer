organization  := "com.inkenkun.x1"

name := "spark-japanese-tokenizer"

version := "1.0"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "ATILIKA dependencies" at "http://www.atilika.org/nexus/content/repositories/atilika"
)

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8", "-target:jvm-1.7")
