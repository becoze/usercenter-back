package com.becoze.ucback.model.request;

import com.becoze.ucback.common.PageRequest;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户更新请求
 *
 * @author
 */
@Data
public class UserSearchRequest extends PageRequest implements Serializable {

    private String username;

    private String userAccount;

    /**
     * gender: Male, Female
     */
    private String gender;

    private String phone;

    private String email;

    /**
     * status  0 - normal user, 1 - cancelled user, 2 - banned user
     */
    private Integer userStatus;

    private Date updateTime;

    private Date createTime;

    /**
     * user - normal account, admin - admin account, ban - banned account
     */
    private String userRole;

    /**
     * user code different to user id.
     */
    private String userCode;

    private static final long serialVersionUID = 1L;
}