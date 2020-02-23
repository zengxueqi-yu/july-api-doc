package com.july.doc.builder;

import com.july.doc.config.DocConstants;
import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zqk
 * @since 2020/1/25
 */
public class JavaDocBuilder {

    private Map<String, JavaClass> javaFilesMap = new ConcurrentHashMap<>();
    private Collection<JavaClass> javaClasses;
    private JavaProjectBuilder builder;

    public void loadJavaFiles(String sourcePath) {
        JavaProjectBuilder builder = new JavaProjectBuilder();
        builder.addSourceTree(new File(DocConstants.sourcePath));
        this.builder = builder;
        this.javaClasses = builder.getClasses();
        for (JavaClass cls : javaClasses) {
            //获取类的所有注解，判断是否为controller控制器
            List<JavaAnnotation> javaAnnotations = cls.getAnnotations();
            if(!CollectionUtils.isEmpty(javaAnnotations)) {
                throw new RuntimeException("没有找到控制器信息");
            }
            for (JavaAnnotation javaAnnotation : javaAnnotations) {
                if(DocConstants.controller.equals(javaAnnotation.getType().getName())
                        || DocConstants.restController.equals(javaAnnotation.getType().getName())){
                    javaFilesMap.put(cls.getFullyQualifiedName(), cls);
                }
            }
        }
    }

}
