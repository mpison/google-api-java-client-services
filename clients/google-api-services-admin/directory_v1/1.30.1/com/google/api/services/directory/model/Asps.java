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

package com.google.api.services.directory.model;

/**
 * Model definition for Asps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Asps extends com.google.api.client.json.GenericJson {

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * A list of ASP resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Asp> items;

  static {
    // hack to force ProGuard to consider Asp used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Asp.class);
  }

  /**
   * The type of the API resource. This is always admin#directory#aspList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public Asps setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A list of ASP resources.
   * @return value or {@code null} for none
   */
  public java.util.List<Asp> getItems() {
    return items;
  }

  /**
   * A list of ASP resources.
   * @param items items or {@code null} for none
   */
  public Asps setItems(java.util.List<Asp> items) {
    this.items = items;
    return this;
  }

  /**
   * The type of the API resource. This is always admin#directory#aspList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the API resource. This is always admin#directory#aspList.
   * @param kind kind or {@code null} for none
   */
  public Asps setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public Asps set(String fieldName, Object value) {
    return (Asps) super.set(fieldName, value);
  }

  @Override
  public Asps clone() {
    return (Asps) super.clone();
  }

}