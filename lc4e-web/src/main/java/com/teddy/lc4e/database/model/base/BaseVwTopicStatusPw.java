package com.teddy.lc4e.database.model.base;

import com.teddy.jfinal.interfaces.DBModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseVwTopicStatusPw<M extends BaseVwTopicStatusPw<M>> extends DBModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public static final String id = "vw_topic_status_pw.id";

	public static final String ID = "ID";

	public void setStatusPw(java.math.BigDecimal statusPw) {
		set("statusPw", statusPw);
	}

	public java.math.BigDecimal getStatusPw() {
		return get("statusPw");
	}

	public static final String statuspw = "vw_topic_status_pw.statusPw";

	public static final String STATUSPW = "STATUSPW";

	public static final String ALL_FIELDS = "vw_topic_status_pw.*";
	public static final String TABLE_NAME = "vw_topic_status_pw";}