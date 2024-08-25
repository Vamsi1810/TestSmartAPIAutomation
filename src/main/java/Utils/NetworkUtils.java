package Utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Collections;
import java.util.Enumeration;

public class NetworkUtils {
    public static String getLocalIP() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Unable to determine local IP";
        }
    }

    public static String getPublicIP() {
        try {
            URL url = new URL("https://api.ipify.org?format=text");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String publicIP = reader.readLine();
            reader.close();
            return publicIP;
        } catch (Exception e) {
            e.printStackTrace();
            return "Unable to determine public IP";
        }
    }

    public static String getMACAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                if (!networkInterface.isLoopback() && !networkInterface.isVirtual() && networkInterface.isUp()) {
                    byte[] mac = networkInterface.getHardwareAddress();
                    if (mac != null) {
                        StringBuilder sb = new StringBuilder();
                        for (byte b : mac) {
                            sb.append(String.format("%02X:", b));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1); // Remove trailing colon
                        }
                        return sb.toString();
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return "Unable to determine MAC address";
    }
}
