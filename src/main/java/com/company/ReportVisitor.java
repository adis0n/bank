package com.company;

import com.company.commandPatern.BankReport;

public interface ReportVisitor {
	void visit(BankReport report);
	void visit(AccountReport report);
}
