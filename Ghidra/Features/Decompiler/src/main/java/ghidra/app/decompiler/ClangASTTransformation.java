package ghidra.app.decompiler;

public abstract class ClangASTTransformation {
    abstract DecompileResults transform(DecompileResults input);

}
