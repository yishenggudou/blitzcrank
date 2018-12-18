#!/usr/bin/env python
# -*- coding: utf-8 -*-
# yishenggudou@gmail.com
# @timger http://weibo.com/zhanghaibo
from com.github.yishenggudou.blitzcrank.common import IRunnerType


class BaskRunner(IRunnerType, object):
    """

    """

    def initialize(self, params, settings):
        pass

    def run(self):
        print "test run obj"
        return ""

    def getStatus(self):
        return ""

    def getResult(self):
        return ""


if __name__ == '__main__':
    pass
