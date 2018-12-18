package com.github.yishenggudou.blitzcrank.tasks;

import com.github.yishenggudou.blitzcrank.common.IRunnerType;
import org.python.core.Py;
import org.python.core.PySystemState;

import java.util.Properties;

/**
 * @author timger
 */
public class BlitzcrankEngine {


    public IRunnerType get(String moduleName, String className) {

        Properties sysProps = System.getProperties();
        Properties properties = new Properties();
        properties.put("python.console.encoding", "UTF-8");
        properties.setProperty("python.options.showJavaExceptions", "true");
        properties.put("python.security.respectJavaAccessibility", "false");
        properties.put("python.import.site", "false");
        PySystemState.initialize(sysProps, properties);
        PySystemState pySystemState = Py.getSystemState();
        System.out.println(pySystemState.modules);
        System.out.println(pySystemState.getBuiltins());
        pySystemState.path.add("target/classes/Lib");
        pySystemState.path.add("classes/Lib");
        System.out.println(pySystemState.path);
        JythonObjectFactory factory = new JythonObjectFactory(
                pySystemState,
                IRunnerType.class,
                moduleName,
                className);
        IRunnerType runner = (IRunnerType) factory.createObject();
        return runner;
    }


}
