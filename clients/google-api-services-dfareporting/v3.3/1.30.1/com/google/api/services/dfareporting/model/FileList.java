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

package com.google.api.services.dfareporting.model;

/**
 * List of files for a report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FileList extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The files returned in this response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<File> items;

  static {
    // hack to force ProGuard to consider File used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(File.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#fileList".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Continuation token used to page through files. To retrieve the next page of results, set the
   * next request's "pageToken" to the value of this field. The page token is only valid for a
   * limited amount of time and should not be persisted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public FileList setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The files returned in this response.
   * @return value or {@code null} for none
   */
  public java.util.List<File> getItems() {
    return items;
  }

  /**
   * The files returned in this response.
   * @param items items or {@code null} for none
   */
  public FileList setItems(java.util.List<File> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#fileList".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#fileList".
   * @param kind kind or {@code null} for none
   */
  public FileList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Continuation token used to page through files. To retrieve the next page of results, set the
   * next request's "pageToken" to the value of this field. The page token is only valid for a
   * limited amount of time and should not be persisted.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token used to page through files. To retrieve the next page of results, set the
   * next request's "pageToken" to the value of this field. The page token is only valid for a
   * limited amount of time and should not be persisted.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public FileList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public FileList set(String fieldName, Object value) {
    return (FileList) super.set(fieldName, value);
  }

  @Override
  public FileList clone() {
    return (FileList) super.clone();
  }

}
