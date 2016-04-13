package com.teddy.lc4e.database.model.base;

import com.teddy.jfinal.interfaces.DBModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysArea<M extends BaseSysArea<M>> extends DBModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public static final String id = "sys_area.id";

	public static final String ID = "ID";

	public void setParentId(java.lang.Integer parentId) {
		set("parentId", parentId);
	}

	public java.lang.Integer getParentId() {
		return get("parentId");
	}

	public static final String parentid = "sys_area.parentId";

	public static final String PARENTID = "PARENTID";

	public void setAbbr(java.lang.String abbr) {
		set("abbr", abbr);
	}

	public java.lang.String getAbbr() {
		return get("abbr");
	}

	public static final String abbr = "sys_area.abbr";

	public static final String ABBR = "ABBR";

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public static final String name = "sys_area.name";

	public static final String NAME = "NAME";

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public static final String description = "sys_area.description";

	public static final String DESCRIPTION = "DESCRIPTION";

	public void setCss(java.lang.String css) {
		set("css", css);
	}

	public java.lang.String getCss() {
		return get("css");
	}

	public static final String css = "sys_area.css";

	public static final String CSS = "CSS";

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}

	public java.lang.String getIcon() {
		return get("icon");
	}

	public static final String icon = "sys_area.icon";

	public static final String ICON = "ICON";

	public void setAreaStatusId(java.lang.Integer areaStatusId) {
		set("areaStatusId", areaStatusId);
	}

	public java.lang.Integer getAreaStatusId() {
		return get("areaStatusId");
	}

	public static final String areastatusid = "sys_area.areaStatusId";

	public static final String AREASTATUSID = "AREASTATUSID";

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public static final String createtime = "sys_area.createTime";

	public static final String CREATETIME = "CREATETIME";

	public void setUpdateTime(java.util.Date updateTime) {
		set("updateTime", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("updateTime");
	}

	public static final String updatetime = "sys_area.updateTime";

	public static final String UPDATETIME = "UPDATETIME";

	public static final String ALL_FIELDS = "sys_area.*";
	public static final String TABLE_NAME = "sys_area";}
