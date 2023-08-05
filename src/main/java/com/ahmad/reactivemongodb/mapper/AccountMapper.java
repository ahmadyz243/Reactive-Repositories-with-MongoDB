package com.ahmad.reactivemongodb.mapper;

import com.ahmad.reactivemongodb.domain.Account;
import com.ahmad.reactivemongodb.dto.AccountDto;
import org.springframework.beans.BeanUtils;

public class AccountMapper {

    public static AccountDto accountToAccountDto(Account account){
        AccountDto dto = new AccountDto();
        BeanUtils.copyProperties(account, dto);
        return dto;
    }

    public static Account accountDtoToAccount(AccountDto dto){
        Account account = new Account();
        BeanUtils.copyProperties(dto, account);
        return account;
    }

}
