package com.teddy.lc4e.database.model;

import com.teddy.jfinal.annotation.Model;
import com.teddy.lc4e.database.model.base.BaseSysCommentAttach;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@Model(value = "sys_comment_attach", pk = {"id"})
public class SysCommentAttach extends BaseSysCommentAttach<SysCommentAttach> {
	public static final SysCommentAttach dao = new SysCommentAttach();
}
