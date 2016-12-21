

resolvers +=
    "BeDataDriven" at "http://nexus.bedatadriven.com/content/groups/public"

lazy val root = (project in file(".")).
  settings(
    name := "renjin-test",
    version := "1.0",
    scalaVersion := "2.11.1",
    libraryDependencies += "org.renjin" % "renjin-script-engine" % "0.8.2300",
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"  
  )

