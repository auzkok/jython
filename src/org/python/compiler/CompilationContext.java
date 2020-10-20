
package org.python.compiler;

import org.python.antlr.PythonTree;

public interface CompilationContext {

    Future getFutures();
    void error(String msg, boolean err, PythonTree node)
        throws Exception;

    String getFilename();


    ScopeInfo getScopeInfo(PythonTree node);
}
