/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.unmarshallers;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * An unmarshaller that unmarshals DynamoDB NumberSets into sets of Java
 * {@code BigDecimal}s.
 */
public final class BigDecimalSetUnmarshaller extends NSUnmarshaller {

    private static final BigDecimalSetUnmarshaller INSTANCE =
            new BigDecimalSetUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link BigDecimalSetUnmarshaller}
     */
    public static BigDecimalSetUnmarshaller instance() {
        return INSTANCE;
    }

    private BigDecimalSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        final Set<BigDecimal> result = new HashSet<BigDecimal>();
        for (final String s : value.getNS()) {
            result.add(new BigDecimal(s));
        }
        return result;
    }
}
