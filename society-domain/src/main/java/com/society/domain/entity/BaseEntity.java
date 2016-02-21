package com.society.domain.entity;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import com.society.domain.entity.audit.AuditColumns;
import com.society.domain.entity.audit.AuditColumnsListener;
import com.society.domain.entity.audit.AuditableColumns;

@EntityListeners(AuditColumnsListener.class)
@MappedSuperclass
public  class BaseEntity implements AuditableColumns
{

	/** The Constant serialVersionUID. */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	private AuditColumns auditColumns;

	@Override
	public AuditColumns getAuditableColumns()
	{
		return auditColumns;
	}

	@Override
	public void setAuditableColumns(AuditColumns auditColumns)
	{
		this.auditColumns = auditColumns;
		
	}

}
