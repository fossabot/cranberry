/**
 * Copyright 2020 the project cranberry authors
 * and the original author or authors annotated by {@author}
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
package org.cranberry.statement.internal.exception;

/**
 * The type Not blank statement exception.
 * Thrown to indicate that a not empty statement has failed.
 * 
 * project cranberry
 * created 2020-03-20 15:15
 * 
 * @author Alexander A. Kropotin
 */
public final class NotBlankStatementException extends StatementException {

    /**
     * Use serialVersionUID for interoperability
     */
    private static final long serialVersionUID = -57L;

    /**
     * Overrides expected value by value of 'not empty'. Actual value could be defined
     * via constructors.
     */
    {
        this.expected = ValueWrapper.getInstance("not blank");
    }

    /**
     * Constructs an {@code NotBlankStatementException} without the
     * specified exception message, cause, and expected/actual values.
     * 
     * The expected value is defined by default.
     */
    public NotBlankStatementException() {
        super();
    }

    /**
     * Constructs an {@code NotBlankStatementException} with the
     * specified message, but without the specified expected/actual values and a cause.
     * 
     * The expected value is defined by default.
     * 
     * @param message the detail message; {@code null} or blank will be
     * converted to the empty {@code String}
     */
    public NotBlankStatementException(String message) {
        super(message);
    }

    /**
     * Constructs an {@code NotBlankStatementException} with the
     * specified actual value, but without the specified message, expected value and a cause.
     * 
     * The expected value is defined by default.
     * 
     * @param actual the actual value; may be {@code null}
     */
    public NotBlankStatementException(Object actual) {
        super(null, actual);
    }

    /**
     * Constructs an {@code NotBlankStatementException} with the specified message and
     * expected value, but without the specified expected value and cause.
     * 
     * The expected value is defined by default.
     * 
     * @param message the detail message; {@code null} or blank will be
     * converted to the empty {@code String}
     * @param actual the actual value; may be {@code null}
     */
    public NotBlankStatementException(String message, Object actual) {
        super(message, null, actual, null);
    }

    /**
     * Constructs an {@code NotBlankStatementException} with the
     * specified cause, but without the specified message and an expected/actual values.
     * 
     * The expected value is defined by default.
     *
     * @param  cause the cause, which is saved for later retrieval by the
     * {@link Throwable#getCause()}; a {@code null} value
     * is indicates that the cause is nonexistent or unknown.
     */
    public NotBlankStatementException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs an {@code NotBlankStatementException} with the specified message and cause
     * but without the specified expected/actual values.
     * 
     * The expected value is defined by default.
     * 
     * @param message the detail message; {@code null} or blank will be
     * converted to the empty {@code String}
     * @param cause the cause of the failure
     */
    public NotBlankStatementException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs an {@code NotBlankStatementException} with a message,
     * actual value, and a cause, but without the specified expected value.
     * 
     * The expected value is defined by default.
     * 
     * @param message the detail message; {@code null} or blank will be
     * converted to the empty {@code String}
     * @param actual the actual value; may be {@code null}
     * @param cause the cause of the failure
     */
    public NotBlankStatementException(String message, Object actual, Throwable cause) {
        super(message, null, actual, cause);
    }
}
