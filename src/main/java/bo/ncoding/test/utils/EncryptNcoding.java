package bo.ncoding.test.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 * @version     1.0
 */

public class EncryptNcoding {

    public static final String AES = "AES";

    private static String byteArrayToHexString(byte[] b) {
        StringBuffer sb = new StringBuffer(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            int v = b[i] & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }

    private static byte[] hexStringToByteArray(String s) {
        byte[] b = new byte[s.length() / 2];
        for (int i = 0; i < b.length; i++) {
            int index = i * 2;
            int v = Integer.parseInt(s.substring(index, index + 2), 16);
            b[i] = (byte) v;
        }
        return b;
    }

    public static String encript(String password) {
        String key = "DB99A2A8EB6904F492E9DF0595ED683C";
        byte[] bytekey = hexStringToByteArray(key);
        SecretKeySpec sks = new SecretKeySpec(bytekey, EncryptNcoding.AES);
        byte[] encrypted;
        try {
            Cipher cipher = Cipher.getInstance(EncryptNcoding.AES);
            cipher.init(Cipher.ENCRYPT_MODE, sks, cipher.getParameters());
            encrypted = cipher.doFinal(password.getBytes());
        } catch (Exception ex) {
            throw new RuntimeException("Error inesperado");
        }
        String encryptedpwd = byteArrayToHexString(encrypted);
        return encryptedpwd;

    }
}
