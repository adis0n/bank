package com.company.commandPatern;

import com.company.Bank;
import com.company.ReportVisitor;
import com.company.Reports;

//not working right now; works for accounts
public interface BankReport extends Reports {
	Bank getContent();
}
