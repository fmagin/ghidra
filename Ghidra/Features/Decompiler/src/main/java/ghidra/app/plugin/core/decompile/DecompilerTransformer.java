package ghidra.app.plugin.core.decompile;

import ghidra.app.decompiler.DecompileResults;
import ghidra.app.plugin.core.decompile.actions.AbstractDecompilerAction;

public interface DecompilerTransformer {

    DecompileResults transform(DecompileResults results);

    AbstractDecompilerAction getGraphDisplayAction();
}
