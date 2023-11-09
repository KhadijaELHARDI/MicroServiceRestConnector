package org.sid.accountsbankservice.service;

import org.sid.accountsbankservice.dto.BankAccountRequestDTO;
import org.sid.accountsbankservice.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
