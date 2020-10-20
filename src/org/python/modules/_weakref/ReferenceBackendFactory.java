package org.python.modules._weakref;

import org.python.core.PyObject;

/**
 * Reserved for use by JyNI.
 */
public interface ReferenceBackendFactory {

    ReferenceBackend makeBackend(GlobalRef caller, PyObject referent);
    void notifyClear(ReferenceBackend ref, GlobalRef caller);
    void updateBackend(ReferenceBackend ref, GlobalRef caller);
}
