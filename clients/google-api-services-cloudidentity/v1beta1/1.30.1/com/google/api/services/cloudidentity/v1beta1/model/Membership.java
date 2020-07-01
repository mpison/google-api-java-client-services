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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * A membership within the Cloud Identity Groups API.
 *
 * A `Membership` defines a relationship between a `Group` and an entity belonging to that `Group`,
 * referred to as a "member".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Membership extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the `Membership` was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Immutable. The `EntityKey` of the member.
   *
   * Either `member_key` or `preferred_member_key` must be set when calling
   * MembershipsService.CreateMembership but not both; both shall be set when returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EntityKey memberKey;

  /**
   * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the
   * `Membership`.
   *
   * Shall be of the form `groups/{group_id}/memberships/{membership_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. The `EntityKey` of the member.
   *
   * Either `member_key` or `preferred_member_key` must be set when calling
   * MembershipsService.CreateMembership but not both; both shall be set when returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EntityKey preferredMemberKey;

  /**
   * The `MembershipRole`s that apply to the `Membership`.
   *
   * If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`.
   *
   * Must not contain duplicate `MembershipRole`s with the same `name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MembershipRole> roles;

  /**
   * Output only. The type of the membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The time when the `Membership` was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time when the `Membership` was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the `Membership` was created.
   * @param createTime createTime or {@code null} for none
   */
  public Membership setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Immutable. The `EntityKey` of the member.
   *
   * Either `member_key` or `preferred_member_key` must be set when calling
   * MembershipsService.CreateMembership but not both; both shall be set when returned.
   * @return value or {@code null} for none
   */
  public EntityKey getMemberKey() {
    return memberKey;
  }

  /**
   * Immutable. The `EntityKey` of the member.
   *
   * Either `member_key` or `preferred_member_key` must be set when calling
   * MembershipsService.CreateMembership but not both; both shall be set when returned.
   * @param memberKey memberKey or {@code null} for none
   */
  public Membership setMemberKey(EntityKey memberKey) {
    this.memberKey = memberKey;
    return this;
  }

  /**
   * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the
   * `Membership`.
   *
   * Shall be of the form `groups/{group_id}/memberships/{membership_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the
   * `Membership`.
   *
   * Shall be of the form `groups/{group_id}/memberships/{membership_id}`.
   * @param name name or {@code null} for none
   */
  public Membership setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. The `EntityKey` of the member.
   *
   * Either `member_key` or `preferred_member_key` must be set when calling
   * MembershipsService.CreateMembership but not both; both shall be set when returned.
   * @return value or {@code null} for none
   */
  public EntityKey getPreferredMemberKey() {
    return preferredMemberKey;
  }

  /**
   * Required. Immutable. The `EntityKey` of the member.
   *
   * Either `member_key` or `preferred_member_key` must be set when calling
   * MembershipsService.CreateMembership but not both; both shall be set when returned.
   * @param preferredMemberKey preferredMemberKey or {@code null} for none
   */
  public Membership setPreferredMemberKey(EntityKey preferredMemberKey) {
    this.preferredMemberKey = preferredMemberKey;
    return this;
  }

  /**
   * The `MembershipRole`s that apply to the `Membership`.
   *
   * If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`.
   *
   * Must not contain duplicate `MembershipRole`s with the same `name`.
   * @return value or {@code null} for none
   */
  public java.util.List<MembershipRole> getRoles() {
    return roles;
  }

  /**
   * The `MembershipRole`s that apply to the `Membership`.
   *
   * If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`.
   *
   * Must not contain duplicate `MembershipRole`s with the same `name`.
   * @param roles roles or {@code null} for none
   */
  public Membership setRoles(java.util.List<MembershipRole> roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Output only. The type of the membership.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. The type of the membership.
   * @param type type or {@code null} for none
   */
  public Membership setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. The time when the `Membership` was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the `Membership` was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Membership setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Membership set(String fieldName, Object value) {
    return (Membership) super.set(fieldName, value);
  }

  @Override
  public Membership clone() {
    return (Membership) super.clone();
  }

}
