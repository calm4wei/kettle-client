package com.zqykj.kettle.tr;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * Created by weifeng on 2017/6/3.
 */
public class TextTransformation {

    public static void main(String[] args) throws KettleException {
        String fileName = "E:\\research\\kettle\\Tutorial\\hello.ktr";
        KettleEnvironment.init();
        EnvUtil.environmentInit();
        TransMeta transMeta = new TransMeta(fileName);
        Trans trans = new Trans(transMeta);
        trans.execute(null);
        trans.waitUntilFinished();
        if (trans.getErrors() > 0) {
            throw new RuntimeException("There were errors during transformation execution.");
        }

    }
}
