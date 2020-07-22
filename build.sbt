name := "SendEmail"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.spark.mail" %% "Email" % "0.0.1" from "file:///C:/Users/Scala_Spark_Mail.jar",
  "org.apache.spark" %% "spark-core" % "2.4.3",
  "org.apache.spark" %% "spark-sql" % "2.4.3"
)
