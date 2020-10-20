package org.python.core;

public interface Slotted {

    PyObject getSlot(int index);

    void setSlot(int index, PyObject value);
}
