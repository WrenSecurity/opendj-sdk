/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at legal-notices/CDDLv1_0.txt
 * or http://forgerock.org/license/CDDLv1.0.html.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at legal-notices/CDDLv1_0.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information:
 *      Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 *
 *
 *      Copyright 2009 Sun Microsystems, Inc.
 */

package org.forgerock.opendj.ldap.schema;

import org.forgerock.i18n.LocalizableMessage;
import org.forgerock.i18n.LocalizedIllegalArgumentException;

/**
 * Thrown when addition of a schema element to a schema builder fails because
 * the OID of the schema element conflicts with an existing schema element and
 * the caller explicitly requested not to override existing schema elements.
 */
@SuppressWarnings("serial")
public class ConflictingSchemaElementException extends LocalizedIllegalArgumentException {
    /**
     * Creates a new conflicting schema element exception with the provided
     * message.
     *
     * @param message
     *            The message that explains the problem that occurred.
     */
    public ConflictingSchemaElementException(final LocalizableMessage message) {
        super(message);
    }
}
