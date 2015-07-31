package com.teddy.lc4e.core.database.mapping;

/**
 * Created by lc4e Tool on 15/07/29.
 */
public class T_User_Topic_View_Attitude {
    /**
     * 
     * Type:INT
     * Remarks:
     */
    public static final String ID = "user_topic_view_attitude.id";

    /**
     * 
     * Type:INT
     * Remarks:
     */
    public static final String TOPICID = "user_topic_view_attitude.topicId";

    /**
     * 
     * Type:INT
     * Remarks:
     */
    public static final String USERID = "user_topic_view_attitude.userId";

    /**
     * 
     * Type:INT
     * Remarks:0-default,1-agree,-1-disagree
     */
    public static final String ATTITUDE = "user_topic_view_attitude.attitude";

    /**
     * 
     * Type:DATETIME
     * Remarks:
     */
    public static final String CREATETIME = "user_topic_view_attitude.createTime";

    /**
     * 
     * Type:DATETIME
     * Remarks:
     */
    public static final String UPDAETIME = "user_topic_view_attitude.updaeTime";

    public static final String ALL_FIELDS = "user_topic_view_attitude.*";

    public static final String Table_NAME = "user_topic_view_attitude";

}