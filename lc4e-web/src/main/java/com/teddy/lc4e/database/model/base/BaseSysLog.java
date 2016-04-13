package com.teddy.lc4e.database.model.base;

import com.teddy.jfinal.interfaces.DBModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysLog<M extends BaseSysLog<M>> extends DBModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public static final String id = "sys_log.id";

	public static final String ID = "ID";

	public void setOperateTypeId(java.lang.Integer operateTypeId) {
		set("operateTypeId", operateTypeId);
	}

	public java.lang.Integer getOperateTypeId() {
		return get("operateTypeId");
	}

	public static final String operatetypeid = "sys_log.operateTypeId";

	public static final String OPERATETYPEID = "OPERATETYPEID";

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

	public static final String userid = "sys_log.userId";

	public static final String USERID = "USERID";

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public static final String description = "sys_log.description";

	public static final String DESCRIPTION = "DESCRIPTION";

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}

	public java.lang.String getIp() {
		return get("ip");
	}

	public static final String ip = "sys_log.ip";

	public static final String IP = "IP";

	public void setAgant(java.lang.String agant) {
		set("agant", agant);
	}

	public java.lang.String getAgant() {
		return get("agant");
	}

	public static final String agant = "sys_log.agant";

	public static final String AGANT = "AGANT";

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public static final String createtime = "sys_log.createTime";

	public static final String CREATETIME = "CREATETIME";

	public void setUpdateTime(java.util.Date updateTime) {
		set("updateTime", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("updateTime");
	}

	public static final String updatetime = "sys_log.updateTime";

	public static final String UPDATETIME = "UPDATETIME";

	public static final String ALL_FIELDS = "sys_log.*";
	public static final String TABLE_NAME = "sys_log";}
