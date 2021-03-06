package org.c2stack.meta;

import java.io.IOException;
import java.io.InputStream;

/**
 * API to load chunked content from Java into Go
 */
public interface StreamSource {
    public InputStream getStream(String resourceId) throws IOException;
}
