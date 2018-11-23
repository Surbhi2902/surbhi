package com.surbhinegi.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier
{
	@Id
	@GeneratedValue

	
	private String supplierid;
	private String suppliername;
	private String supplieraddress;
	private String suppliercontactdetail;
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSupplieraddress() {
		return supplieraddress;
	}
	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}
	public String getSuppliercontactdetail() {
		return suppliercontactdetail;
	}
	public void setSuppliercontactdetail(String suppliercontactdetail) {
		this.suppliercontactdetail = suppliercontactdetail;
	}
	
	
}