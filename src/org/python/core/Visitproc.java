package org.python.core;

public interface Visitproc {

    /**
     * Must not be called with {@code object == null}.
     */
    int visit(PyObject object, Object arg);
}
