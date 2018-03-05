#!/bin/sh

sed -i 's/"renjin-script-engine" % ".*"/"renjin-script-engine" % "NEW_VERSION"/' build.sbt
sed -i s/NEW_VERSION/$1/ build.sbt
