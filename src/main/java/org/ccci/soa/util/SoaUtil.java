/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ccci.soa.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nathan.Kopp
 */
public class SoaUtil {
    private static DateFormat df = new SimpleDateFormat("M/d/yyyy");
    
    static public boolean isBlank(Object o)
    {
        if(o==null) return true;
        return (o.toString().trim().length()==0);
    }

    static public boolean equal(Object val1, Object val2) {
        if(val1==val2) return true;
        if(val1==null || val2==null) return false;
        return (val1.equals(val2));
    }
    
    static public boolean equalBlanksEqual(Object val1, Object val2) {
        if(val1==val2) return true;
        if(SoaUtil.isBlank(val1) && SoaUtil.isBlank(val2)) return true;
        if(val1==null || val2==null) return false;
        return (val1.equals(val2));
    }
    
    static public Date parseDate(String s) throws ParseException
    {
        if(isBlank(s)) return null;
        return df.parse(s);
    }
    
    static public String formatDate(Date d)
    {
        if(d==null) return null;
        return df.format(d);
    }
}

