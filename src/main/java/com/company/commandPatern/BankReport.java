package com.company.commandPatern;

import com.company.Bank;
import com.company.ReportVisitor;
import com.company.Reports;

public interface BankReport extends Reports {
	Bank getContent();
}
