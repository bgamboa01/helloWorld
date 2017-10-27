package com.maven.init.maven_app;

import org.apache.commons.lang3.StringUtils;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Is 'num3ric', numeric? ");
        System.out.print(StringUtils.isNumeric("num3ric") + " #StringUtils");
    }
}
