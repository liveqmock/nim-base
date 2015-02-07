package com.poweruniverse.nim.base.utils;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerUtils {
	public static String processTemplate(String templateString,Map<String, Object> root,File basePath ) throws Exception{
		Configuration cfg = new Configuration();
		cfg.setEncoding(Locale.CHINA, "UTF-8");
		if(basePath!=null){
			cfg.setDirectoryForTemplateLoading(basePath);
		}
		
		Properties p = new Properties();
		p.load(FreemarkerUtils.class.getResourceAsStream("/freemarker.properties"));
		cfg.setSettings(p);
		
		Template t = new Template("name", new StringReader(templateString),cfg);
		StringWriter writer = new StringWriter();
		t.process(root, writer);
		return writer.toString();
	}

}
