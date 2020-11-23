import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.chrome.ChromeDriver;

import utilities.MailTest;
import utilities.TestConfig;

public class Test {
	public static void main(String[] args) throws Exception, MessagingException {
		 MailTest mail = new MailTest();
		 mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, "test", "test");
		 
	}
}
