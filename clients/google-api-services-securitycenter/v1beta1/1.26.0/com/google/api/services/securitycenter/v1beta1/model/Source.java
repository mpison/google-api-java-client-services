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

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * Cloud Security Command Center's (Cloud SCC) finding source. A finding source is an entity or a
 * mechanism that can produce a finding. A source is like a container of findings that come from the
 * same scanner, logger, monitor, etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Source extends com.google.api.client.json.GenericJson {

  /**
   * The description of the source (max of 1024 characters). Example: "Cloud Security Scanner is a
   * web security scanner for common vulnerabilities in App Engine applications. It can
   * automatically scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and outdated/insecure libraries."
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The source’s display name. A source’s display name must be unique amongst its siblings, for
   * example, two sources with the same parent can't share the same display name. The display name
   * must have a length between 1 and 64 characters (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/123/sources/456"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The description of the source (max of 1024 characters). Example: "Cloud Security Scanner is a
   * web security scanner for common vulnerabilities in App Engine applications. It can
   * automatically scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and outdated/insecure libraries."
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the source (max of 1024 characters). Example: "Cloud Security Scanner is a
   * web security scanner for common vulnerabilities in App Engine applications. It can
   * automatically scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and outdated/insecure libraries."
   * @param description description or {@code null} for none
   */
  public Source setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The source’s display name. A source’s display name must be unique amongst its siblings, for
   * example, two sources with the same parent can't share the same display name. The display name
   * must have a length between 1 and 64 characters (inclusive).
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The source’s display name. A source’s display name must be unique amongst its siblings, for
   * example, two sources with the same parent can't share the same display name. The display name
   * must have a length between 1 and 64 characters (inclusive).
   * @param displayName displayName or {@code null} for none
   */
  public Source setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/123/sources/456"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/123/sources/456"
   * @param name name or {@code null} for none
   */
  public Source setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Source set(String fieldName, Object value) {
    return (Source) super.set(fieldName, value);
  }

  @Override
  public Source clone() {
    return (Source) super.clone();
  }

}
