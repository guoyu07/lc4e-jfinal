package com.teddy.lc4e.database.model.base;

import com.teddy.jfinal.interfaces.DBModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysOperateType<M extends BaseSysOperateType<M>> extends DBModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public static final String id = "sys_operate_type.id";

	public static final String ID = "ID";

	public void setAbbr(java.lang.String abbr) {
		set("abbr", abbr);
	}

	public java.lang.String getAbbr() {
		return get("abbr");
	}

	public static final String abbr = "sys_operate_type.abbr";

	public static final String ABBR = "ABBR";

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public static final String name = "sys_operate_type.name";

	public static final String NAME = "NAME";

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public static final String description = "sys_operate_type.description";

	public static final String DESCRIPTION = "DESCRIPTION";

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public static final String createtime = "sys_operate_type.createTime";

	public static final String CREATETIME = "CREATETIME";

	public void setUpdateTime(java.util.Date updateTime) {
		set("updateTime", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("updateTime");
	}

	public static final String updatetime = "sys_operate_type.updateTime";

	public static final String UPDATETIME = "UPDATETIME";

	public static final String ALL_FIELDS = "sys_operate_type.*";
	public static final String TABLE_NAME = "sys_operate_type";}
