package com.july.doc.resolver.javaparser.converter;

import com.july.doc.tag.DocTag;
import com.july.doc.tag.DocTagImpl;
import com.july.doc.utils.CommentUtils;

/**
 * 基于JavaParser包的默认注释解析转换器
 *
 * @author leaf
 * @date 2017/3/4
 */
public class DefaultJavaParserTagConverterImpl implements JavaParserTagConverter<String> {

    @Override
    public DocTag converter(String comment) {
        String tagType = CommentUtils.getTagType(comment);
        String coment = comment.substring(tagType.length()).trim();
        return new DocTagImpl(tagType, coment);
    }
}
