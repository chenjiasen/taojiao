package com.hx.ognl.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class OgnlTestAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String userName;

    private String password;

    public String execute() throws Exception {
        ValueStack vs = ActionContext.getContext().getValueStack();
        return SUCCESS;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
