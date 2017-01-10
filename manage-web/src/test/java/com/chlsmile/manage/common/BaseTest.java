package com.chlsmile.manage.common;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Function:
 * User: chl_smile@163.com
 */
@ContextConfiguration(locations = {"classpath*:applicationContext-manage.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest extends AbstractJUnit4SpringContextTests{
}
