package com.github.yishenggudou.blitzcrank.core;

import org.python.core.Py;
import org.python.core.PySystemState;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * @author timger
 */
public class BlitzcrankEngine {


    private static final BlitzcrankEngine instance = new BlitzcrankEngine();

    private Set<String> paths = new HashSet<>();

    private BlitzcrankEngine() {
    }

    public static BlitzcrankEngine getInstance() {
        return instance;
    }

    public void addPath(String path) {
        this.paths.add(path);
    }

    private PySystemState defaultPySystemState;

    public PySystemState getPySystemState() {
        if (this.defaultPySystemState != null) {
            return this.defaultPySystemState;
        } else {
            Properties sysProps = System.getProperties();
            Properties properties = new Properties();
            properties.put("python.console.encoding", "UTF-8");
            properties.setProperty("python.options.showJavaExceptions", "true");
            properties.put("python.security.respectJavaAccessibility", "false");
            properties.put("python.import.site", "false");
            PySystemState.initialize(sysProps, properties);
            PySystemState pySystemState = Py.getSystemState();
            pySystemState.path.add("target/classes/Lib");
            pySystemState.path.add("target/jython-plugins-tmp/Lib");
            pySystemState.path.add("classes/Lib");
            String jlib = System.getProperty("jlib");
            if (jlib != null) {
                pySystemState.path.add(jlib);
            }
            System.out.println(pySystemState.path);
            try {
                String current = new java.io.File(".").getCanonicalPath();
                System.out.println(current);
            } catch (Throwable throwable) {

            }
            this.defaultPySystemState = pySystemState;
            return pySystemState;
        }
    }


    public IRunnerType get(String moduleName, String className) {
        PySystemState pySystemState = getPySystemState();
        for (String path : this.paths) {
            if (pySystemState.path.indexOf(path) < 0) {
                pySystemState.path.add(path);
            }
        }
        JythonObjectFactory factory = new JythonObjectFactory(
                pySystemState,
                IRunnerType.class,
                moduleName,
                className);
        IRunnerType runner = (IRunnerType) factory.createObject();
        return runner;
    }


}
