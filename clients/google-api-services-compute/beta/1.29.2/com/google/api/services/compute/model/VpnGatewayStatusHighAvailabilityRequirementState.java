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

package com.google.api.services.compute.model;

/**
 * Describes the high availability requirement state for the VPN connection between this Cloud VPN
 * gateway and a peer gateway.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VpnGatewayStatusHighAvailabilityRequirementState extends com.google.api.client.json.GenericJson {

  /**
   * Indicates the high availability requirement state for the VPN connection. Valid values are
   * CONNECTION_REDUNDANCY_MET, CONNECTION_REDUNDANCY_NOT_MET.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Indicates the reason why the VPN connection does not meet the high availability redundancy
   * criteria/requirement. Valid values is INCOMPLETE_TUNNELS_COVERAGE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unsatisfiedReason;

  /**
   * Indicates the high availability requirement state for the VPN connection. Valid values are
   * CONNECTION_REDUNDANCY_MET, CONNECTION_REDUNDANCY_NOT_MET.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Indicates the high availability requirement state for the VPN connection. Valid values are
   * CONNECTION_REDUNDANCY_MET, CONNECTION_REDUNDANCY_NOT_MET.
   * @param state state or {@code null} for none
   */
  public VpnGatewayStatusHighAvailabilityRequirementState setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Indicates the reason why the VPN connection does not meet the high availability redundancy
   * criteria/requirement. Valid values is INCOMPLETE_TUNNELS_COVERAGE.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnsatisfiedReason() {
    return unsatisfiedReason;
  }

  /**
   * Indicates the reason why the VPN connection does not meet the high availability redundancy
   * criteria/requirement. Valid values is INCOMPLETE_TUNNELS_COVERAGE.
   * @param unsatisfiedReason unsatisfiedReason or {@code null} for none
   */
  public VpnGatewayStatusHighAvailabilityRequirementState setUnsatisfiedReason(java.lang.String unsatisfiedReason) {
    this.unsatisfiedReason = unsatisfiedReason;
    return this;
  }

  @Override
  public VpnGatewayStatusHighAvailabilityRequirementState set(String fieldName, Object value) {
    return (VpnGatewayStatusHighAvailabilityRequirementState) super.set(fieldName, value);
  }

  @Override
  public VpnGatewayStatusHighAvailabilityRequirementState clone() {
    return (VpnGatewayStatusHighAvailabilityRequirementState) super.clone();
  }

}