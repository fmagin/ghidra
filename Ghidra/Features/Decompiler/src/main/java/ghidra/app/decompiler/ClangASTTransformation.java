package ghidra.app.decompiler;

import ghidra.util.classfinder.ExtensionPoint;

public abstract class ClangASTTransformation implements ExtensionPoint {
    public abstract DecompileResults transform(DecompileResults input);

}
