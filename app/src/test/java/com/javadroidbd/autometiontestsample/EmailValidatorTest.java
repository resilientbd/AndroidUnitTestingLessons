package com.javadroidbd.autometiontestsample;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailValidatorTest {
    @Test
    public void correctEmail_simpleReturnsTrue()
    {
        assertTrue(EmailValidator.isValidEmail("faisal@gmail.com"));
    }
    @Test
    public void correctSubdomain_simpleReturnsTrue()
    {
        assertTrue(EmailValidator.isValidEmail("faisal@co.uk.com"));
    }
    @Test
    public void emailValidaotor_invalidEmail_simpleReturnFalse()
    {
        assertFalse(EmailValidator.isValidEmail("name@gmail"));
    }
    @Test
    public void emailValidaotor_emailExtraCharacter_simpleReturnFalse()
    {
        assertFalse(EmailValidator.isValidEmail("name@gmail..com"));
    }
    @Test
    public void emailValidaotor_noUserName_simpleReturnFalse()
    {
        assertFalse(EmailValidator.isValidEmail("@gmail.com"));
    }
    @Test
    public void emailValidaotor_emptyEmail_simpleReturnFalse()
    {
        assertFalse(EmailValidator.isValidEmail(""));
    }
    @Test
    public void emailValidaotor_emailNullCheck_simpleReturnFalse()
    {
        assertFalse(EmailValidator.isValidEmail(null));
    }

}
