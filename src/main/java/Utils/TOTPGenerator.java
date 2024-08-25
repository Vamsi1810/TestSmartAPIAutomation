package Utils;

import org.jboss.aerogear.security.otp.Totp;

public class TOTPGenerator {
    public static String otpGenerate(){
        Totp otp = new Totp(ConfigLoader.getProperty("totp.secretKey"));
        return otp.now();
    }
}
