package com.midas.app.activities;

import com.midas.app.models.Account;

public class AccountActivityImpl implements AccountActivity {
  @Override
  public Account saveAccount(Account account) {
    return account;
  }

  @Override
  public Account createPaymentAccount(Account account) {
    return account;
  }
}
