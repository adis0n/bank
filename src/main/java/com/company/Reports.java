package com.company;

import com.company.ReportVisitor;
//for visitor
public interface Reports {
	void accept(ReportVisitor visitor);
}
