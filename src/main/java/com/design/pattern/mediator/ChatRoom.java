package com.design.pattern.mediator;

import java.util.Date;

/**
 * @create: 2019/04/06 00:47
 */

public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }

}
