/*
 * Copyright 2009 University Corporation for Advanced Internet Development, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensaml.ws.wssecurity.impl;

import org.opensaml.ws.wssecurity.EncodedString;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.MarshallingException;
import org.opensaml.xml.util.DatatypeHelper;
import org.w3c.dom.Element;

/**
 * Marshaller for instances of {@link EncodedString}.
 */
public class EncodedStringMarshaller extends AttributedStringMarshaller {

    /** {@inheritDoc} */
    protected void marshallAttributes(XMLObject xmlObject, Element domElement) throws MarshallingException {
        EncodedString encodedString = (EncodedString) xmlObject;
        if (!DatatypeHelper.isEmpty(encodedString.getEncodingType())){
            domElement.setAttributeNS(null, EncodedString.ENCODING_TYPE_ATTRIB_NAME, encodedString.getEncodingType());
        }
        super.marshallAttributes(xmlObject, domElement);
    }
    
}
