/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

/**
* Specifies the values to use to join the virtual machine to the domain.
*/
public class DomainJoinCredentials {
    private String domain;
    
    /**
    * Optional. Specifies the name of the domain used to authenticate an
    * account. The value is a fully qualified DNS domain. If the domains name
    * is not specified, Username must specify the user principal name (UPN)
    * format (user@fully-qualified-DNS-domain) or the
    * fully-qualified-DNS-domain\\username format. Example: example.com.
    * @return The Domain value.
    */
    public String getDomain() {
        return this.domain;
    }
    
    /**
    * Optional. Specifies the name of the domain used to authenticate an
    * account. The value is a fully qualified DNS domain. If the domains name
    * is not specified, Username must specify the user principal name (UPN)
    * format (user@fully-qualified-DNS-domain) or the
    * fully-qualified-DNS-domain\\username format. Example: example.com.
    * @param domainValue The Domain value.
    */
    public void setDomain(final String domainValue) {
        this.domain = domainValue;
    }
    
    private String password;
    
    /**
    * Required. Specifies the password to use to join the domain.
    * @return The Password value.
    */
    public String getPassword() {
        return this.password;
    }
    
    /**
    * Required. Specifies the password to use to join the domain.
    * @param passwordValue The Password value.
    */
    public void setPassword(final String passwordValue) {
        this.password = passwordValue;
    }
    
    private String userName;
    
    /**
    * Required. Specifies a user name in the domain that can be used to join
    * the domain.
    * @return The UserName value.
    */
    public String getUserName() {
        return this.userName;
    }
    
    /**
    * Required. Specifies a user name in the domain that can be used to join
    * the domain.
    * @param userNameValue The UserName value.
    */
    public void setUserName(final String userNameValue) {
        this.userName = userNameValue;
    }
    
    /**
    * Initializes a new instance of the DomainJoinCredentials class.
    *
    */
    public DomainJoinCredentials() {
    }
    
    /**
    * Initializes a new instance of the DomainJoinCredentials class with
    * required arguments.
    *
    * @param userName The user name.
    * @param password The password.
    */
    public DomainJoinCredentials(String userName, String password) {
        if (userName == null) {
            throw new NullPointerException("userName");
        }
        if (password == null) {
            throw new NullPointerException("password");
        }
        this.setUserName(userName);
        this.setPassword(password);
    }
}
