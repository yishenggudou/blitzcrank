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
        # print "test run obj"
        import urllib2
        req = urllib2.Request("http://mirrors.aliyun.com/pypi/")
        response = urllib2.urlopen(req)
        the_page = response.read()
        response.close()
        return ""

    def getStatus(self):
        return ""

    def getResult(self):
        return ""


if __name__ == '__main__':
    pass
