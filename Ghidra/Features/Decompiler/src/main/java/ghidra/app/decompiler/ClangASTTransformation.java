package ghidra.app.decompiler;

import ghidra.util.classfinder.ExtensionPoint;

public interface ClangASTTransformation extends ExtensionPoint {
    DecompileResults transform(DecompileResults input);

}
