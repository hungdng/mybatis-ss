package com.hungta.utils;

import java.util.UUID;

/**
 * @author HUNGTA on 01/08/18 - 10:39 PM
 * @project restfulmybatis
 */
public class UUIDUtil {
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
