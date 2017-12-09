package com.bucky.crazy.utils;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Dang Dim
 * Date     : 09-Dec-17, 3:04 PM
 * Email    : d.dim@gl-f.com
 */
public class StringUtils {

    public StringUtils() {
    }

    public static String join(List<String> list, String separator) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;

        String item;
        for(Iterator var4 = list.iterator(); var4.hasNext(); sb.append(item)) {
            item = (String)var4.next();
            if(first) {
                first = false;
            } else {
                sb.append(separator);
            }
        }

        return sb.toString();
    }
}
