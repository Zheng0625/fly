package com.ict.fly.util;

import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class MSUtil {
    //使用MD5加密算法
    public static String md5(String msg) {
        //摘要算法，将不同长度的字符串转换为等长的，不可逆
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] input = msg.getBytes();//input 需要加密的信息
            byte[] output = messageDigest.digest(input);//output 加密过信息
            //将md5处理后的output结果转成字符串
            //利用Base64算法转成字符串
            String str = Base64.encodeBase64String(output);
            return str;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println("密码加密失败");
            return e.toString();
        }
    }


}
