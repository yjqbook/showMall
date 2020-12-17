package com.yys.mall.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Sms {
    public static String HTTPPost(String sendUrl, String sendParam) {
        String codingType = "UTF-8";
        StringBuffer receive = new StringBuffer();
        BufferedWriter wr = null;
        try {
            // 建立连接
            URL url = new URL(sendUrl);
            HttpURLConnection URLConn = (HttpURLConnection) url.openConnection();
            URLConn.setDoOutput(true);
            URLConn.setDoInput(true);
            ((HttpURLConnection) URLConn).setRequestMethod("POST");
            URLConn.setUseCaches(false);
            URLConn.setAllowUserInteraction(true);
            HttpURLConnection.setFollowRedirects(true);
            URLConn.setInstanceFollowRedirects(true);
            URLConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            URLConn.connect();

            DataOutputStream dos = new DataOutputStream(URLConn.getOutputStream());
            dos.writeBytes(sendParam);
            BufferedReader rd = new BufferedReader(new InputStreamReader(
                    URLConn.getInputStream(), codingType));
            String line;
            while ((line = rd.readLine()) != null) {
                receive.append(line).append("\r\n");
            }
            rd.close();
        } catch (IOException e) {
            receive.append("访问产生了异常-->").append(e.getMessage());
            e.printStackTrace();
        } finally {
            if (wr != null) {
                try {
                    wr.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                wr = null;
            }
        }
        return receive.toString();
    }

    // 发送短信
    private static String sendMessage(String sendUrl, String userid, String account,
                                      String password, String mobile, String content) {
        String codingType = "UTF-8";
        StringBuffer sendParam = new StringBuffer();
        try {
            // sendParam.append("action=").append("send");
            sendParam.append("&userid=").append(userid);
            sendParam.append("&account=").append(URLEncoder.encode(account, codingType));
            sendParam.append("&password=").append(URLEncoder.encode(password, codingType));
            sendParam.append("&mobile=").append(mobile);
            sendParam.append("&content=").append(URLEncoder.encode(content, codingType));
        } catch (Exception e) {
            // 处理异常
            e.printStackTrace();
        }
        return Sms.HTTPPost(sendUrl, sendParam.toString());
    }

    // 查询余额
    public static String Overage(String sendUrl, String userid, String account,
                                 String password) {
        String codingType = "UTF-8";
        StringBuffer sendParam = new StringBuffer();
        try {
            sendParam.append("action=").append("overage");
            sendParam.append("&userid=").append(userid);
            sendParam.append("&account=").append(URLEncoder.encode(account, codingType));
            sendParam.append("&password=").append(URLEncoder.encode(password, codingType));
        } catch (Exception e) {
            // 处理异常
            e.printStackTrace();
        }
        return Sms.HTTPPost(sendUrl, sendParam.toString());
    }

    public static String url = "http://hyt.uewang.net/SmsWebService.asmx/SendSms"; // 对应平台地址
    public static String userid = "0001"; // 客户id
    public static String account = "xxxx"; // 账号
    public static String password = "123456"; // 密码
    public static String mobile = "13000000000"; // 手机号码，多个号码使用","分割
    public static String content = "欢迎加入cpe会员！您的验证码是:"; // 短信内容


    public static String send(String phone,String code) {
        String sendReturn = Sms.sendMessage(url, userid, account, password, phone, content+code);
        return sendReturn;
    }
}
