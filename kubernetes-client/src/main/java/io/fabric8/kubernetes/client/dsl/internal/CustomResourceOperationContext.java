/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.dsl.internal;

import java.util.Map;

import io.fabric8.kubernetes.api.model.DeletionPropagation;
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinition;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.dsl.base.CustomResourceDefinitionContext;
import io.fabric8.kubernetes.client.dsl.base.OperationContext;
import okhttp3.OkHttpClient;

public class CustomResourceOperationContext extends OperationContext {
  
  protected CustomResourceDefinitionContext crdContext;
  protected Class type;
  protected Class listType;
  protected Class doneableType;

  public CustomResourceOperationContext() {
  }

  public CustomResourceOperationContext(OkHttpClient client, Config config, String plural, String namespace, String name, String apiGroupName, String apiGroupVersion, boolean cascading, Object item, Map<String, String> labels, Map<String, String[]> labelsNot, Map<String, String[]> labelsIn, Map<String, String[]> labelsNotIn, Map<String, String> fields, Map<String, String[]> fieldsNot, String resourceVersion, boolean reloadingFromServer, long gracePeriodSeconds, DeletionPropagation propagationPolicy,  long watchRetryInitialBackoffMillis, double watchRetryBackoffMultiplier, boolean namespaceFromGlobalConfig, CustomResourceDefinitionContext crdContext, Class type, Class listType, Class doneableType) {
    super(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading, item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig);
    this.crdContext = crdContext;
    this.type = type;
    this.listType = listType;
    this.doneableType = doneableType;
  }

  public CustomResourceDefinitionContext getCrdContext() {
    return crdContext;
  }

  public Class getType() {
    return type;
  }

  public Class getListType() {
    return listType;
  }

  public Class getDoneableType() {
    return doneableType;
  }

  public CustomResourceOperationContext withOkhttpClient(OkHttpClient client) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig, crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withConfig(Config config) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withPlural(String plural) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withNamespace(String namespace) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withName(String name) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withApiGroupName(String apiGroupName) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withApiGroupVersion(String apiGroupVersion) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  @Override
  public CustomResourceOperationContext withItem(Object item) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withCascading(boolean cascading) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withLabels(Map<String, String> labels) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withLabelsIn(Map<String, String[]> labelsIn) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withLabelsNot(Map<String, String[]> labelsNot) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withLabelsNotIn(Map<String, String[]> labelsNotIn) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withFields(Map<String, String> fields) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withFieldsNot(Map<String, String[]> fieldsNot) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withResourceVersion(String resourceVersion) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withReloadingFromServer(boolean reloadingFromServer) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withGracePeriodSeconds(long gracePeriodSeconds) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withPropagationPolicy(DeletionPropagation propagationPolicy) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  /**
   * @deprecated use {@link #withCrdContext(CustomResourceDefinitionContext)} instead
   */
  @Deprecated
  public CustomResourceOperationContext withCrd(CustomResourceDefinition crd) {
    return withCrdContext(CustomResourceDefinitionContext.fromCrd(crd));
  }

  public CustomResourceOperationContext withCrdContext(CustomResourceDefinitionContext crdContext) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withType(Class type) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withListType(Class listType) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }

  public CustomResourceOperationContext withDoneableType(Class doneableType) {
    return new CustomResourceOperationContext(client, config, plural, namespace, name, apiGroupName, apiGroupVersion, cascading,item, labels, labelsNot, labelsIn, labelsNotIn, fields, fieldsNot, resourceVersion, reloadingFromServer, gracePeriodSeconds, propagationPolicy, watchRetryInitialBackoffMillis, watchRetryBackoffMultiplier, namespaceFromGlobalConfig,  crdContext, type, listType, doneableType);
  }
}
