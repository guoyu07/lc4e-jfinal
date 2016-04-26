package com.teddy.lc4e.database.model.base;

import com.teddy.jfinal.interfaces.DBModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserBlocked<M extends BaseUserBlocked<M>> extends DBModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public static final String id = "user_blocked.id";

	public static final String ID = "ID";

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

	public static final String userid = "user_blocked.userId";

	public static final String USERID = "USERID";

	public void setBlockedUserId(java.lang.Integer blockedUserId) {
		set("blockedUserId", blockedUserId);
	}

	public java.lang.Integer getBlockedUserId() {
		return get("blockedUserId");
	}

	public static final String blockeduserid = "user_blocked.blockedUserId";

	public static final String BLOCKEDUSERID = "BLOCKEDUSERID";

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public static final String createtime = "user_blocked.createTime";

	public static final String CREATETIME = "CREATETIME";

	public void setUpdateTime(java.util.Date updateTime) {
		set("updateTime", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("updateTime");
	}

	public static final String updatetime = "user_blocked.updateTime";

	public static final String UPDATETIME = "UPDATETIME";

	public static final String ALL_FIELDS = "user_blocked.*";
	public static final String TABLE_NAME = "user_blocked";}