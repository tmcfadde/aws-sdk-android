/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeVpcEndpointServices.
 * </p>
 */
public class DescribeVpcEndpointServicesResult implements Serializable {

    /**
     * A list of supported AWS services.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceNames;

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     */
    private String nextToken;

    /**
     * A list of supported AWS services.
     *
     * @return A list of supported AWS services.
     */
    public java.util.List<String> getServiceNames() {
        if (serviceNames == null) {
              serviceNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              serviceNames.setAutoConstruct(true);
        }
        return serviceNames;
    }
    
    /**
     * A list of supported AWS services.
     *
     * @param serviceNames A list of supported AWS services.
     */
    public void setServiceNames(java.util.Collection<String> serviceNames) {
        if (serviceNames == null) {
            this.serviceNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(serviceNames.size());
        serviceNamesCopy.addAll(serviceNames);
        this.serviceNames = serviceNamesCopy;
    }
    
    /**
     * A list of supported AWS services.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceNames A list of supported AWS services.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointServicesResult withServiceNames(String... serviceNames) {
        if (getServiceNames() == null) setServiceNames(new java.util.ArrayList<String>(serviceNames.length));
        for (String value : serviceNames) {
            getServiceNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of supported AWS services.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceNames A list of supported AWS services.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointServicesResult withServiceNames(java.util.Collection<String> serviceNames) {
        if (serviceNames == null) {
            this.serviceNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(serviceNames.size());
            serviceNamesCopy.addAll(serviceNames);
            this.serviceNames = serviceNamesCopy;
        }

        return this;
    }

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @return The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointServicesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServiceNames() != null) sb.append("ServiceNames: " + getServiceNames() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServiceNames() == null) ? 0 : getServiceNames().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcEndpointServicesResult == false) return false;
        DescribeVpcEndpointServicesResult other = (DescribeVpcEndpointServicesResult)obj;
        
        if (other.getServiceNames() == null ^ this.getServiceNames() == null) return false;
        if (other.getServiceNames() != null && other.getServiceNames().equals(this.getServiceNames()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    