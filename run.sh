#!/bin/bash

JAVA_MAJOR_VERSION=$(java -version 2>&1 | sed -E -n 's/.* version "([^.-]*).*"/\1/p' | cut -d' ' -f1)

if [[ "$JAVA_MAJOR_VERSION" -lt 22 ]]; then
  echo "Java version 22 required"
  exit 1
fi

javac --release 22 --enable-preview Main.java
java -cp . --enable-preview Main
java HelloWorld
