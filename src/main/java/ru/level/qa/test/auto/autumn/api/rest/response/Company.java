package ru.level.qa.test.auto.autumn.api.rest.response;

import java.util.List;

public class Company {

    private String name;

    private String type;

    private String inn;

    private String ogrn;

    private String kpp;

    private String phone;

    private String adress;

    private List<String> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", inn='" + inn + '\'' +
                ", ogrn='" + ogrn + '\'' +
                ", kpp='" + kpp + '\'' +
                ", phone='" + phone + '\'' +
                ", adress='" + adress + '\'' +
                ", users=" + users +
                '}';
    }
}
