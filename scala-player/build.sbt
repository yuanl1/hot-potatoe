name := """hot-potato"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "com.loopfor.zookeeper" %% "zookeeper-client" % "1.3"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

routesImport ++= Seq(
  "com.kli.hot.potato.v0.Bindables._"
)
