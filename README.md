# JEP457 Hello World

[JEP 457 Class-File API](https://openjdk.org/jeps/457) is a preview API to provide a standard API for parsing, 
generating, and transforming Java class files.

The example here shows how easy it is to use to create a 
new class that prints "Hello World".

https://github.com/mrjameshamilton/jep457-hello-world/blob/887349f0daed09a6bdf98c4f5ecb67e2b39782c2/Main.java#L12-L17

# Building

You'll need JDK 22 which is currently available as an early access version.
The easiest way to install this is with [SDK man](https://sdkman.io/):

```shell
sdk install java 22.ea.17-open
```

If you have Java 22, you can then execute the `run.sh` script which will
compile and execute `Main.java`. `Main` will create a Java class `HelloWorld.class`
which will then be executed.

```shell
$ ./run.sh
```

# Similar projects

There are many similar projects for parsing,
generating, and transforming Java class files, including:

* [ASM](https://asm.ow2.io/)
* [ProGuardCORE](https://github.com/Guardsquare/proguard-core)
* [ByteBuddy](https://bytebuddy.net/#/)
