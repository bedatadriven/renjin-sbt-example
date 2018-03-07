

// IMPORTANT: Build URL must use *https* and _not_ *http*
// sbt fails to handle the redirects correctly.
resolvers +=
    "BeDataDriven" at "https://nexus.bedatadriven.com/content/groups/public"

// Workaround for buggy http handler in SBT 1.x  
// https://github.com/sbt/sbt/issues/3570
//updateOptions := updateOptions.value.withGigahorse(false)

lazy val root = (project in file(".")).
  settings(
    name := "renjin-test",
    version := "1.0",
    scalaVersion := "2.11.1",
    libraryDependencies += "org.renjin" % "renjin-script-engine" % "0.9.2605",
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"  
       
  )

