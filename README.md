

# Renjin with SBT

This is a super-simple example of setting up a Scala project using 
the SBT build tool.

It also serves as integration test for Renjin.


| SBT Version  | Build Status  |
|--------------|---------------|
| 0.13.x       | [![Build Status](http://build.renjin.org/job/Integration-Tests/job/renjin-sbt-example-0.13/badge/icon)](http://build.renjin.org/job/Integration-Tests/job/renjin-sbt-example-0.13/)  |
| 1.1.x        | [![Build Status](http://build.renjin.org/job/Integration-Tests/job/renjin-sbt-example-1.1/badge/icon)](http://build.renjin.org/job/Integration-Tests/job/renjin-sbt-example-1.1/)    |


## Using SBT 1.x

SBT 1.x uses a new HTTP library called Gigahorse that [does not handle chunked connections properly](https://github.com/sbt/sbt/issues/3570#issuecomment-345089755),
at least not from our Nexus server at nexus.bedatadriven.com.

You can work around this by passing the `-Dsbt.gigahorse=false` command line argument, or adding the following to your build.sbt file:

    updateOptions := updateOptions.value.withGigahorse(false)



