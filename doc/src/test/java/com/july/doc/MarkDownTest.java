package com.july.doc;

import com.july.doc.builder.JavaDocBuilder;
import com.july.doc.config.DocConstants;
import org.junit.jupiter.api.Test;

/**
 * @author zqk
 * @since 2020/1/25
 */
public class MarkDownTest {

    @Test
    public void test(){
        JavaDocBuilder javaDocBuilder = new JavaDocBuilder();
        javaDocBuilder.loadJavaFiles(DocConstants.sourcePath);
    }

}
