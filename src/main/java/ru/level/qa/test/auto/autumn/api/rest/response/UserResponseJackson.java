package ru.level.qa.test.auto.autumn.api.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UserResponseJackson {

    private String name;
    private String avatar;
    private String password;
    private String birthday;
    private String email;
    private String gender;

    @JsonProperty("date_start")
    private String dateStart;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponseJackson that = (UserResponseJackson) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(password, that.password) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(email, that.email) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(dateStart, that.dateStart) &&
                Objects.equals(hobby, that.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avatar, password, birthday, email, gender, dateStart, hobby);
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", password='" + password + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
