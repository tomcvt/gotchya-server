package com.tomcvt.gotchya.server.util;

import java.security.SecureRandom;

public class GenUtils {
    public static String AZ09 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String generateXID12() {
        // Generate a random 12-character alphanumeric string
        String chars = AZ09;
        StringBuilder xid12 = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            int index = (int) (Math.random() * chars.length());
            xid12.append(chars.charAt(index));
        }
        return xid12.toString();
    }
    //now securerandom safe version
    public static String generateSecureXID12() {
        String chars = AZ09;
        StringBuilder xid12 = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 12; i++) {
            int index = random.nextInt(chars.length());
            xid12.append(chars.charAt(index));
        }
        return xid12.toString();
    }
}
