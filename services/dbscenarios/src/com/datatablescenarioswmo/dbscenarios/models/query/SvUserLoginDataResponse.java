/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.datatablescenarioswmo.dbscenarios.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wavemaker.commons.json.serializer.ByteArrayToStringSerializer;
import com.wavemaker.commons.json.views.JsonViews.BlobAsUrlView;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class SvUserLoginDataResponse implements Serializable {


    @ColumnAlias("USER_NAME")
    private String userName;

    @ColumnAlias("PASSWORD")
    private String password;

    @ColumnAlias("ROLE")
    private String role;

    @ColumnAlias("USER_ID")
    private Short userId;

        @JsonView(BlobAsUrlView.class)
    @JsonSerialize(using = ByteArrayToStringSerializer.class)
    @JsonProperty(access = Access.READ_ONLY)
    @ColumnAlias("PROFILE")
    private byte[] profile;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Short getUserId() {
        return this.userId;
    }

    public void setUserId(Short userId) {
        this.userId = userId;
    }

    public byte[] getProfile() {
        return this.profile;
    }

    public void setProfile(byte[] profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SvUserLoginDataResponse)) return false;
        final SvUserLoginDataResponse svUserLoginDataResponse = (SvUserLoginDataResponse) o;
        return Objects.equals(getUserName(), svUserLoginDataResponse.getUserName()) &&
                Objects.equals(getPassword(), svUserLoginDataResponse.getPassword()) &&
                Objects.equals(getRole(), svUserLoginDataResponse.getRole()) &&
                Objects.equals(getUserId(), svUserLoginDataResponse.getUserId()) &&
                Objects.equals(getProfile(), svUserLoginDataResponse.getProfile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(),
                getPassword(),
                getRole(),
                getUserId(),
                getProfile());
    }
}