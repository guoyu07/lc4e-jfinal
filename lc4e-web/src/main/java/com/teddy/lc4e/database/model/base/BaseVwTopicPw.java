package com.teddy.lc4e.database.model.base;

import com.teddy.jfinal.interfaces.DBModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseVwTopicPw<M extends BaseVwTopicPw<M>> extends DBModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public static final String id = "vw_topic_pw.id";

	public static final String ID = "ID";

	public void setAreaAbbr(java.lang.String areaAbbr) {
		set("areaAbbr", areaAbbr);
	}

	public java.lang.String getAreaAbbr() {
		return get("areaAbbr");
	}

	public static final String areaabbr = "vw_topic_pw.areaAbbr";

	public static final String AREAABBR = "AREAABBR";

	public void setAreaName(java.lang.String areaName) {
		set("areaName", areaName);
	}

	public java.lang.String getAreaName() {
		return get("areaName");
	}

	public static final String areaname = "vw_topic_pw.areaName";

	public static final String AREANAME = "AREANAME";

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public static final String title = "vw_topic_pw.title";

	public static final String TITLE = "TITLE";

	public void setAuthor(java.lang.String author) {
		set("author", author);
	}

	public java.lang.String getAuthor() {
		return get("author");
	}

	public static final String author = "vw_topic_pw.author";

	public static final String AUTHOR = "AUTHOR";

	public void setAuthorId(java.lang.Integer authorId) {
		set("authorId", authorId);
	}

	public java.lang.Integer getAuthorId() {
		return get("authorId");
	}

	public static final String authorid = "vw_topic_pw.authorId";

	public static final String AUTHORID = "AUTHORID";

	public void setCurTagUser(java.lang.Integer curTagUser) {
		set("curTagUser", curTagUser);
	}

	public java.lang.Integer getCurTagUser() {
		return get("curTagUser");
	}

	public static final String curtaguser = "vw_topic_pw.curTagUser";

	public static final String CURTAGUSER = "CURTAGUSER";

	public void setLastUserNick(java.lang.String lastUserNick) {
		set("lastUserNick", lastUserNick);
	}

	public java.lang.String getLastUserNick() {
		return get("lastUserNick");
	}

	public static final String lastusernick = "vw_topic_pw.lastUserNick";

	public static final String LASTUSERNICK = "LASTUSERNICK";

	public void setLastUser(java.lang.Integer lastUser) {
		set("lastUser", lastUser);
	}

	public java.lang.Integer getLastUser() {
		return get("lastUser");
	}

	public static final String lastuser = "vw_topic_pw.lastUser";

	public static final String LASTUSER = "LASTUSER";

	public void setLastCommentOrder(java.lang.Integer lastCommentOrder) {
		set("lastCommentOrder", lastCommentOrder);
	}

	public java.lang.Integer getLastCommentOrder() {
		return get("lastCommentOrder");
	}

	public static final String lastcommentorder = "vw_topic_pw.lastCommentOrder";

	public static final String LASTCOMMENTORDER = "LASTCOMMENTORDER";

	public void setLastCommentId(java.lang.Integer lastCommentId) {
		set("lastCommentId", lastCommentId);
	}

	public java.lang.Integer getLastCommentId() {
		return get("lastCommentId");
	}

	public static final String lastcommentid = "vw_topic_pw.lastCommentId";

	public static final String LASTCOMMENTID = "LASTCOMMENTID";

	public void setTsPw(java.math.BigDecimal tsPw) {
		set("tsPw", tsPw);
	}

	public java.math.BigDecimal getTsPw() {
		return get("tsPw");
	}

	public static final String tspw = "vw_topic_pw.tsPw";

	public static final String TSPW = "TSPW";

	public void setUtPw(java.math.BigDecimal utPw) {
		set("utPw", utPw);
	}

	public java.math.BigDecimal getUtPw() {
		return get("utPw");
	}

	public static final String utpw = "vw_topic_pw.utPw";

	public static final String UTPW = "UTPW";

	public void setUtvaPw(java.lang.Long utvaPw) {
		set("utvaPw", utvaPw);
	}

	public java.lang.Long getUtvaPw() {
		return get("utvaPw");
	}

	public static final String utvapw = "vw_topic_pw.utvaPw";

	public static final String UTVAPW = "UTVAPW";

	public void setCount(java.lang.Long count) {
		set("count", count);
	}

	public java.lang.Long getCount() {
		return get("count");
	}

	public static final String count = "vw_topic_pw.count";

	public static final String COUNT = "COUNT";

	public void setPubTime(java.util.Date pubTime) {
		set("pubTime", pubTime);
	}

	public java.util.Date getPubTime() {
		return get("pubTime");
	}

	public static final String pubtime = "vw_topic_pw.pubTime";

	public static final String PUBTIME = "PUBTIME";

	public void setAreaId(java.lang.Integer areaId) {
		set("areaId", areaId);
	}

	public java.lang.Integer getAreaId() {
		return get("areaId");
	}

	public static final String areaid = "vw_topic_pw.areaId";

	public static final String AREAID = "AREAID";

	public void setAuthorAvatar(java.lang.String authorAvatar) {
		set("authorAvatar", authorAvatar);
	}

	public java.lang.String getAuthorAvatar() {
		return get("authorAvatar");
	}

	public static final String authoravatar = "vw_topic_pw.authorAvatar";

	public static final String AUTHORAVATAR = "AUTHORAVATAR";

	public static final String ALL_FIELDS = "vw_topic_pw.*";
	public static final String TABLE_NAME = "vw_topic_pw";}
