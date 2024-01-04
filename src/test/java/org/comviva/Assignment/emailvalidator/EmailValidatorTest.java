package org.comviva.Assignment.emailvalidator;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.comviva.Assignment.emailvalidator.EmailValidator;
import org.junit.Before;
import org.junit.Test;

public class EmailValidatorTest {

    private EmailValidator emailValidator;

    @Before
    public void setUp() {
        emailValidator = new EmailValidator();
    }

    @Test
    public void testIsValidEmail() {
        assertTrue(emailValidator.isValidEmail("user@example.com"));
        assertFalse(emailValidator.isValidEmail("invalid_email"));
    }

    @Test
    public void testIsCorporateEmail() {
        assertFalse(emailValidator.isCorporateEmail("user@example.com"));
        assertTrue(emailValidator.isCorporateEmail("employee@company.com"));
    }

    @Test
    public void testHasWhitespaceOrCaseIssue() {
        assertTrue(emailValidator.hasWhitespaceOrCaseIssue(" user@example.com "));
        assertTrue(emailValidator.hasWhitespaceOrCaseIssue("User@Example.com"));
        assertFalse(emailValidator.hasWhitespaceOrCaseIssue("user@example.com"));
    }

    @Test
    public void testIsEmailTooLong() {
        assertFalse(emailValidator.isEmailTooLong("user@example.com"));
        
    }

    @Test
    public void testIsInvalidFormat() {
        assertFalse(emailValidator.isInvalidFormat("user@example.com"));
        assertTrue(emailValidator.isInvalidFormat("invalid_email"));
    }
}
