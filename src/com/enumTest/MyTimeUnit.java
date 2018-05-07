package com.enumTest;

import java.util.concurrent.TimeUnit;

public enum MyTimeUnit {

    MINUTES {
        public String show()   { return "SHOW MINUTES"; }
    },

    HOUR {
        public String show()   { return "SHOW HOUR"; }
    },

    SECOND {
        public String show()   { return "SHOW SECOND"; }
    };


    public String show(){ return null;}


}
