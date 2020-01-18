package com.lh.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.stereotype.Component;

@Component
public class Crew {
    @Excel(name = "工号")
    private String loginId;

    @Excel(name = "姓名")
    private String name;

    private String password;

    @Excel(name = "性别",replace ={"男_0","女_1"})
    private Integer gender;

    @Excel(name = "联系电话")
    private String phone;

    private String birth;

    @Excel(name = "邮箱")
    private String email;

    private String householdRegister;

    private Integer staticLive;

    @Excel(name = "角色",replace ={"普通船员_1","中级船员_2","高级船员_3","船长_4"})
    private Integer roleId;

    private Role role;

    public Role getRole() {
        return role;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHouseholdRegister() {
        return householdRegister;
    }

    public void setHouseholdRegister(String householdRegister) {
        this.householdRegister = householdRegister == null ? null : householdRegister.trim();
    }

    public Integer getStaticLive() {
        return staticLive;
    }

    public void setStaticLive(Integer staticLive) {
        this.staticLive = staticLive;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Crew() {
    }

    public Crew(String loginId, String name, String password, Integer gender, String phone, String birth, String email, String householdRegister, Integer staticLive, Integer roleId) {
        this.loginId = loginId;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
        this.birth = birth;
        this.email = email;
        this.householdRegister = householdRegister;
        this.staticLive = staticLive;
        this.roleId = roleId;
    }
}