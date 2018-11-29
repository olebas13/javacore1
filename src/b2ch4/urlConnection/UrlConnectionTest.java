package b2ch4.urlConnection;

import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

public class UrlConnectionTest {

    public static void main(String[] args) {
        try {
            String urlName;
            if (args.length > 0) {
                urlName = args[0];
            } else {
                urlName = "http://horstmann.com";
            }

            URL url = new URL(urlName);
            URLConnection connection = url.openConnection();

            if (args.length > 2) {
                String username = args[1];
                String password = args[2];
                String input = username + ":" + password;
                Base64.Encoder encoder =
            }
        }
    }
}
