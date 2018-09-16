package com.lotto.lotto.controller;

import com.lotto.lotto.controller.response.AccountResponse;
import com.lotto.lotto.exception.MyAccountNotFoundException;
import com.lotto.lotto.model.Account;
import com.lotto.lotto.repository.AccountRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

public class AccountControllerErrorUnitTest {

    @Mock
    private AccountRepository repository;

    private AccountController accountController;

    // This can be use too and more stable than @Runwith(mockitoJunitRunner)
    @Before
    public void initial() {
        initMocks(this);
    }

    @Test(expected = MyAccountNotFoundException.class)
    public void getByIdWithException() {
        // Stub
        given(repository.findById(2))
                .willReturn(Optional.empty());

        accountController = new AccountController(repository);
        AccountResponse response = accountController.getById(2);
    }
}