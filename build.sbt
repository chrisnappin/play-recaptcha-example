name := "recaptcha-example"

version := "1.0"    

libraryDependencies ++= Seq(
  "com.nappin.play" %% "recaptcha" % "0.1-SNAPSHOT" 
)

scalaVersion := "2.10.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
