package com.example.prasanth.sqllite_learning;


public class Model {

    private String firstName,lastName,nickName;
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setNickName(String nickName)
    {
        this.nickName=nickName;
    }

    public String getNickName()
    {
        return nickName;
    }
}
