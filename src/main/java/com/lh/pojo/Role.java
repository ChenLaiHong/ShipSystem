package com.lh.pojo;

import java.util.List;

public class Role {
    private Integer roleId;

    private String roleName;

    private List<Crew> crewList;

    public List<Crew> getCrewList() {
        return crewList;
    }

    public void setCrewList(List<Crew> crewList) {
        this.crewList = crewList;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Role() {
    }

    public Role(Integer roleId, String roleName, List<Crew> crewList) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.crewList = crewList;
    }
}