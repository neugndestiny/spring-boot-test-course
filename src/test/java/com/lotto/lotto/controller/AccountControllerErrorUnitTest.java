package com.lotto.lotto.controller;

import com.lotto.lotto.controller.response.AccountResponse;
import com.lotto.lotto.exception.MyAccountNotFoundException;
import com.lotto.lotto.model.Account;
import com.lotto.lotto.repository.AccountRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
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

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getByIdWithException() {
        // Stub
//        given(repository.findById(2))
//                .willReturn(Optional.empty());
        when(repository.findById(2))
                .thenReturn(Optional.empty());

        accountController = new AccountController(repository);

        thrown.expect(MyAccountNotFoundException.class);
        thrown.expectMessage("Account id=[2] not found");
        AccountResponse response = accountController.getById(2);
    }
}