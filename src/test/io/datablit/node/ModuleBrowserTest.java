package io.datablit.node;

import io.datablit.meta.*;
import io.datablit.meta.yang.YangModule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class ModuleBrowserTest {

    @Test
    public void testRootSelector() {
        ModuleBrowser b = new ModuleBrowser(YangModule.YANG);
//        Selection s = b.getRootSelector();
//        Selection ms = Walk.walk(s, new BrowsePath("module"));
//        assertNotNull(ms);
//        assertEquals("module", ms.meta.getIdent());
//        assertNotNull(ms.meta);
//        ms.position = MetaUtil.findByIdent(ms.meta, "prefix");
//        assertNotNull(ms.position);
//        BrowseValue v = ms.read.read();
//        assertEquals("yang", v.str);
    }
}
