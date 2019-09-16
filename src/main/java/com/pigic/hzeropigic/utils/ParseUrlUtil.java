package com.pigic.hzeropigic.utils;

/**
 * @Author: 潘顾昌
 * @Date: 2019/7/1 19:38
 */
import java.util.HashMap;


public class ParseUrlUtil implements java.io.Serializable{


    private static final long serialVersionUID = -2419331782437199701L;
    //	保存URL参数的容器
    private static HashMap<String,String> strUrlParas= new HashMap<String,String>();

     /*
     * @description 解析日志url
     * @param url 需要解析的单条日志内容
     */
    public static HashMap<String,String> parser(String url){
        strUrlParas.clear();
//		传递的URL参数
        String strUrl = "";
        String strUrlParams = "";


//		解析访问地址
        if(url.contains("?")){
            String[] strUrlPatten = url.split("\\?");
            strUrl = strUrlPatten[0];
            strUrlParams = strUrlPatten[1];

        }else{
            strUrl = url;
            strUrlParams = url;
        }

        strUrlParas.put("URL", strUrl);
//		解析参数
        String[] params = null;

        if(strUrlParams.contains("&")){
            params = strUrlParams.split("&");
        }else{
            params = new String[] {strUrlParams};
        }

//		保存参数到参数容器
        for(String p:params){
            if(p.contains("=")) {
                String[] param = p.split("=");
                if(param.length==1){
                    strUrlParas.put(param[0],"");
                }else{

                    String key = param[0];
                    String value = param[1];

                    strUrlParas.put(key, value);
                }
            }else {
                strUrlParas.put("errorParam",p);
            }
        }
    return strUrlParas;
    }

}