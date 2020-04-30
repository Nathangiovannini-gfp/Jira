/*
 * $Header: /cvsroot/main/PATCHED/commons-httpclient-3.0/src/java/org/apache/commons/httpclient/MethodRetryHandler.java,v 1.1 2007-08-07 21:54:20 sereda Exp $
 * $Revision: 1.1 $
 * $Date: 2007-08-07 21:54:20 $
 *
 * ====================================================================
 *
 *  Copyright 1999-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.commons.httpclient;

/**
 * A handler for determining if an HttpMethod should be retried after a 
 * recoverable exception during execution.
 * 
 * @see HttpMethod#execute(HttpState, HttpConnection)
 * @see HttpRecoverableException
 * 
 * @deprecated use {@link HttpMethodRetryHandler}
 * 
 * @author Michael Becke
 */
public interface MethodRetryHandler {

    /**
     * Determines if a method should be retried after an HttpRecoverableException
     * occurs during execution.
     * 
     * @param method the method being executed
     * @param connection the connection the method is using
     * @param recoverableException the exception that occurred
     * @param executionCount the number of times this method has been 
     * unsuccessfully executed
     * @param requestSent this argument is unused and will be removed in the future. 
     *   {@link HttpMethod#isRequestSent()} should be used instead
     * 
     * @return <code>true</code> if the method should be retried, <code>false</code>
     * otherwise
     */
    boolean retryMethod(
        HttpMethod method, 
        HttpConnection connection,
        HttpRecoverableException recoverableException,
        int executionCount,
        boolean requestSent);

}