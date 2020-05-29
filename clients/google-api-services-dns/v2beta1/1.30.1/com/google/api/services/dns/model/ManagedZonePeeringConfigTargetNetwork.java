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

package com.google.api.services.dns.model;

/**
 * Model definition for ManagedZonePeeringConfigTargetNetwork.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedZonePeeringConfigTargetNetwork extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deactivateTime;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZonePeeringConfigTargetNetwork".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkUrl;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDeactivateTime() {
    return deactivateTime;
  }

  /**
   * @param deactivateTime deactivateTime or {@code null} for none
   */
  public ManagedZonePeeringConfigTargetNetwork setDeactivateTime(java.lang.String deactivateTime) {
    this.deactivateTime = deactivateTime;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZonePeeringConfigTargetNetwork".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZonePeeringConfigTargetNetwork".
   * @param kind kind or {@code null} for none
   */
  public ManagedZonePeeringConfigTargetNetwork setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkUrl() {
    return networkUrl;
  }

  /**
   * @param networkUrl networkUrl or {@code null} for none
   */
  public ManagedZonePeeringConfigTargetNetwork setNetworkUrl(java.lang.String networkUrl) {
    this.networkUrl = networkUrl;
    return this;
  }

  @Override
  public ManagedZonePeeringConfigTargetNetwork set(String fieldName, Object value) {
    return (ManagedZonePeeringConfigTargetNetwork) super.set(fieldName, value);
  }

  @Override
  public ManagedZonePeeringConfigTargetNetwork clone() {
    return (ManagedZonePeeringConfigTargetNetwork) super.clone();
  }

}
