/*
 * Copyright (c) 2023 Oracle and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.helidon.inject.tests.inject.tbox.impl;

import java.util.Optional;

import io.helidon.inject.tests.inject.tbox.AbstractBlade;

/**
 * When a particular blade name is not "asked for" explicitly then we give out a dull blade.
 */
public class DullBlade extends AbstractBlade {

    @Override
    public Optional<String> named() {
        return Optional.of("dull blade");
    }

}