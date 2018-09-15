package com.lotto.lotto.controller;

import com.lotto.lotto.controller.response.AccountResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    public AccountResponse getById(int id) {
        return new AccountResponse();
    }
}
