package com.july.doc.resolver.javaparser.converter;

import com.july.doc.tag.DocTag;
import com.july.doc.tag.ParamObjTagImpl;
import com.july.doc.tag.SeeTagImpl;

public class ParamObjTagConverter extends SeeTagConverter {

    @Override
    public DocTag converter(String comment) {
        SeeTagImpl seeTag = (SeeTagImpl) super.converter(comment);
        if (seeTag != null) {
            return new ParamObjTagImpl(seeTag.getTagName(), seeTag.getValues());
        }
        return null;
    }
}
