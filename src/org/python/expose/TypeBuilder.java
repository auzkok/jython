package org.python.expose;

import org.python.core.PyObject;
import org.python.core.PyType;

/**
 * Contains the basic information needed to construct a builtin Python type.
 */
public interface TypeBuilder {

    String getName();

    PyObject getDict(PyType type);

    Class<? extends PyObject> getTypeClass();

    Class<?> getBase();

    boolean getIsBaseType();

    String getDoc();
}
