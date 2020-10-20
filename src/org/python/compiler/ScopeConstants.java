package org.python.compiler;

public interface ScopeConstants {

    int BOUND = 1;
    int NGLOBAL = 2; // func scope expl global
    int PARAM = 4;
    int FROM_PARAM = 8;
    int CELL = 16;
    int FREE = 32;
    int CLASS_GLOBAL = 64; // class scope expl global
    int GLOBAL = NGLOBAL|CLASS_GLOBAL; // all global

    int TOPSCOPE = 0;
    int FUNCSCOPE = 1;
    int CLASSSCOPE = 2;

}
