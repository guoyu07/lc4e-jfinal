package com.teddy.lc4e.database.model.base;

import com.teddy.jfinal.interfaces.DBModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysRole<M extends BaseSysRole<M>> extends DBModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public static final String id = "sys_role.id";

	public static final String ID = "ID";

	public void setAbbr(java.lang.String abbr) {
		set("abbr", abbr);
	}

	public java.lang.String getAbbr() {
		return get("abbr");
	}

	public static final String abbr = "sys_role.abbr";

	public static final String ABBR = "ABBR";

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public static final String name = "sys_role.name";

	public static final String NAME = "NAME";

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public static final String description = "sys_role.description";

	public static final String DESCRIPTION = "DESCRIPTION";

	public void setAvailable(java.lang.Integer available) {
		set("available", available);
	}

	public java.lang.Integer getAvailable() {
		return get("available");
	}

	public static final String available = "sys_role.available";

	public static final String AVAILABLE = "AVAILABLE";

	public static final String ALL_FIELDS = "sys_role.*";
	public static final String TABLE_NAME = "sys_role";}