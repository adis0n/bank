package com.company;

import com.company.ReportVisitor;

public interface Reports {
	void accept(ReportVisitor visitor);
}
