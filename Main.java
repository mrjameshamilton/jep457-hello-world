import java.lang.classfile.*;
import java.io.IOException;
import java.nio.file.Path;
import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;

import static java.lang.constant.ConstantDescs.CD_void;
import static java.lang.constant.ClassDesc.*;
import static java.lang.constant.MethodTypeDesc.ofDescriptor;
import static java.lang.classfile.ClassFile.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassFile.of().buildTo(Path.of("HelloWorld.class"), of("HelloWorld"), classBuilder -> classBuilder
          .withMethodBody("main", MethodTypeDesc.of(CD_void, of("java.lang.String").arrayType()), ACC_PUBLIC | ACC_STATIC, codeBuilder -> codeBuilder
            .getstatic(of("java.lang.System"), "out", of("java.io.PrintStream"))
            .ldc("Hello World")
            .invokevirtual(of("java.io.PrintStream"), "println", MethodTypeDesc.of(CD_void, of("java.lang.Object")))
            .return_()));
    }
}
