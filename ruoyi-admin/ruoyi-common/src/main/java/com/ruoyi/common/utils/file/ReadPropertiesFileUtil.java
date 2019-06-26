package com.ruoyi.common.utils.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.Properties;

public class ReadPropertiesFileUtil implements Serializable {

    private static final long serialVersionUID = 8104947550728968943L;

    private static final Properties properties = new Properties();

    public static URL getWsdlFile(String filename) {

        URL url = null;
        try
        {
            return ReadPropertiesFileUtil.class.getClassLoader().getResource(filename);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return url;
        }
    }

}
