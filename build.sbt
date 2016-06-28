name := "recaptcha-example"

version := "2.0"    

libraryDependencies ++= Seq(
  "com.nappin" %% "play-recaptcha" % "2.0" 
)

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Enable this if using a snapshot release of play-recaptcha
//resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
