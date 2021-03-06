package com.teddy.lc4e.database.model.base;

import com.teddy.jfinal.interfaces.DBModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminLog<M extends BaseAdminLog<M>> extends DBModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public static final String id = "admin_log.id";

	public static final String ID = "ID";

	public void setLogDetail(java.lang.String logDetail) {
		set("logDetail", logDetail);
	}

	public java.lang.String getLogDetail() {
		return get("logDetail");
	}

	public static final String logdetail = "admin_log.logDetail";

	public static final String LOGDETAIL = "LOGDETAIL";

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public static final String createtime = "admin_log.createTime";

	public static final String CREATETIME = "CREATETIME";

	public void setUpdateTime(java.util.Date updateTime) {
		set("updateTime", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("updateTime");
	}

	public static final String updatetime = "admin_log.updateTime";

	public static final String UPDATETIME = "UPDATETIME";

	public static final String ALL_FIELDS = "admin_log.*";
	public static final String TABLE_NAME = "admin_log";}
