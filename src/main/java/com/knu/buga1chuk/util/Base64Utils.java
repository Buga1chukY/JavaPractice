package com.knu.buga1chuk.util;

import java.util.Base64;

public final class Base64Utils {
    private Base64Utils() {
    }

    public static String toBase64String(byte[] fileBytes) {
        String result = "";

        if (fileBytes != null) {
            result = Base64.getEncoder().encodeToString(fileBytes);
        }

        return result;
    }

}
