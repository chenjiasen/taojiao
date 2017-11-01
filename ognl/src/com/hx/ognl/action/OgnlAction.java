package com.hx.ognl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hx.ognl.bean.Cat;
import com.hx.ognl.bean.Dog;
import com.hx.ognl.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class OgnlAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Cat cat;

    private Map<String, Dog> dogMap = new HashMap<String, Dog>();

    private Set<Dog> dogs = new HashSet<Dog>();

    private String username;

    private String password;

    private User user;

    private List<User> users = new ArrayList<User>();

    public OgnlAction() {
        username = "ÕÅÈý";
        password = "123";

        Dog dog = new Dog("Oudi");
        cat = new Cat();
        cat.setFriend(dog);

        user = new User(100);

        users.add(new User(1));
        users.add(new User(2));
        users.add(new User(3));
        users.add(new User(4));

        dogs.add(new Dog("dog1"));
        dogs.add(new Dog("dog2"));
        dogs.add(new Dog("dog3"));

        dogMap.put("dog100", new Dog("dog100"));
        dogMap.put("dog101", new Dog("dog101"));
        dogMap.put("dog102", new Dog("dog102"));
    }

    public String execute() {
        ValueStack vs = ActionContext.getContext().getValueStack();
        ActionContext.getContext().getContextMap().put("str", "String");
        System.out.println(vs);
        return SUCCESS;
    }

    public String m() {
        return "hello";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Map<String, Dog> getDogMap() {
        return dogMap;
    }

    public void setDogMap(Map<String, Dog> dogMap) {
        this.dogMap = dogMap;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
