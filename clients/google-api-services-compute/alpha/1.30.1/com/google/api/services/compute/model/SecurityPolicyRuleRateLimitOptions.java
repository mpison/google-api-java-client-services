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
 * Model definition for SecurityPolicyRuleRateLimitOptions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityPolicyRuleRateLimitOptions extends com.google.api.client.json.GenericJson {

  /**
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key
   * will be banned for the configured 'ban_duration' when the number of requests that exceed the
   * 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer banDurationSec;

  /**
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key
   * will be banned for the configured 'ban_duration' when the number of requests that exceed the
   * 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleRateLimitOptionsThreshold banThreshold;

  /**
   * Can only be specified if the action for the rule is "rate_based_ban" If specified, determines
   * the time (in seconds) the traffic will continue to be blocked by the rate limit after the rate
   * falls below the threshold. The default value is 0 seconds. [Deprecated] This field is
   * deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer blockDuration;

  /**
   * Action to take when requests are under the given threshold. When requests are throttled, this
   * is also the action for all requests which are not dropped. Valid options are "allow",
   * "fairshare", and "drop_overload".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conformAction;

  /**
   * Determines the key to enforce the threshold_rps limit on. If key is "IP", each IP has this
   * limit enforced separately, whereas "ALL_IPs" means a single limit is applied to all requests
   * matching this rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enforceOnKey;

  /**
   * When a request is denied, returns the HTTP response code specified. Valid options are "deny()"
   * where valid values for status are 403, 404, 429, and 502.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exceedAction;

  /**
   * Threshold at which to begin ratelimiting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleRateLimitOptionsThreshold rateLimitThreshold;

  /**
   * Rate in requests per second at which to begin ratelimiting. [Deprecated] This field is
   * deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer thresholdRps;

  /**
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key
   * will be banned for the configured 'ban_duration' when the number of requests that exceed the
   * 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBanDurationSec() {
    return banDurationSec;
  }

  /**
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key
   * will be banned for the configured 'ban_duration' when the number of requests that exceed the
   * 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * @param banDurationSec banDurationSec or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions setBanDurationSec(java.lang.Integer banDurationSec) {
    this.banDurationSec = banDurationSec;
    return this;
  }

  /**
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key
   * will be banned for the configured 'ban_duration' when the number of requests that exceed the
   * 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptionsThreshold getBanThreshold() {
    return banThreshold;
  }

  /**
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key
   * will be banned for the configured 'ban_duration' when the number of requests that exceed the
   * 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * @param banThreshold banThreshold or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions setBanThreshold(SecurityPolicyRuleRateLimitOptionsThreshold banThreshold) {
    this.banThreshold = banThreshold;
    return this;
  }

  /**
   * Can only be specified if the action for the rule is "rate_based_ban" If specified, determines
   * the time (in seconds) the traffic will continue to be blocked by the rate limit after the rate
   * falls below the threshold. The default value is 0 seconds. [Deprecated] This field is
   * deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBlockDuration() {
    return blockDuration;
  }

  /**
   * Can only be specified if the action for the rule is "rate_based_ban" If specified, determines
   * the time (in seconds) the traffic will continue to be blocked by the rate limit after the rate
   * falls below the threshold. The default value is 0 seconds. [Deprecated] This field is
   * deprecated.
   * @param blockDuration blockDuration or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions setBlockDuration(java.lang.Integer blockDuration) {
    this.blockDuration = blockDuration;
    return this;
  }

  /**
   * Action to take when requests are under the given threshold. When requests are throttled, this
   * is also the action for all requests which are not dropped. Valid options are "allow",
   * "fairshare", and "drop_overload".
   * @return value or {@code null} for none
   */
  public java.lang.String getConformAction() {
    return conformAction;
  }

  /**
   * Action to take when requests are under the given threshold. When requests are throttled, this
   * is also the action for all requests which are not dropped. Valid options are "allow",
   * "fairshare", and "drop_overload".
   * @param conformAction conformAction or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions setConformAction(java.lang.String conformAction) {
    this.conformAction = conformAction;
    return this;
  }

  /**
   * Determines the key to enforce the threshold_rps limit on. If key is "IP", each IP has this
   * limit enforced separately, whereas "ALL_IPs" means a single limit is applied to all requests
   * matching this rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnforceOnKey() {
    return enforceOnKey;
  }

  /**
   * Determines the key to enforce the threshold_rps limit on. If key is "IP", each IP has this
   * limit enforced separately, whereas "ALL_IPs" means a single limit is applied to all requests
   * matching this rule.
   * @param enforceOnKey enforceOnKey or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions setEnforceOnKey(java.lang.String enforceOnKey) {
    this.enforceOnKey = enforceOnKey;
    return this;
  }

  /**
   * When a request is denied, returns the HTTP response code specified. Valid options are "deny()"
   * where valid values for status are 403, 404, 429, and 502.
   * @return value or {@code null} for none
   */
  public java.lang.String getExceedAction() {
    return exceedAction;
  }

  /**
   * When a request is denied, returns the HTTP response code specified. Valid options are "deny()"
   * where valid values for status are 403, 404, 429, and 502.
   * @param exceedAction exceedAction or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions setExceedAction(java.lang.String exceedAction) {
    this.exceedAction = exceedAction;
    return this;
  }

  /**
   * Threshold at which to begin ratelimiting.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptionsThreshold getRateLimitThreshold() {
    return rateLimitThreshold;
  }

  /**
   * Threshold at which to begin ratelimiting.
   * @param rateLimitThreshold rateLimitThreshold or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions setRateLimitThreshold(SecurityPolicyRuleRateLimitOptionsThreshold rateLimitThreshold) {
    this.rateLimitThreshold = rateLimitThreshold;
    return this;
  }

  /**
   * Rate in requests per second at which to begin ratelimiting. [Deprecated] This field is
   * deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getThresholdRps() {
    return thresholdRps;
  }

  /**
   * Rate in requests per second at which to begin ratelimiting. [Deprecated] This field is
   * deprecated.
   * @param thresholdRps thresholdRps or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions setThresholdRps(java.lang.Integer thresholdRps) {
    this.thresholdRps = thresholdRps;
    return this;
  }

  @Override
  public SecurityPolicyRuleRateLimitOptions set(String fieldName, Object value) {
    return (SecurityPolicyRuleRateLimitOptions) super.set(fieldName, value);
  }

  @Override
  public SecurityPolicyRuleRateLimitOptions clone() {
    return (SecurityPolicyRuleRateLimitOptions) super.clone();
  }

}
