package com.example.customlistviewadapterexam;


public class contact {
    private String name;
    private String phone;
    private String nickname;

    //Constructor

    public contact(int id,String name, String phone, String nickname) {
        this.name = name;
        this.phone = phone;
        this.nickname = nickname;
    }

    //Setter, getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


}
