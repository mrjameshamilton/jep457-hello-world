import jdk.internal.classfile.*;
import java.io.IOException;
import java.nio.file.Path;
import java.lang.constant.ClassDesc;

import static java.lang.constant.ClassDesc.*;
import static java.lang.constant.MethodTypeDesc.ofDescriptor;
import static jdk.internal.classfile.Classfile.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Classfile.of().buildTo(Path.of("HelloWorld.class"), ClassDesc.of("HelloWorld"), classBuilder -> classBuilder
          .withVersion(JAVA_6_VERSION, 0)
          .withMethod("main", ofDescriptor("([Ljava/lang/String;)V"), ACC_PUBLIC | ACC_STATIC, methodBuilder -> methodBuilder.withCode(codeBuilder -> codeBuilder
            .getstatic(of("java.lang.System"), "out", of("java.io.PrintStream"))
            .ldc("Hello World")
            .invokevirtual(of("java.io.PrintStream"), "println", ofDescriptor("(Ljava/lang/Object;)V"))
            .return_())));
    }
}
