package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * Update
 *
 * @author philip
 */
@Data
public class UserUpdateRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private long id;
    private String userAccount;

    private String username;

    private String avatarUrl;

    private int gender;

    private String phone;

    private String email;

    private int userRole;

    public UserUpdateRequest(long id, String userAccount, String username, String avatarUrl, int gender, String phone, String email, int userRole){
        this.id = id;
        this.userAccount = userAccount;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.userRole = userRole;

    }

}
