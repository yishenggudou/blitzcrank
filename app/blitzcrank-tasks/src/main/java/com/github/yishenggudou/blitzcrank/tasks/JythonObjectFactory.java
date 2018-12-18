package com.github.yishenggudou.blitzcrank.tasks;

import org.python.core.*;

/**
 * @author timger
 */
public class JythonObjectFactory {

    private final Class interfaceType;
    private final PyType klass;

    public JythonObjectFactory(PySystemState state, Class interfaceType, String moduleName, String className) {
        this.interfaceType = interfaceType;
        PyObject importer = state.getBuiltins().__getitem__(Py.newString("__import__"));
        PyObject module = importer.__call__(Py.newString(moduleName));
        // System.out.println(module);
        this.klass = (PyType) module.__getattr__(className);
        // System.err.println("module=" + module + ",class=" + klass);
    }

    public JythonObjectFactory(Class interfaceType, String moduleName, String className) {
        this(new PySystemState(), interfaceType, moduleName, className);
    }


    public Object createObject() {
        PyObject a = klass.__call__();
        Object resp = a.__tojava__(interfaceType);
        return resp;
    }


    public Object createObject(Object arg1) {
        return klass.__call__(Py.java2py(arg1)).__tojava__(interfaceType);
    }

    public Object createObject(Object arg1, Object arg2) {
        return klass.__call__(Py.java2py(arg1), Py.java2py(arg2)).__tojava__(interfaceType);
    }

    public Object createObject(Object arg1, Object arg2, Object arg3) {
        return klass.__call__(Py.java2py(arg1), Py.java2py(arg2),
                Py.java2py(arg3)).__tojava__(interfaceType);
    }

    public Object createObject(Object args[], String keywords[]) {
        PyObject convertedArgs[] = new PyObject[args.length];
        for (int i = 0; i < args.length; i++) {
            convertedArgs[i] = Py.java2py(args[i]);
        }
        return klass.__call__(convertedArgs, keywords).__tojava__(interfaceType);
    }

    public Object createObject(Object... args) {
        return createObject(args, Py.NoKeywords);
    }
}
