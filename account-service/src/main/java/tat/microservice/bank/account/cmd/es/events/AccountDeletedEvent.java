/*##############################################################################
# Copyright 2021 IBM Corp. All Rights Reserved.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#   Unless required by applicable law or agreed to in writing, software
#   distributed under the License is distributed on an "AS IS" BASIS,
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#   See the License for the specific language governing permissions and
#   limitations under the License.
##############################################################################*/
package tat.microservice.bank.account.cmd.es.events;

public class AccountDeletedEvent {


	private String accountId;
	private double balance;
	private String customerSsn;

	public AccountDeletedEvent(String accountId, double balance, String customerSsn) {
		super();
		this.setAccountId(accountId);
		
		this.balance = balance;
		this.customerSsn = customerSsn;
	}

	public AccountDeletedEvent(String accountId) {
		super();
		this.setAccountId(accountId);
		
	}

	public String getAccountId() {
		return accountId;
	}

	@Override
	public String toString() {
		return "AccountDeletedEvent [accountId=" + accountId + ", balance=" + balance + ", customerSsn=" + customerSsn
				+ "]";
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerSsn() {
		return customerSsn;
	}

	public void setCustomerSsn(String customerSsn) {
		this.customerSsn = customerSsn;
	}

}
