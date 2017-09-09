package org.eurekaclinical.registry.client;

/*-
 * #%L
 * Eureka! Clinical Registry Client
 * %%
 * Copyright (C) 2017 Emory University
 * %%
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
 * #L%
 */

import java.net.URI;
import org.eurekaclinical.common.comm.clients.AuthorizingEurekaClinicalClient;


/**
 * A basic Eureka! Clinical REST API client for a microservice that implements
 * the users and roles APIs.
 */
public class EurekaClinicalRegistryClient extends AuthorizingEurekaClinicalClient {

    private final URI resourceUrl;

    /**
     * Constructs the REST client with the provided base URL for the service's
     * REST resources.
     * 
     * @param inResourceUrl the base URL for the service's rest resources. For
     * example, if the the users resource is
     * <code>https://mydomain.org/eurekaclinical-mymicroservice-service/api/protected/users</code>, 
     * then this argument should be
     * <code>https://mydomain.org/eurekaclinical-mymicroservice-service</code>.
     */
    public EurekaClinicalRegistryClient(String inResourceUrl) {
        super(null);
        this.resourceUrl = URI.create(inResourceUrl);
    }

    /**
     * Returns the base URL for the service's REST resources as a URI.
     * 
     * @return a URI.
     */
    @Override
    protected URI getResourceUrl() {
        return this.resourceUrl;
    }

}
