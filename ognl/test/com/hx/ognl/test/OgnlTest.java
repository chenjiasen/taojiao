package com.hx.ognl.test;

import org.junit.Test;

import junit.framework.Assert;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest {

    /**
     * ��������. <br/>
     * 
     * @version 1.0
     * @throws OgnlException
     *
     */
    @Test
    public void testCommon() throws OgnlException {
        // OGNL���Ķ��� OgnlContext
        // 1. ���� OGNL �����Ķ���
        OgnlContext ognlContext = new OgnlContext();
        ognlContext.put("userName", "����");

        // 2. ����OGNL���ʽ���Ǹ������OGNL���ʽ����Ҫ��#���ܷ��ʵ�
        Object ognlExp = Ognl.parseExpression("#userName");

        // 3.��ȡ���ʽ��ֵ
        String userName = String.valueOf(Ognl.getValue(ognlExp, ognlContext, ognlContext.getRoot()));

        // 4.У����
        Assert.assertEquals("����", userName);
    }

    @Test
    public void testRoot() throws OgnlException {
        // OGNL���Ķ��� OgnlContext
        // 1. ���� OGNL �����Ķ���
        OgnlContext ognlContext = new OgnlContext();
        User user = new User();
        user.setUserName("Pony Ma");
        user.setUserAge(50);
        ognlContext.setRoot(user);

        // 2. ����OGNL���ʽ���������OGNL���ʽ������Ҫ��#
        Object ognlExp = Ognl.parseExpression("userName");

        // 3.��ȡ���ʽ��ֵ
        String userName = String.valueOf(Ognl.getValue(ognlExp, ognlContext, ognlContext.getRoot()));

        // 4.У����
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
