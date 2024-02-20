package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    String email = "automation@grupa1.com";

    @Test
    public void signUp() {

        LOG.info("Insert Email");
        signInPage.typeInSignUpEmailField(email);

        LOG.info("Click enter sign up button");
        signInPage.clickEnterSignUpButton();

    }
}
