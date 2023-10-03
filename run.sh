#!/bin/bash

JAVA_MAJOR_VERSION=$(java -version 2>&1 | sed -E -n 's/.* version "([^.-]*).*"/\1/p' | cut -d' ' -f1)

if [[ "$JAVA_MAJOR_VERSION" -lt 22 ]]; then
  echo "Java version 22 required"
  exit 1
fi

EXPORTS="--add-exports java.base/jdk.internal.classfile=ALL-UNNAMED \
         --add-exports java.base/jdk.internal.classfile.attribute=ALL-UNNAMED \
         --add-exports java.base/jdk.internal.classfile.constantpool=ALL-UNNAMED \
         --add-exports java.base/jdk.internal.classfile.instruction=ALL-UNNAMED \
         --add-exports java.base/jdk.internal.classfile.components=ALL-UNNAMED"

javac $EXPORTS Main.java
java $EXPORTS -cp . --enable-preview Main
java HelloWorld
