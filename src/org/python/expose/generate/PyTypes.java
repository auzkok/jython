package org.python.expose.generate;

import org.objectweb.asm.Type;
import org.python.core.Py;
import org.python.core.PyBoolean;
import org.python.core.PyBuiltinCallable;
import org.python.core.PyBuiltinMethod;
import org.python.core.PyBuiltinMethodNarrow;
import org.python.core.PyDataDescr;
import org.python.core.PyException;
import org.python.core.PyFloat;
import org.python.core.PyInteger;
import org.python.core.PyLong;
import org.python.core.PyNewWrapper;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.core.ThreadState;
import org.python.expose.ExposeAsSuperclass;
import org.python.expose.ExposedClassMethod;
import org.python.expose.ExposedDelete;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import org.python.expose.TypeBuilder;

/**
 * Type objects used by exposed generation.
 */
public interface PyTypes {

    // Core Jython types
    Type PYOBJ = Type.getType(PyObject.class);

    Type APYOBJ = Type.getType(PyObject[].class);

    Type PYTYPE = Type.getType(PyType.class);

    Type ASSUPER = Type.getType(ExposeAsSuperclass.class);

    Type PYEXCEPTION = Type.getType(PyException.class);

    Type PY = Type.getType(Py.class);

    Type PYSTR = Type.getType(PyString.class);

    Type PYBOOLEAN = Type.getType(PyBoolean.class);

    Type PYINTEGER = Type.getType(PyInteger.class);

    Type PYLONG = Type.getType(PyLong.class);

    Type PYFLOAT = Type.getType(PyFloat.class);

    Type PYNEWWRAPPER = Type.getType(PyNewWrapper.class);

    Type BUILTIN_METHOD = Type.getType(PyBuiltinMethod.class);

    Type ABUILTIN_METHOD = Type.getType(PyBuiltinMethod[].class);

    Type BUILTIN_METHOD_NARROW = Type.getType(PyBuiltinMethodNarrow.class);

    Type BUILTIN_FUNCTION = Type.getType(PyBuiltinCallable.class);

    Type ABUILTIN_FUNCTION = Type.getType(PyBuiltinCallable[].class);

    Type DATA_DESCR = Type.getType(PyDataDescr.class);

    Type ADATA_DESCR = Type.getType(PyDataDescr[].class);

    Type BUILTIN_INFO = Type.getType(PyBuiltinCallable.Info.class);

    Type THREAD_STATE = Type.getType(ThreadState.class);

    // Exposer Jython types
    Type EXPOSED_TYPE = Type.getType(ExposedType.class);

    Type EXPOSED_METHOD = Type.getType(ExposedMethod.class);

    Type EXPOSED_CLASS_METHOD = Type.getType(ExposedClassMethod.class);

    Type EXPOSED_NEW = Type.getType(ExposedNew.class);

    Type EXPOSED_GET = Type.getType(ExposedGet.class);

    Type EXPOSED_SET = Type.getType(ExposedSet.class);

    Type EXPOSED_DELETE = Type.getType(ExposedDelete.class);

    Type TYPEBUILDER = Type.getType(TypeBuilder.class);

    // Java types
    Type OBJECT = Type.getType(Object.class);

    Type STRING = Type.getType(String.class);

    Type ASTRING = Type.getType(String[].class);

    Type STRING_BUILDER = Type.getType(StringBuilder.class);

    Type CLASS = Type.getType(Class.class);

    // Primitives
    Type BYTE = Type.BYTE_TYPE;

    Type SHORT = Type.SHORT_TYPE;

    Type CHAR = Type.CHAR_TYPE;

    Type INT = Type.INT_TYPE;

    Type VOID = Type.VOID_TYPE;

    Type BOOLEAN = Type.BOOLEAN_TYPE;
}
