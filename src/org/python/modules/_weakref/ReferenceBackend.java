package org.python.modules._weakref;

import org.python.core.PyObject;
import org.python.core.PyList;

public interface ReferenceBackend {
    PyObject get();
    void add(AbstractReference ref);
    boolean isCleared();
    AbstractReference find(Class<?> cls);
    int pythonHashCode();
    PyList refs();
    void restore(PyObject formerReferent);
    int count();
}
