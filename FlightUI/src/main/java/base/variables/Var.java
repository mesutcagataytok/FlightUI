package base.variables;

import base.config.XmlFileParse;


public class Var {

    public Var() {

    }

    //İstenilen sayfada şu şekilde import edilerek kullanılabilir :
    // import variables.Var;
    // var.baseURL

    public static final String baseURL = XmlFileParse.xmlFileParse("baseURL", "var.xml");
    public static final String browser = XmlFileParse.xmlFileParse("browser", "var.xml");






}