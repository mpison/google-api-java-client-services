/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * Model definition for OrderCustomer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderCustomer extends com.google.api.client.json.GenericJson {

  /**
   * Full name of the customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullName;

  /**
   * Email address for the merchant to send value-added tax or invoice documentation of the order.
   * Only the last document sent is made available to the customer. For more information, see  About
   * automated VAT invoicing for Shopping Actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invoiceReceivingEmail;

  /**
   * Loyalty program information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderCustomerLoyaltyInfo loyaltyInfo;

  /**
   * Customer's marketing preferences. Contains the marketing opt-in information that is current at
   * the time that the merchant call. User preference selections can change from one order to the
   * next so preferences must be checked with every order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderCustomerMarketingRightsInfo marketingRightsInfo;

  /**
   * Full name of the customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullName() {
    return fullName;
  }

  /**
   * Full name of the customer.
   * @param fullName fullName or {@code null} for none
   */
  public OrderCustomer setFullName(java.lang.String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Email address for the merchant to send value-added tax or invoice documentation of the order.
   * Only the last document sent is made available to the customer. For more information, see  About
   * automated VAT invoicing for Shopping Actions.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvoiceReceivingEmail() {
    return invoiceReceivingEmail;
  }

  /**
   * Email address for the merchant to send value-added tax or invoice documentation of the order.
   * Only the last document sent is made available to the customer. For more information, see  About
   * automated VAT invoicing for Shopping Actions.
   * @param invoiceReceivingEmail invoiceReceivingEmail or {@code null} for none
   */
  public OrderCustomer setInvoiceReceivingEmail(java.lang.String invoiceReceivingEmail) {
    this.invoiceReceivingEmail = invoiceReceivingEmail;
    return this;
  }

  /**
   * Loyalty program information.
   * @return value or {@code null} for none
   */
  public OrderCustomerLoyaltyInfo getLoyaltyInfo() {
    return loyaltyInfo;
  }

  /**
   * Loyalty program information.
   * @param loyaltyInfo loyaltyInfo or {@code null} for none
   */
  public OrderCustomer setLoyaltyInfo(OrderCustomerLoyaltyInfo loyaltyInfo) {
    this.loyaltyInfo = loyaltyInfo;
    return this;
  }

  /**
   * Customer's marketing preferences. Contains the marketing opt-in information that is current at
   * the time that the merchant call. User preference selections can change from one order to the
   * next so preferences must be checked with every order.
   * @return value or {@code null} for none
   */
  public OrderCustomerMarketingRightsInfo getMarketingRightsInfo() {
    return marketingRightsInfo;
  }

  /**
   * Customer's marketing preferences. Contains the marketing opt-in information that is current at
   * the time that the merchant call. User preference selections can change from one order to the
   * next so preferences must be checked with every order.
   * @param marketingRightsInfo marketingRightsInfo or {@code null} for none
   */
  public OrderCustomer setMarketingRightsInfo(OrderCustomerMarketingRightsInfo marketingRightsInfo) {
    this.marketingRightsInfo = marketingRightsInfo;
    return this;
  }

  @Override
  public OrderCustomer set(String fieldName, Object value) {
    return (OrderCustomer) super.set(fieldName, value);
  }

  @Override
  public OrderCustomer clone() {
    return (OrderCustomer) super.clone();
  }

}
