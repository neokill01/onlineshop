package com.onlineshop.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author junyuy
 * @name User
 * @description 用户实体类
 * @date 16/5/31
 */

@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long servialVersionUID = 1L;

    public User() {
    }

    public User(String nickname, String headImg, String email, String phone, String username, String password, Integer status, Long createTime, Long updateTime) {
        this.nickname = nickname;
        this.headImg = headImg;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "head_img")
    private String headImg;
    @Column(name = "email")
    private String email;
    @Column(name = "phone", length = 45, unique = true)
    private String phone;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "status", length = 11)
    private Integer status;
    @Column(name = "c_t")
    private Long createTime;
    @Column(name = "u_t")
    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", headImg='" + headImg + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
