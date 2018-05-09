package com.chainOfResponsibility.mashibing;

import java.util.ArrayList;
import java.util.List;

public class StringFilterChain implements StringFilter{

    private List<StringFilter> filters =  new ArrayList<StringFilter>();


    public void addFilter(StringFilter filter){
        filters.add(filter);
    }

    @Override
    public String doFilter(String str){
        for(StringFilter filter:filters){
            str = filter.doFilter(str);
        }
        return str;
    }


}
