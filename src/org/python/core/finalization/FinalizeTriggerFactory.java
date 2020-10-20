package org.python.core.finalization;

import org.python.core.PyObject;

/**
 * Reserved for use by JyNI.
 */
public interface FinalizeTriggerFactory {

    FinalizeTrigger makeTrigger(PyObject toFinalize);
}
