package org.python.modules.jffi;

public interface JITMethodGenerator {

    boolean isSupported(JITSignature signature);

    void generate(AsmClassBuilder builder, String functionName, JITSignature signature);
}
