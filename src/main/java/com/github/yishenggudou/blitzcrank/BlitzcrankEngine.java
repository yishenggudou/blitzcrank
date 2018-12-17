package com.github.yishenggudou.blitzcrank;

import org.python.core.Py;
import org.python.core.PySystemState;

import java.util.Properties;

/**
 * @author timger
 */
public class BlitzcrankEngine {


    public IRunner get(String moduleName, String className) {
        PySystemState pySystemState = Py.getSystemState();
        pySystemState.path.add("target/classes/Lib");
        pySystemState.path.add("classes/Lib");
        System.out.println(pySystemState.path);
        Properties sysProps = System.getProperties();
        Properties properties = new Properties();
        properties.put("python.console.encoding", "UTF-8");
        properties.setProperty("python.options.showJavaExceptions", "true");
        properties.put("python.security.respectJavaAccessibility", "false");
        properties.put("python.import.site", "false");
        PySystemState.initialize(sysProps, properties);
        JythonObjectFactory factory = new JythonObjectFactory(pySystemState,
                IRunner.class, moduleName, className);
        IRunner runner = (IRunner) factory.createObject();
        return runner;
    }


}
