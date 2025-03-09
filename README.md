# Java Class-File API Hello World

[JEP 484 Class-File API](https://openjdk.org/jeps/484) (previously [JEP 457](https://openjdk.org/jeps/484) and [JEP 466](https://openjdk.org/jeps/484)) is an API introduced in Java 24 to provide a standard API for parsing, 
generating, and transforming Java class files.

The example here shows how easy it is to use to create a 
new class that prints "Hello World".

https://github.com/mrjameshamilton/jep457-hello-world/blob/ea854cda0e058d728630af907f9ed715d9a081ca/Main.java#L14-L19

# Building

You'll need JDK 24 and easiest way to install this on Linux is with [SDK man](https://sdkman.io/):

```shell
sdk install java 24.ea.36-open
```

If you have Java 24, you can execute the `Main.java` file which will produce a new class file `HelloWorld.class`:

```shell
$ java Main.java
```

You can then execute the `HelloWorld` class file:

```shell
$ java HelloWorld
Hello World
```

# Similar projects

There are many similar projects for parsing,
generating, and transforming Java class files, including:

* [ASM](https://asm.ow2.io/)
* [ProGuardCORE](https://github.com/Guardsquare/proguard-core)
* [ByteBuddy](https://bytebuddy.net/#/)
