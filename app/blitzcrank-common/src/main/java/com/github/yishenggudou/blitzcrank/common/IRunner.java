package com.github.yishenggudou.blitzcrank.common;

import java.util.Map;

/**
 * @author timger
 */
public interface IRunner {


    void initialize(Map<String, String> params, Map<String, String> settings);


    String run();

    /**
     * @return
     */
    String getStatus();

    String getResult();


}
