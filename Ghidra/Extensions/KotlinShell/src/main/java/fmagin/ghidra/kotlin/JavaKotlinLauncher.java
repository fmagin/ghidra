package fmagin.ghidra.kotlin;
import ghidra.GhidraApplicationLayout;
import ghidra.GhidraLaunchable;

import ghidra.framework.Application;
import ghidra.framework.ApplicationConfiguration;
import org.jetbrains.kotlin.jupyter.IkotlinKt;


public class JavaKotlinLauncher implements GhidraLaunchable {
    @Override
    public void launch(GhidraApplicationLayout layout, String[] args) throws Exception {
        if (args.length != 1) {
            IkotlinKt.printClassPath();
            System.out.println(ClassLoader.getSystemClassLoader().toString());
            ApplicationConfiguration configuration = new ApplicationConfiguration();
            Application.initializeApplication(layout, configuration);
            var classPathArg = String.format("-classpath=%s", System.getProperty("java.class.path"));
            IkotlinKt.main("/home/fmagin/.local/share/jupyter/runtime/kernel-641b8904-e16a-483b-be0b-58b6c73b8412.json", classPathArg);

            System.exit(0);
        }
        else {
            System.out.println(args[0]);
        }
    }


    private static void usage() {
        System.out.println("usage: JavaKotlinLauncher <message>");
    }
}
