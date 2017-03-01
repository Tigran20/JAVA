import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthSentCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 78754, "de1fc6c403b90c1f2e91192e97f82bf0");

        System.out.println("Введите свой номер телефона:");
        AuthSentCode sentCode = bridge.authSendCode(reader.readLine().trim());
        System.out.println(sentCode.isRegistered());

        if(sentCode.isRegistered())
        {
            System.out.println("Введите код:");
        }
        else
            {
                System.out.println("Номер телефона неверен");
                System.exit(0);
            }

        AuthAuthorization authAuthorization = bridge.authSignIn(reader.readLine().trim());

        System.out.println("Ваши данные: " + authAuthorization.getUser());
        System.exit(0);
    }

}
