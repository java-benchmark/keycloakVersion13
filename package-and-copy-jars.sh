#!/bin/bash -e

mvn -Pdistribution -pl distribution/server-dist -am -Dmaven.test.skip=true -Dmaven.javadoc.skip=true clean package
mkdir precompiled-for-test
cp `find . -name *.jar` precompiled-for-test/
rm precompiled-for-test/*-sources.jar
