package com.think.in.java.util;


import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class AESUtils {
    private static final String ADD = "/add/";

    public static String encrypt(String str, String key) throws Exception {
        if (str == null || key == null) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE,
                new SecretKeySpec(key.getBytes("utf-8"), "AES"));
        byte[] bytes = cipher.doFinal(str.getBytes("utf-8"));
        String result = Base64.getEncoder().encodeToString(bytes);
        result = result.toString().replaceAll("\r", "");
        result = result.replaceAll("\\+", ADD);
        return result;
    }

    public static String decrypt(String str, String key) throws Exception {
        if (str == null || key == null) {
            return null;
        }
        str = str.replaceAll(ADD, "+");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE,
                new SecretKeySpec(key.getBytes("utf-8"), "AES"));
        byte[] bytes = Base64.getDecoder().decode(str);
        bytes = cipher.doFinal(bytes);
        return new String(bytes);
    }

    public static String encode(String str, String key) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, getKey(key));
            byte[] byteFina = cipher.doFinal(str.getBytes());
            // base64编码
            String dest = Base64.getEncoder().encodeToString(byteFina);
            byte[] sorData = dest.getBytes("ISO-8859-1");
            dest = Base64.getEncoder().encodeToString(sorData);
            return dest;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Key getKey(String strKey) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );  //追加防止跨操作系统的密钥对象不同问题
            secureRandom.setSeed(strKey.getBytes());
            keyGenerator.init(128,secureRandom);
            Key key = keyGenerator.generateKey();
            return key;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }



    public static void main(String[] args) throws Exception {
        String key = "qQJIjSXH3Krvf9Uv"; //qQJIjSXH3Krvf9Uv
        String phone = "liyong";
        System.out.println(encrypt("15399419881", key));
//        System.out.println(decrypt("VVMysQX6npfaX/IJCQvM0w==", key));
//        Location:" "https://jrcx.js165.com/kpicheck-app-server/mobile?system=weiwo&userAccount=LOabwR0zrAzgI4/9kBK7Gg==&skin=blue&colorCode=0380FE&tel=ZUdtGStVsKgxoYFt4C1XKQ==&userName=wLjZSjlnbfiEqCdN0kaauA==&textColor=FFFFFF&ssoTicket=WsvN7pCOiBEXJNgMeN3rdJQ/add/hCm8kTBXrbbKcvIlGVIsGsaUOsob5Yfwq6jXnFxE
        String str ="LOabwR0zrAzgI4/9kBK7Gg==";
        System.out.println(AESUtils.decrypt(str, key));

    }
}
