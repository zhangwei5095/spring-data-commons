/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.repository.inmemory.map;

import org.springframework.data.repository.inmemory.GenericInMemoryRepositoryUnitTests;
import org.springframework.data.repository.inmemory.InMemoryRepositoryFactory;
import org.springframework.data.repository.inmemory.Person;

/**
 * @author Christoph Strobl
 */
public class MapRepositoryUnitTests extends GenericInMemoryRepositoryUnitTests {

	@Override
	protected InMemoryRepositoryFactory<org.springframework.data.repository.inmemory.Person, String> getRepositoryFactory() {
		return new MapBackedRepositoryFactory<Person, String>(new MapTemplate());
	}

}
