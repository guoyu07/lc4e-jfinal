package com.teddy.lc4e.database.model;

import com.teddy.jfinal.annotation.Model;
import com.teddy.lc4e.database.model.base.BaseTopicTag;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@Model(value = "topic_tag", pk = {"id"})
public class TopicTag extends BaseTopicTag<TopicTag> {
	public static final TopicTag dao = new TopicTag();
}
