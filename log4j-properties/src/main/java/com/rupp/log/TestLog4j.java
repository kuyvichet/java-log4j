/***/
package com.rupp.log;

import org.apache.log4j.Logger;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2017
 */
public class TestLog4j {
    
    final static Logger logger = Logger.getLogger(TestLog4j.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        final TestLog4j obj = new TestLog4j();
        obj.runMe("myTestLog");
    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }
}
