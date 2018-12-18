package com.github.yishenggudou.blitzcrank.common;

import java.util.Map;

/**
 * @author timger
 */
public interface IRunnerType {


    public void initialize(Map<String, String> params, Map<String, String> settings);

    public String run();

    public String getStatus();

    public String getResult();

    public String getParams();

    public String getSetting();

}
