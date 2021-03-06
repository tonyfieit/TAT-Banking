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
package tat.microservice.bank.customer.cmd.es.services;

import java.util.concurrent.CompletableFuture;

import tat.microservice.bank.customer.cmd.es.commands.dto.CreateCustomerDto;
import tat.microservice.bank.customer.cmd.es.commands.dto.DeleteCustomerProfileDto;
import tat.microservice.bank.customer.cmd.es.commands.dto.UpdateCustomerProfileDto;
import tat.microservice.bank.customer.cmdquery.es.response.BaseResponse;


public interface CustomerCommandServices {

	public  CompletableFuture<String> createCustomer(CreateCustomerDto createCustomerDto);

	public BaseResponse updateCustomer(String customer_ssn, UpdateCustomerProfileDto updateCustomerProfileDto);
	//public CompletableFuture<String> deleteCustomer(String customerSsn,	DeleteCustomerProfileDto deleteCustomerProfileDto);
	public BaseResponse deleteCustomer(String customerSsn) ;

}
