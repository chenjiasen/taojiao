package com.hx.ognl.test;

import org.junit.Test;

import junit.framework.Assert;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest {

    /**
     * 测试用例. <br/>
     * 
     * @version 1.0
     * @throws OgnlException
     *
     */
    @Test
    public void testCommon() throws OgnlException {
        // OGNL核心对象 OgnlContext
        // 1. 创建 OGNL 上下文对象
        OgnlContext ognlContext = new OgnlContext();
        ognlContext.put("userName", "高普");

        // 2. 构造OGNL表达式，非根对象的OGNL表达式，需要加#才能访问到
        Object ognlExp = Ognl.parseExpression("#userName");

        // 3.获取表达式的值
        String userName = String.valueOf(Ognl.getValue(ognlExp, ognlContext, ognlContext.getRoot()));

        // 4.校验结果
        Assert.assertEquals("高普", userName);
    }

    @Test
    public void testRoot() throws OgnlException {
        // OGNL核心对象 OgnlContext
        // 1. 创建 OGNL 上下文对象
        OgnlContext ognlContext = new OgnlContext();
        User user = new User();
        user.setUserName("Pony Ma");
        user.setUserAge(50);
        ognlContext.setRoot(user);

        // 2. 构造OGNL表达式，根对象的OGNL表达式，不需要加#
        Object ognlExp = Ognl.parseExpression("userName");

        // 3.获取表达式的值
        String userName = String.valueOf(Ognl.getValue(ognlExp, ognlContext, ognlContext.getRoot()));

        // 4.校验结果
        Assert.assertEquals("Pony Ma", userName);

        ognlExp = Ognl.parseExpression("userAge");
        int userAge = Integer.valueOf(String.valueOf(Ognl.getValue(ognlExp, ognlContext, ognlContext.getRoot())));
        Assert.assertTrue(user.getUserAge() == userAge);
    }

    private class User {

        private String userName;

        private int userAge;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getUserAge() {
            return userAge;
        }

        public void setUserAge(int userAge) {
            this.userAge = userAge;
        }
    }
}
