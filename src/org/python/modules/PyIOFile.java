

package org.python.modules;

/**
PyIOFiles encapsulates and optimise access to the different file
representation. Used by cPickle and marshall.
 */

public interface PyIOFile {

    void write(String str);
    // Usefull optimization since most data written are chars.

    void write(char str);

    void flush();

    String read(int len);
    // Usefull optimization since all readlines removes the
    // trainling newline.

    String readlineNoNl();
}