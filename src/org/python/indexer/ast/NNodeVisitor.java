/**
 * Copyright 2009, Google Inc.  All rights reserved.
 * Licensed to PSF under a Contributor Agreement.
 */
package org.python.indexer.ast;

/**
 * Preorder-traversal node visitor interface.
 */
public interface NNodeVisitor {
    /**
     * Convenience exception for subclasses.  The caller that initiates
     * the visit should catch this exception if the subclass is expected
     * to throw it.
     */
    final class StopIterationException extends RuntimeException {
        public StopIterationException() {}
    }

    boolean visit(NAlias m);
    boolean visit(NAssert m);
    boolean visit(NAssign m);
    boolean visit(NAttribute m);
    boolean visit(NAugAssign m);
    boolean visit(NBinOp m);
    boolean visit(NBlock m);
    boolean visit(NBoolOp m);
    boolean visit(NBreak m);
    boolean visit(NCall m);
    boolean visit(NClassDef m);
    boolean visit(NCompare m);
    boolean visit(NComprehension m);
    boolean visit(NContinue m);
    boolean visit(NDelete m);
    boolean visit(NDict m);
    boolean visit(NEllipsis m);
    boolean visit(NExceptHandler m);
    boolean visit(NExec m);
    boolean visit(NFor m);
    boolean visit(NFunctionDef m);
    boolean visit(NGeneratorExp m);
    boolean visit(NGlobal m);
    boolean visit(NIf m);
    boolean visit(NIfExp m);
    boolean visit(NImport m);
    boolean visit(NImportFrom m);
    boolean visit(NIndex m);
    boolean visit(NKeyword m);
    boolean visit(NLambda m);
    boolean visit(NList m);
    boolean visit(NListComp m);
    boolean visit(NModule m);
    boolean visit(NName m);
    boolean visit(NNum m);
    boolean visit(NPass m);
    boolean visit(NPlaceHolder m);
    boolean visit(NPrint m);
    boolean visit(NQname m);
    boolean visit(NRaise m);
    boolean visit(NRepr m);
    boolean visit(NReturn m);
    boolean visit(NExprStmt m);
    boolean visit(NSlice m);
    boolean visit(NStr m);
    boolean visit(NSubscript m);
    boolean visit(NTryExcept m);
    boolean visit(NTryFinally m);
    boolean visit(NTuple m);
    boolean visit(NUnaryOp m);
    boolean visit(NUrl m);
    boolean visit(NWhile m);
    boolean visit(NWith m);
    boolean visit(NYield m);
}
