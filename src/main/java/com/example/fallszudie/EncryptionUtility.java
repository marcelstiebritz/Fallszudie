package com.example.fallszudie;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionUtility {
    public static final String AES_ENCRYPTION = "AES";
    public static Cipher cipher;

    public EncryptionUtility() {
    }

    public static String encrypt(String plainTesxt, SecretKey secretKey) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] plainTextByte = plainTesxt.getBytes();
        cipher.init(1, secretKey);
        byte[] encryptedByte = cipher.doFinal(plainTextByte);
        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedText = encoder.encodeToString(encryptedByte);
        return encryptedText;
    }

    public static String decrypt(String encrptedText, SecretKey secretKey) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encryptedTextByte = decoder.decode(encrptedText);
        cipher.init(2, secretKey);
        byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
        String decyptedText = new String(decryptedByte);
        return decyptedText;
    }

    public static String createKey() throws NoSuchAlgorithmException {
        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        return encodedKey;
    }

    public static SecretKey decodeKey(String[] args) {
        byte[] decodedKey = Base64.getDecoder().decode(args[0]);
        SecretKey originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
        return originalKey;
    }
}
