package com.teddy.lc4e.core.database.model;

import com.teddy.jfinal.annotation.Model;
import com.teddy.jfinal.interfaces.DBModel;

/**
 * Created by lc4e Tool on 15/09/24.
 */
@Model(value = "vw_topic_no_pw")
public class Vw_Topic_No_Pw extends DBModel<Vw_Topic_No_Pw> {
    public static final Vw_Topic_No_Pw dao = new Vw_Topic_No_Pw();

}