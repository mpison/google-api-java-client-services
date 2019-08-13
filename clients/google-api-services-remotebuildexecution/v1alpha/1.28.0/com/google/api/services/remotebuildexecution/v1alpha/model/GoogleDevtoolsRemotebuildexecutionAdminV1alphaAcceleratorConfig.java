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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * AcceleratorConfig defines the accelerator cards to attach to the VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig extends com.google.api.client.json.GenericJson {

  /**
   * The number of the guest accelerator cards exposed to this VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long acceleratorCount;

  /**
   * The type of accelerator to attach to this VM, e.g. "nvidia-tesla-k80" for nVidia Tesla K80.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acceleratorType;

  /**
   * The number of the guest accelerator cards exposed to this VM.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAcceleratorCount() {
    return acceleratorCount;
  }

  /**
   * The number of the guest accelerator cards exposed to this VM.
   * @param acceleratorCount acceleratorCount or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig setAcceleratorCount(java.lang.Long acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
    return this;
  }

  /**
   * The type of accelerator to attach to this VM, e.g. "nvidia-tesla-k80" for nVidia Tesla K80.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcceleratorType() {
    return acceleratorType;
  }

  /**
   * The type of accelerator to attach to this VM, e.g. "nvidia-tesla-k80" for nVidia Tesla K80.
   * @param acceleratorType acceleratorType or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig setAcceleratorType(java.lang.String acceleratorType) {
    this.acceleratorType = acceleratorType;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig) super.clone();
  }

}