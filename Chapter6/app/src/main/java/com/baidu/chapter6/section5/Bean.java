package com.baidu.chapter6.section5;


public class Bean {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"areaCode":"0871","city":"昆明","name":"中国电信","num":1890871,"postCode":"650000","prov":"云南","provCode":"530000","ret_code":0,"type":2}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * areaCode : 0871
     * city : 昆明
     * name : 中国电信
     * num : 1890871
     * postCode : 650000
     * prov : 云南
     * provCode : 530000
     * ret_code : 0
     * type : 2
     */

    private ShowapiResBodyEntity showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyEntity getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyEntity showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyEntity {
        private String areaCode;
        private String city;
        private String name;
        private int num;
        private String postCode;
        private String prov;
        private String provCode;
        private int ret_code;
        private int type;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getPostCode() {
            return postCode;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getProv() {
            return prov;
        }

        public void setProv(String prov) {
            this.prov = prov;
        }

        public String getProvCode() {
            return provCode;
        }

        public void setProvCode(String provCode) {
            this.provCode = provCode;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
