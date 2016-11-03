package com.arvato.thoroughly.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZHAO130 on 2016/10/29.
 */
public class TaoBaoJsonUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaoBaoJsonUtil.class);
    public static Object onlineSendJson(Object body){
        Object object=new Object();
//        JSONObject jsonObject=new JSONObject();
//        String msg="success";
//        try{
//            if (body!=null){
//                JSONObject json = JSONObject.fromObject(formatJsonString(body.toString())).getJSONObject("ogistics_online_send_response");
//                if(jsonObject!=null){
//                    Boolean  is_success=json.getJSONObject("shipping").getBoolean("is_success");
//                    if (!is_success){
//                        msg="online Send failed";
//                    }
//                }else {
//                    JSONObject jsonError=JSONObject.fromObject(formatJsonString(body.toString())).getJSONObject("error_response");
//
//                }
//            }
//        }catch (Exception e){
//            LOGGER.info("onlineSendJosn is Exception:"+e.toString());
//        }
        return object;
    }

    private static String formatJsonString(String response) {
        //去除换行
        String str = response.replaceAll("\\r", "");
        str = str.replaceAll("\\n","|||");
        str = str.replaceAll("\\t","");
        return str;
    }

    /**
     * 将value中的引号改为中文的引号
     * @param s
     * @return
     */
    private static String jsonString(String s){
        char[] temp = s.toCharArray();
        int n = temp.length;
        for(int i =0;i<n;i++){
            if(temp[i]==':'&&temp[i+1]=='"'){
                for(int j =i+2;j<n;j++){
                    if(temp[j]=='"'){
                        if(temp[j+1]!=',' &&  temp[j+1]!='}'){
                            temp[j]='”';
                        }else if(temp[j+1]==',' ||  temp[j+1]=='}'){
                            break ;
                        }
                    }
                }
            }
        }

        return new String(temp);

    }


}
