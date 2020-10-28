package ghidra.app.plugin.core.decompile;

import ghidra.app.decompiler.DecompileResults;

public interface DecompilerTransformer {

    DecompileResults transform(DecompileResults results);
}
