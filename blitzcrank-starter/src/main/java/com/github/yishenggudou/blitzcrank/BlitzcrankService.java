package com.github.yishenggudou.blitzcrank;

import java.util.ArrayList;
import java.util.List;

/**
 * @author timger
 */
public class BlitzcrankService {

    /**
     * @param param
     * @param <P>
     * @return
     */
    public <P> String getParamsString(P param) {
        return "{}";
    }

    /**
     * @param taskId
     * @param param
     * @param <E>
     * @return
     */
    public <E> String runAndGetTaskResultString(String taskId, E param) {
        return "";
    }

    /**
     * @param taskId
     * @param param
     * @param <R>
     * @param <P>
     * @return
     */
    public <R, P> R runAndGetTaskReturnObject(String taskId, P param) {
        return (R) new Object();
    }

    /***
     *
     * @param taskId
     * @param param
     * @param <R>
     * @param <P>
     * @return
     */
    public <R, P> List<R> runAndGetTaskReturnList(String taskId, P param) {
        return new ArrayList<>();
    }


}
