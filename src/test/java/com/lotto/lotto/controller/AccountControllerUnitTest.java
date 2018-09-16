package com.lotto.lotto.controller;

import com.lotto.lotto.controller.response.AccountResponse;
import com.lotto.lotto.model.Account;
import com.lotto.lotto.repository.AccountRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

public class AccountControllerUnitTest {

    @Mock
    private AccountRepository repository;

    private AccountController accountController;

    // This can be use too and more stable than @Runwith(mockitoJunitRunner)
    @Before
    public void initial() {
        initMocks(this);
    }

    @Test
    public void getById() {
        // Stub
        Account account = new Account();
        account.setUsreName("user");
        account.setPassword("pass");
        account.setSalary(1000);
        given(repository.findById(1))
                .willReturn(Optional.of(account));

        accountController = new AccountController(repository);
        AccountResponse response = accountController.getById(1);
        AccountResponse exptected = new AccountResponse("user", "pass", 1000);
        assertEquals(exptected, response);
    }
}